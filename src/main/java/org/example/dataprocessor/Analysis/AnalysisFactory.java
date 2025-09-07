package org.example.dataprocessor.Analysis;

import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
    public static AnalysisInterface getAnalysis(AnalysisType type) {
        if (type == AnalysisType.MEAN) {
            return new Mean();
        }
        if (type == AnalysisType.MEDIAN) {
            return new Median();
        }
        if (type == AnalysisType.STD_DEV) {
            return new StdDev();
        }
        if (type == AnalysisType.P90_NEAREST_RANK){
            return new P90();
        }
        if (type == AnalysisType.TOP3_FREQUENT_COUNT_SUM){
            return new Top3();
        }
        return null;
    }
}
