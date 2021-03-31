package com.Strings;

import java.util.Random;

public class UsingStringBuilder {

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Random random = new Random(47);
        // throw a random integer 25 times
        for (int i = 0; i < 25; i++) {
            sb.append(random.nextInt(20)+" , ");
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append("]");

        return sb.toString();
    }

    // 25 times stringbuilder object would be created by the compiler which is inefficient
    // thus if there is a loop in toString method always use String builder which is efficient than using string object alone
    public String toString1(){
        String result = "";
        Random random = new Random(47);
        for (int i = 0; i < 25; i++) {
            result = result + random.nextInt(20);
        }
        return result;
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}
