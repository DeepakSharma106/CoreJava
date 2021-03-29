package com.reusingclasses;

class Shared {
    private static int count = 1;
    private final int id = count++;

    public Shared(){
        System.out.println("creating shared "+ id);
    }

    public static void totalCount(){
        System.out.println("total object created so far are "+ (count-1));
    }

    public void getId(){
        System.out.println("Id is "+ id);
    }
}

public class ObjectCounterTest {
    public static void main(String[] args) {
        Shared s1 = new Shared();
        s1.getId();

        Shared s2 = new Shared();
        s2.getId();

        Shared s3 = new Shared();
        s3.getId();
        Shared s4 = new Shared();
        s4.getId();

        Shared.totalCount();
    }
}
