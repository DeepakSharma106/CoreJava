package com.Strings;

import java.util.Arrays;

public class Splitting {
    public static String knights = "we nare doing 123 it together so you n78 n ..... & should be doing 100it otherwise we may cost you the fire and all hell break loose";

    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+"); //non word character (including digits and alphabets)
        split("n\\W+"); //n followed by a non word
        split("n\\w+");
    }
}
