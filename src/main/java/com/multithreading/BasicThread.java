package com.multithreading;

public class BasicThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread starts");
        Thread t = new Thread( () -> {
            System.out.println("sample thread starts" + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
                Thread t1 = new Thread(() -> {
                    System.out.println("child thread of sample thread starts"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("child thread of sample thread ends");
                });
                t1.start();
                t1.join();
                System.out.println("sample thread "+Thread.currentThread().getName()+" ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
        t.join();
        System.out.println("main thread ends "+Thread.currentThread().getName());
    }
}
