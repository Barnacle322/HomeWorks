package com.company;

public class Printer {
    static int var = 2;
    public synchronized static void print (int method) {
        switch (method) {

            case 1 -> {
                int result = var * 2;
                var =  result;
                System.out.println(Thread.currentThread().getName() + " result: " + result);
            }
            case 2 -> {
                int result = var / 2;
                var =  result;
                System.out.println(Thread.currentThread().getName() + " result: " + result);
            }
            case 3 -> {
                int result = var + 2;
                var =  result;
                System.out.println(Thread.currentThread().getName() + " result: " + result);
            }
            case 4 -> {
                int result = var - 2;
                var =  result;
                System.out.println(Thread.currentThread().getName() + " result: " + result);
            }
            default -> System.out.println("Error");
        }
    }
}
