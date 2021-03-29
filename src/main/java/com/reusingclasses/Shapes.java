package com.reusingclasses;

import java.util.Random;

class Shape {
    public void draw(){

    }

    public void erase(){}
}

class Rectangle extends Shape {
    public void draw(){
        System.out.println("rectangle draw");
    }

    public void erase(){
        System.out.println("rectangle erase");
    }
}


class Circle extends Shape {
    public void draw(){
        System.out.println("rectangle draw");
    }

    public void erase(){
        System.out.println("rectangle erase");
    }
}

class Square extends Shape {
    public void draw(){
        System.out.println("rectangle draw");
    }

    public void erase(){
        System.out.println("rectangle erase");
    }
}


class RandomShapeGenerator {
    private Random random = new Random(47);

    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Rectangle();
        }
    }
}


public class Shapes {
    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        //create an array of shapes
        Shape[] shape = new Shape[9];
        //fill the array with random shapes

        for (int i = 0; i < shape.length; i++) {
            shape[i] = generator.next();
        }

        for (Shape s : shape){
            s.draw();
            s.erase();
        }
    }
}
