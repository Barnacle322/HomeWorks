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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCowArray(Cow[] cowArray) {
        this.cowArray = cowArray;
    }

    public void setSheepArray(Sheep[] sheepArray) {
        this.sheepArray = sheepArray;
    }

    public void setHorseArray(Horse[] horseArray) {
        this.horseArray = horseArray;
    }

    public String getAddress() {
        return address;
    }

    public void Info() {
        String cowString = "";
        for (Cow c: cowArray) {
            cowString += String.format("%n%s is a %s and %s years old. It weighs %s", c.getName(), c.getGender(), c.getAge(), c.getWeight());
        }
        String sheepString = "";
        for (Sheep s: sheepArray) {
            sheepString += String.format("%n%s is a %s and %s years old. It weighs %s", s.getName(), s.getGender(), s.getAge(), s.getWeight());
        }
        String horseString = "";
        for (Horse h: horseArray) {
            horseString += String.format("%n%s is a %s and %s years old. It is %s and it weighs %s", h.getName(), h.getGender(), h.getAge(), h.getColor(), h.getWeight());
        }
        System.out.printf("Farm is located on %s. It has %s cows, specifically:%s%n%nIt also has %s sheep, which are: %s%n%nLastly there are %s horses: %s%n%n%n", this.address, cowArray.length, cowString, sheepArray.length, sheepString, horseArray.length, horseString);
    }
}
