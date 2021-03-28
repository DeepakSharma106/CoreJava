package com.initialization;

public class VarArgs {

    static void printSomething(Object... args){
        for(Object o : args){
            System.out.print(o+" -> ");
        }
        System.out.println();
    }

    static void printsomethingelse(Object[] args){
        for (Object o : args){
            System.out.println(o + " ");
        }
    }

    public static void main(String[] args) {
        printSomething(new Object[]{1, "hi", 3.5, true});
        printSomething(11);
        printSomething(true);
        printSomething("testing varargs");
        printSomething(new Student(1, "x"));
        printSomething();
    }
}
