package com.company.classes;

import com.company.interfaces.Swimmable;

public class Ship implements Swimmable {
    @Override
    public void swim(){
        System.out.println("The ship is swimming");
    }
}
