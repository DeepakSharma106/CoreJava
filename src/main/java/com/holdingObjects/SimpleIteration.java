package com.holdingObjects;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());

        System.out.println(list);
        //iterate via iterator
        Iterator<Apple> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        //iterator can also remove elements
        Iterator<Apple> it = list.iterator();
        while (it.hasNext()){
            it.next();
            //it.remove();
        }
        System.out.println("after calling remove method from iterator");
        System.out.println(list);
    }
}
