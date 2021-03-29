package com.reusingclasses;

interface ServiceFactory {
    Service getService();
}

interface  Service {
    void method1();
}

class Implementation1 implements Service {
    public void method1(){
        System.out.println("method 1 from implementation 1");
    }
}

class Implementation2 implements Service {
    public void method1(){
        System.out.println("method 1 from implementation 2");
    }
}

class ImplementationFactory1 implements  ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class ImplementationFactory2 implements  ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory sf){
        Service s = sf.getService();
        s.method1();
    }

    public static void main(String[] args) {
        serviceConsumer(new ImplementationFactory1());
        serviceConsumer(new ImplementationFactory2());
    }
}
