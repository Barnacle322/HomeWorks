package com.company;

public class MathMethods implements Runnable{
    private int method;

    public MathMethods(int method) {
        this.method = method;
    }

    @Override
    public void run() {
        Printer.print(method);
    }
}
