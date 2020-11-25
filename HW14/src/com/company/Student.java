package com.company;

public class Student {
    private String dateOfBirth;
    private String fName;
    private String lName;
    private String gender;
    int age;

    public Student (String dateOfBirth, String fName, String lName, String gender, int age) {
        this.dateOfBirth = dateOfBirth;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error");
            return;
        }
        this.age = age;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
