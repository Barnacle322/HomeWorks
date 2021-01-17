package com.company.classes;

import com.company.interfaces.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly(){
        System.out.println("The plane is flying");
    }
}
