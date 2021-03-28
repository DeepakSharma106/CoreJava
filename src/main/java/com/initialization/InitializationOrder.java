package com.initialization;

class Window {
    public Window(int marker) {
        System.out.println("windows "+marker);
    }
}

class House {
    {
        //instance initialization
        Window w7 = new Window(17);
    }
    Window w1 = new Window(11);

    House(){
        Window w2 = new Window(12);
        if(w6 == null)
            w6 = new Window(16);
    }

    Window w3 = new Window(13);

    {
        //instance initialization
        Window w4 = new Window(14);
    }

    //static block
    static {
        Window w5 = new Window(15);
    }

    Window w6;

}

public class InitializationOrder {
    public static void main(String[] args) {
        House h1 = new House();
    }
}
