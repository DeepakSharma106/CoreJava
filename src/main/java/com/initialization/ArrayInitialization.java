package com.initialization;

import java.util.Arrays;
import java.util.Random;

public class ArrayInitialization {

    public static void main(String[] args) {
        int[] a1;
        int[] a2 = {1, 2, 3, 4, 5, 6};
        a1 = a2;
        for (int i = 0; i < a1.length; i++) {
            a1[i] = a1[i] * 2;
        }
        System.out.println(Arrays.toString(a2));

        //randomly assigning the length of array
        Random random = new Random(47);
        int[] a3;
        a3 = new int[random.nextInt(15)];

        System.out.println(Arrays.toString(a3));
        for (int i = 0; i < a3.length; i++) {
            a3[i] = random.nextInt(200);
        }

        System.out.println(Arrays.toString(a3));

        for(String s : args){
            System.out.print(s+" , ");
        }
    }

}
