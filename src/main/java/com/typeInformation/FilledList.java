package com.typeInformation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class CountedInteger{
    private static int counter=0;
    private final int id = counter++;

    public String toString(){
        return Integer.toString(id);
    }
}

public class FilledList<T> {
    Class<T> clazz;

    FilledList(Class<T> clazz){
        this.clazz = clazz;
    }

    public List<T> create(int nelements){
        List<T> result = new ArrayList();
        for (int i = 0; i < nelements; i++) {
            try {
                result.add(clazz.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> list = new FilledList<>(CountedInteger.class);
        System.out.println(list.create(10));
    }
}
