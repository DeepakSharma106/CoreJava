package com.sample;


public class HelloWorld {
    public static void main(String[] args) {

/*
        System.out.println("Iterating normally");
        for (int i = 0; i < 10; i++) {
            System.out.print("house no "+i+" , ");
        }
        System.out.println();
       System.out.println("doing the same thing recursively");
        new HelloWorld().housing(1);
*/

        new HelloWorld().iteratively();
        new HelloWorld().recursively(1);
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


    public void iteratively(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
    }

    public void recursively(int i){
        if(i == 10)
            return;
        else {
            System.out.println("going to executing function "+i);
            recursively(i+1);
            System.out.println("done executing function "+i);
        }

    }
}
