package com.typeInformation;

public class WildCardClassReferences {

    public static void main(String[] args) {
        Class<?> clazz = int.class;
        clazz = double.class;
        clazz = float.class;

        Class<? extends Number> clazz1 = int.class;
        clazz1 = double.class;
        clazz1 = float.class;
    }
}
