package com.company.classes;

import com.company.interfaces.Walkable;

public class Cat implements Walkable {
    @Override
    public void walk() {
        System.out.println("The cat is walking");
    }
}
