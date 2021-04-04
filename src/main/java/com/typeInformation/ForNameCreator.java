package com.typeInformation;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{

    private static List<Class<? extends Pet>> result = new ArrayList<Class<? extends Pet>>();

    private static String[] names = {
      "com.typeInformation.Cat","com.typeInformation.Rat"
    };
    static {
        loader();
    }

    private static void loader(){
        for(String name: names){
            try {
                result.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Class<? extends Pet>> types(){
        return result;
    }
}
