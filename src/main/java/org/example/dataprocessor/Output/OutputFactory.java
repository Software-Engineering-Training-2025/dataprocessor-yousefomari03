package org.example.dataprocessor.Output;

import org.example.dataprocessor.Analysis.AnalysisInterface;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.OutputType;

public class OutputFactory {
    public static OutputInterface getOutput(OutputType type) {
        if (type == OutputType.CONSOLE){
            return new Console();
        }
        if (type == OutputType.TEXT_FILE){
            return new TextFile();
        }
        return null;
    }
}
