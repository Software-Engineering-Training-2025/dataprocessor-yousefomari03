package org.example.dataprocessor.cleaning;

import java.util.ArrayList;
import java.util.List;

public class RemoveNegatives implements CleaningInterface {
    @Override
    public List<Integer> clean(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for(int i:list){
            if(i>=0) newList.add(i);
        }
        return newList;
    }

}
