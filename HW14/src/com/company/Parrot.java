package com.company;

public class Parrot {
    private String name;
    private String breed;
    private String color;
    private String age;
    boolean canTalk;


    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }


    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public String getAge() {
        return age;
    }
    public String getCanTalk() {
        if (canTalk) {
            return "can";
        }
        else {
            return "can't";
        }
    }
}
