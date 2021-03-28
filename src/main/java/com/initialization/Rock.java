package com.initialization;

public class Rock {
    //constructor is called every time create an object
    public Rock() {
        this(3);
    }
    public Rock(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Rock constructor is called");
        }
    }

    public void nonstaticmethod(){
        System.out.println("I am non static");
        //staticmethod();
    }

    public static void staticmethod(){
        System.out.println("I am a static method");
        new Rock().nonstaticmethod();
    }
    public static void main(String[] args) {
        //new Rock();
        staticmethod();
    }
}
