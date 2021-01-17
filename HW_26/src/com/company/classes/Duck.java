package com.company.classes;

import com.company.interfaces.Flyable;
import com.company.interfaces.Swimmable;
import com.company.interfaces.Walkable;

public class Duck implements Swimmable, Walkable, Flyable {
    @Override
    public void fly() {
        System.out.println("The duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming");
    }

    @Override
    public void walk() {
        System.out.println("The duck is walking");
    }
}
