package com.company;

public class Farm {
    private String address;
    Cow[] cowArray;
    Sheep[] sheepArray;
    Horse[] horseArray;

    public Farm () {}

    public Farm (String address, Cow[] cowArray, Sheep[] sheepArray, Horse[] horseArray) {
        this.address = address;
        this.cowArray = cowArray;
        this.sheepArray = sheepArray;
        this.horseArray = horseArray;
    }

    
}
