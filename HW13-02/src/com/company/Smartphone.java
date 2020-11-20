package com.company;

import java.util.Arrays;

public class Smartphone {
    String company;
    String model;
    int price;
    String color;
    boolean waterproof = false;

    public static void main (String[] args) {
        Smartphone iPhone = new Smartphone();
        iPhone.company = "Apple";
        iPhone.model = "12 Pro max";
        iPhone.price = 799;
        iPhone.color = "Blue";
        iPhone.waterproof = true;

        Smartphone Galaxy = new Smartphone();
        Galaxy.company = "Samsung";
        Galaxy.model = "S20 Ultra";
        Galaxy.price = 1100;
        Galaxy.color = "Red";
        Galaxy.waterproof = true;

        Smartphone Redmi = new Smartphone();
        Redmi.company = "Xiaomi";
        Redmi.model = "K20 Pro";
        Redmi.price = 450;
        Redmi.color = "Orange";

        System.out.printf("%s %s %s$ %s %s", iPhone.company, iPhone.model, iPhone.price, iPhone.color, iPhone.waterproof);
        System.out.printf("%n%s %s %s$ %s %s", Galaxy.company, Galaxy.model, Galaxy.price, Galaxy.color, Galaxy.waterproof);
        System.out.printf("%n%s %s %s$ %s %s", Redmi.company, Redmi.model, Redmi.price, Redmi.color, Redmi.waterproof);
    }
}