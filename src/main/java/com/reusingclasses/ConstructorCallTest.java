package com.reusingclasses;

class A {

    public A() {
        System.out.println("A");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}

class X {
    public X() {
        System.out.println("X");
    }
}

class Y extends X {
    public Y() {
        System.out.println("Y");
    }
}

public class ConstructorCallTest {

    private A a = new A();
    private B b = new B();
    private Y y = new Y();

    static {
        System.out.println("i am being called from static block");
    }
    public ConstructorCallTest() {
        System.out.println("constructorTest");
    }

    public static void m1(){
        //m2();
        //static can not have a non static method call
        System.out.println(i);
        // static can not even access non static variable
        //System.out.println(j);
    }

    public void m2(){
    // non static can have a static method call
        m1();
        System.out.println(i);
        System.out.println(j);
    }

    private static int i;
    private int j;

    public static void main(String[] args) {
        new ConstructorCallTest();
    }
}
