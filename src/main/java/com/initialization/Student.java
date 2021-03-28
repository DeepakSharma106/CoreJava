package com.initialization;

public class Student {

    private int roll;
    private String name;
    private static Diary diary;

    // no matter how many student you create, you will always get a single diary

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Diary getDiary() {
        return diary;
    }

    public static void setDiary(Diary diary) {
        Student.diary = diary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
