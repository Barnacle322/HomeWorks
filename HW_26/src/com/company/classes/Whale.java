package com.company.classes;

import com.company.interfaces.Swimmable;

public class Whale implements Swimmable {
    @Override
    public void swim() {
        System.out.println("The whale is swimming");
    }
}
