package com.holdingObjects;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfIntegers {

    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> setofInteger = new HashSet<>();
        // run a loop 1000 times , and do a number insertion between 1 and 20
        for (int i = 0; i < 10000; i++) {
            setofInteger.add(random.nextInt(20));
        }
        setofInteger.add(5);

        System.out.println(setofInteger);
    }
}
