package com.company.classes;

import com.company.interfaces.Flyable;

public class Parrot implements Flyable {
    @Override
    public void fly() {
        System.out.println("The parrot is flying");
    }
}
