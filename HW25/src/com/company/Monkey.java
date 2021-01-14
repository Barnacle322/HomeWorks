package com.company;

public class Monkey implements Climbable{
    Monkey onBack;

    public Monkey(){};

    public Monkey(Monkey onBack) {
        this.onBack = onBack;
    }

    @Override
    public void climb(){
        System.out.println("I can climb");
    }

    public void eat(){
        System.out.println("I eat edible fruits");
    }

    public void info(){
        System.out.println(onBack != null? "I'm a Monkey with another monkey on my back":"I'm just a monkey");
    }
}
