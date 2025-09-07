package org.example.dataprocessor;

import org.example.dataprocessor.Analysis.AnalysisFactory;
import org.example.dataprocessor.Output.OutputFactory;
import org.example.dataprocessor.cleaning.CleaningFactory;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * Students ONLY implement the process(...) method below.
 *
 * Requirements:
 * - Order: Clean -> Analyze -> Output -> Return result
 * - Do NOT mutate the original input list
 * - Handle empties as specified in AnalysisType docs
 * - Output format EXACTLY: "Result = <value>"
 * - TEXT_FILE path: target/result.txt (create parent dirs, overwrite file)
 */
public class DataProcessorService {

    /**
     * Implement this method.
     */
    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {



        List<Integer> Cleanlist = CleaningFactory.getCleaning(cleaningType).clean(data);
        double Analysislist = AnalysisFactory.getAnalysis(analysisType).Analysis(data);
        OutputFactory.getOutput(outputType).output(Analysislist);

        return  Analysislist;
    }
}

