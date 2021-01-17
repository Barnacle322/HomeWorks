package com.company;

import com.company.classes.*;
import com.company.interfaces.*;

public class Main {

    public static void main(String[] args) {

        Swimmable[] aquatic = new Swimmable[4];
        aquatic[0] = new Duck();
        aquatic[1] = new Shark();
        aquatic[2] = new Whale();
        aquatic[3] = new Ship();

        Flyable[] aerial = new Flyable[4];
        aerial[0] = new Plane();
        aerial[1] = new Parrot();
        aerial[2] = new Plane();
        aerial[3] = new Duck();

        Walkable[] land = new Walkable[3];
        land[0] = new Cat();
        land[1] = new Human();
        land[2] = new Duck();

        for (Swimmable swimmer : aquatic) {
            swimmer.swim();
        }

        System.out.println("");

        for (Flyable flier : aerial) {
            flier.fly();
        }

        System.out.println("");

        for (Walkable walker : land) {
            walker.walk();
        }
    }
}