package com.company;

public class Human {
    private String fName;
    private String lName;
    private String mName;
    int birthYear;
    private String hobby;
    private String gender;

    public Human (String fName, String lName, String mName, int birthYear, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public Human (String fName, String lName, String mName, int birthYear, String hobby, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.birthYear = birthYear;
        this.hobby = hobby;
        this.gender = gender;
    }


    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setBirthYear(int age) {
        birthYear = 2020 - age;
        this.birthYear = birthYear;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getmName() {
        return mName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getHobby() {
        if (hobby != null) {
            return hobby;
        }
        return "to do nothing";
    }

    public String getGender() {
        return gender;
    }
}
