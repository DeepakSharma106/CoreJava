package com.holdingObjects;

import java.util.LinkedList;

public class CustomStack<T> {

    // since linked list has all type of methods to be used as a stack, so using one
    LinkedList<T> storage = new LinkedList<>();

    public void push(T t){
        storage.addFirst(t);
    }

    public T pop(){
        return storage.removeFirst();
    }

    public T peek(){
        return storage.getFirst();
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }

    public String toString(){
        return storage.toString();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(1);stack.push(8);stack.push(2);stack.push(6);stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        String[] stringArray = "My kids are strong enough and i am strong enough too".split(" ");
        CustomStack<String> stack1 = new CustomStack<>();
        for(String s : stringArray)
            stack1.push(s);

        System.out.println(stack1);

    }
}
