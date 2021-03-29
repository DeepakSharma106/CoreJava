package com.holdingObjects;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    private String[] sarray = "take the long path of short path but eventually you have to go somewhere".split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < sarray.length;
            }

            @Override
            public String next() {
                return sarray[index++];
            }

        };

    }

    public static void main(String[] args) {
        //for each loop now can be used since now our class implement iterable interface
        for(String s : new IterableClass()){
            System.out.print(s+" ");
        }
    }
}
