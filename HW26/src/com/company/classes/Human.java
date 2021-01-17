package com.company.classes;

import com.company.interfaces.Walkable;

public class Human implements Walkable {
    @Override
    public void walk(){
        System.out.println("The human is walking");
    }
}
