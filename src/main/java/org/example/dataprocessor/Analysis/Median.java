package org.example.dataprocessor.Analysis;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class Median implements AnalysisInterface {
    @Override
    public Double Analysis(List<Integer> list) {


        if (list.isEmpty() || list == null) return Double.NaN;

        List<Integer> copylist = new ArrayList<>(list);
        sort(copylist);
        if (copylist.size() % 2 == 0)
            return (copylist.get(copylist.size() / 2) + copylist.get(copylist.size() / 2 - 1)) / 2.0;
        else{
            double n=copylist.get(copylist.size() / 2) ;
            return n;
        }

    }

}