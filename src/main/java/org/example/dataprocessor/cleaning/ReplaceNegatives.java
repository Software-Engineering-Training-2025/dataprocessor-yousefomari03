package org.example.dataprocessor.cleaning;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNegatives implements CleaningInterface {


    @Override
    public List<Integer> clean(List<Integer> list) {
        List<Integer> newList = new ArrayList<Integer>();
        for (int i : list) {
            newList.add(Math.max(i, 0));
        }
        return newList;
    }
}

