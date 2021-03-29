package com.recursion;

public class ComplexityAnalysis {

    public static void main(String[] args) {
        // linear complexity
        int m = 0;
        for (int i = 0; i < 10; i++) {
            m = m + 2;
        }
        System.out.println("m is "+m);
    }
}
