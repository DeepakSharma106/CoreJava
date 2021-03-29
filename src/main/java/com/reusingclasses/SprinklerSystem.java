package com.reusingclasses;


class WaterSource {
    int pipelength;

    public WaterSource() {
        System.out.println("calling water source constructor "+pipelength);
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "pipelength=" + pipelength +
                '}';
    }
}

public class SprinklerSystem {
    //composition
    // Sprinkler system has a watersource
    WaterSource ws = new WaterSource();

    public SprinklerSystem(){
        System.out.println("calling sprinkler system constructor");
    }

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "ws=" + ws +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem ss = new SprinklerSystem();
        System.out.println(ss);
        //variables would be initialized first and then constructor
    }
}
