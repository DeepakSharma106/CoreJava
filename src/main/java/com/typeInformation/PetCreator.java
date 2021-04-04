package com.typeInformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Pet {
    private String name;

    public Pet(){

    }
    public Pet(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    public Cat(){
        super();
    }
}

class Rat extends Pet {
    public Rat(String name) {
        super(name);
    }
    public Rat(){
        super();
    }
}

public abstract class PetCreator {

    private Random random = new Random(47);
    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet(){
        int n = random.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pet[] petArray(int size){
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();;
        }
        return result;

    }

    public List<Pet> petResult(){
        List<Pet> list = new ArrayList<>();
        Collections.addAll(list, petArray(10));
        return  list;
    }
}
