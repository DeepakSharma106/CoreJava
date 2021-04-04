package com.typeInformation;

// there are 3 interfaces

// you can get access to class reference - using object - obj.getClass() & other way is using class name - ClassName.class
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    public Toy() {
    }

    public Toy(int i){

    }
}


public class ToyTest extends Toy implements HasBatteries, Waterproof, Shoots{
    static void printInfo(Class c){
        System.out.println("class name "+c.getSimpleName()+" is interface "+c.isInterface());
        System.out.println("canonical name "+c.getCanonicalName());
        System.out.println("simple name "+c.getSimpleName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.typeInformation.ToyTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);
        for(Class f : c.getInterfaces()){
            printInfo(f);
        }
        // create a superclass object
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(obj.getClass());

    }
}
