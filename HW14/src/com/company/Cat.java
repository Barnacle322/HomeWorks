package com.company;

public class Cat {
    private String name;
    private String color;
    private String breed;
    private String gender;
    private String age;
    boolean likesWater;

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setLikesWater(boolean likesWater) {
        this.likesWater = likesWater;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getBreed() {
        return breed;
    }
    public String getGender() {
        return gender;
    }
    public String getAge() {
        return age;
    }
    public boolean getLikesWater() {
        return likesWater;
    }

}
