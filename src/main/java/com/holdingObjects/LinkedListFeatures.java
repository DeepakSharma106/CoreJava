package com.holdingObjects;

import java.util.LinkedList;
import java.util.List;

/**
 *  Linked list can be used as stack, queue or double ended queue.
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        //list interface does not have some method
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 1; i < 7; i++) {
            list1.add(i);
        }
        System.out.println(list1);

        list1.addFirst(11);
        System.out.println(list1);

        list1.remove();
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);
    }
}
