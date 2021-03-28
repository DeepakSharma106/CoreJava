package com.sample;


public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Iterating normally");
        for (int i = 0; i < 10; i++) {
            System.out.print("house no "+i+" , ");
        }
        System.out.println();

        System.out.println("doing the same thing recursively");
        new HelloWorld().housing(1);



    }

    public void housing(int i){
        //base condition
        if(i == 5)
            return;
        else {
            System.out.println("starting housing for house no "+i);
            housing(i + 1);
            System.out.println("ending housing for house no "+i);
        }
    }
}
