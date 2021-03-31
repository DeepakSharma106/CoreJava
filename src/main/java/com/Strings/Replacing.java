package com.Strings;

import java.util.Arrays;

public class Replacing {
    public static String result = "we are doing it with 1234 and thus should do, it too often";

    public static void replacement(String regex){
        System.out.println(result.replaceAll("w\\w+","TOM"));
        System.out.println(result.replaceFirst("w\\w+","TOMCAT"));
        System.out.println(result.replaceAll("\\d+", "DIGIT"));

        //split the result string "with" keyword
        System.out.println(Arrays.toString(result.split("[a-zA-Z]+(it)[a-zA-Z]+")));
    }

    public static void main(String[] args) {
        replacement(result);
    }
}
