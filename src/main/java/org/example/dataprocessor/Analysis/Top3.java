package org.example.dataprocessor.Analysis;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Top3 implements AnalysisInterface
{
    @Override
    public Double Analysis(List<Integer> list) {
        Map<Integer, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        double m =frequencyMap.values()
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToLong(item -> item)
                .sum();;
        return m ;
    }

}
