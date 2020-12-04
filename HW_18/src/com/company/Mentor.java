package com.company;

public class Mentor extends Person{
    private String name;
    private String gender;
    int age;
    private String proficiency;

//    public Mentor () {};

    public Mentor (String name, String gender, int age, String proficiency) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.proficiency = proficiency;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getProficiency() {
        return proficiency;
    }
}
