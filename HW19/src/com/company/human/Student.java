package com.company.human;

import com.company.human.Person;

import java.time.LocalDate;

public class Student extends Person {
    private LocalDate dateOfBirth;
    private String fName;
    private String lName;
    private String gender;
    private int age;

    public Student () {

    }
    public Student (LocalDate dateOfBirth, String fName, String lName, String gender, int age) {
        this.dateOfBirth = dateOfBirth;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        if (age < 0) {
            System.out.println("Error");
            return;
        }
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
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


    public LocalDate getDateOfBirth() {
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

    @Override
    public String toString() {
        String info = String.format("Студент %s %s, %s лет.", this.getlName(), this.getfName(), this.getAge());
        return info;
    }
}
