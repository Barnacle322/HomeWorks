package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("2 is the initial variable");
        Thread t1 = new Thread(new MathMethods(1));
        Thread t2 = new Thread(new MathMethods(2));
        Thread t3 = new Thread(new MathMethods(3));
        Thread t4 = new Thread(new MathMethods(4));

        t1.setName("Multiplication");
        t2.setName("Division");
        t3.setName("Addition");
        t4.setName("Subtraction");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
