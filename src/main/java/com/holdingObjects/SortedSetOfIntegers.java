package com.holdingObjects;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfIntegers {

    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(22);set.add(68);set.add(11);set.add(2);set.add(45);set.add(11);set.add(22);
        System.out.println(set);

        System.out.println(set.contains(11));
        System.out.println(set.contains(111));
    }
}
