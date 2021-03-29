package com.holdingObjects;

import java.util.ArrayList;
import java.util.List;

class Apple {
    private static int count = 0;
    private final int id = count++;

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                '}';
    }
}

public class AppleWithGenerics {
    public static void main(String[] args) {
        List<Apple> list = new ArrayList<>();
        //adding apples into the list
        list.add(new Apple());
        list.add(new Apple());
        list.add(new Apple());
        list.add(new Apple());
        System.out.println(list);

    }
}
