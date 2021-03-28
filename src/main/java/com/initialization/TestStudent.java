package com.initialization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {

    private String name = "instance variable";

    public void test(){
        String local = "i am local";
        System.out.println(this.name);
        System.out.println(local);
    }

    public static void main(String[] args) {
        // create a list of student
        Diary diary = new Diary(100, "red");
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(11, "deepak");
        Student s2 = new Student(12, "saurabh");
        Student s3 = new Student(13, "amit");

        s1.setDiary(diary);
        list.add(s1);list.add(s2);list.add(s3);
        System.out.println("before sorting");
        System.out.println(list);
        Collections.sort(list, (t1, t2) -> t1.getName().compareTo(t2.getName()));

        System.out.println("after sorting");
        System.out.println(list);

        new TestStudent().test();

    }
}
