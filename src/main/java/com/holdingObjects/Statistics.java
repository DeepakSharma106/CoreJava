package com.holdingObjects;

import java.util.*;

public class Statistics {

    // display power of Map
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,5);

        SortedMap<Integer, Integer> result = new TreeMap<>();
        int counter = 0;
        for(Integer i : list){
            // check if it already exist in map
            Integer freq = result.get(i);
            if(freq == null)
                counter = 1;
            else
                counter = counter + 1;
            result.put(i, counter);
        }
        System.out.println(result);
    }
}
