package com.company.classes;

import com.company.interfaces.Swimmable;

public class Shark implements Swimmable {
    @Override
    public void swim() {
        System.out.println("The shark is swimming");
    }
}
