package org.example.dataprocessor.Analysis;

import java.util.List;

public class P90 implements AnalysisInterface {
    @Override
    public Double Analysis(List<Integer> list) {
        list = list.stream().sorted().toList();
        int n = (int) Math.ceil(0.90 * list.size());
        if (list.isEmpty())
            return Double.NaN;
        double m=list.get(n - 1) ;
        return m ;

    }
}
