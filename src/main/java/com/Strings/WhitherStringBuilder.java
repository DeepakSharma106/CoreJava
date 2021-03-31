package com.Strings;

public class WhitherStringBuilder {

    public String implicit(String[] input){
        String result = "";
        for (int i = 0; i < input.length; i++) {
            result += input[i];
        }
        return result;
    }

    public String usingStringBuilder(String[] input){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            sb.append(input[i]);
        }

        return sb.toString();
    }
/*
    public static void main(String[] args) {
        String[] input = "we are delighted to present you difference between string and stringbuilder".split(" ");
        WhitherStringBuilder obj = new WhitherStringBuilder();
        System.out.println(obj.implicit(input));
        System.out.println(obj.usingStringBuilder(input));
    }*/
}
