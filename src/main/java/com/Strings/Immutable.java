package com.Strings;

// Strings are immutable
public class Immutable {

    public static String upper(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String s1 = "deepak";
        //System.out.println(upper(s1));
        System.out.println(s1);
        String s2 = upper(s1);
        System.out.println(s1);
        System.out.println(s2);

        String a1 = "deepak";
        String a2 = "deepak";
        System.out.println("a1 == a2 "+ (a1 == a2));
        String a3 = new String("deepak");
        System.out.println("a1 == a3 "+ (a1 == a3));

        System.out.println("a1.equals(a3) "+(a1.equals(a3)));
        String a4 = a3.intern();
        System.out.println("a2 == a4 "+ (a2 == a4));

        System.out.println(a1.hashCode() == a3.hashCode());

        String sample = "anything";
        String sample1 = sample.toUpperCase();
        System.out.println(sample1);
        System.out.println(sample);
    }
}
