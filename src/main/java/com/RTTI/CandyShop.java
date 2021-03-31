package com.RTTI;

class Confenctionary {
    void test(){
        System.out.println("confectionary test method");
    }
}
class Gum extends Confenctionary{
    static {
        System.out.println("gum class");
    }

    void test(){
        System.out.println("Gum test method");
    }
}

class Sweet extends Confenctionary {
    static {
        System.out.println("sweet class");
    }

    void test(){
        System.out.println("sweet test method");
    }
}

class Candy extends Confenctionary{
    static {
        System.out.println("candy class");
    }

    void test(){
        System.out.println("Candy test method");
    }
}

public class CandyShop {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException{
        Confenctionary[] conf = {new Candy(), new Sweet(), new Gum()};

        for(Confenctionary c : conf){
            System.out.println(c.getClass().getSimpleName()+" "+c.getClass().getSuperclass());
            Object obj = c.getClass().newInstance();


        }
    }
}
