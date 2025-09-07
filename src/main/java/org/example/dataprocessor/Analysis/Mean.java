package org.example.dataprocessor.Analysis;

import java.util.List;

public class Mean implements AnalysisInterface {
    @Override
    public Double Analysis(List<Integer> list) {
        if (list.isEmpty() ) return Double.NaN;
        else {
            double sum = 0.0;
            for (int i : list) {
                sum += i;
            }
            return (double) sum / list.size();
        }
    }
}
