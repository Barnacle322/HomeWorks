package com.company.human;

public class Person {
    private boolean isGraduated;
    private String hobbies;
    private int relatives;

    public Person () {};

    public Person (boolean isGraduated, String hobbies, int relatives) {
        this.isGraduated = isGraduated;
        this.hobbies = hobbies;
        this.relatives = relatives;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    public void setRelatives(int relatives) {
        this.relatives = relatives;
    }


    public String getHobbies() {
        return hobbies;
    }
    public int getRelatives() {
        return relatives;
    }

    public String getGraduationStatus() {
        return isGraduated? "Is a graduate":"Did not graduate";
    }
}
