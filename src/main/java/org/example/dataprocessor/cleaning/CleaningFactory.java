package org.example.dataprocessor.cleaning;

import org.example.dataprocessor.enums.CleaningType;

public class CleaningFactory {
    public static CleaningInterface getCleaning(CleaningType type)
    {
        if (type == CleaningType.REMOVE_NEGATIVES){
            return new RemoveNegatives();
        }
        if (type == CleaningType.REPLACE_NEGATIVES_WITH_ZERO){
            return new ReplaceNegatives();
        }
        throw new RuntimeException();
    }
}
