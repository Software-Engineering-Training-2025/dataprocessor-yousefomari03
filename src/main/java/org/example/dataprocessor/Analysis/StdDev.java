package org.example.dataprocessor.Analysis;
import java.util.List;

public class StdDev implements AnalysisInterface {
    @Override
    public Double Analysis(List<Integer>list)
    {
        if (list.isEmpty() ) return Double.NaN;
        double mean= list.stream().
                mapToDouble(item ->(double) item).
                average().
                orElse(Double.NaN);
        double sum = list.stream().
                mapToDouble(item -> (item-mean)*(item-mean)).
                sum();
        return Math.sqrt(sum/list.size());
    }
}
