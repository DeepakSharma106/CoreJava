package com.holdingObjects;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        intList.add(2);
        for (Integer i :
                intList) {
            System.out.print(i + " ");

        }
    }
}
