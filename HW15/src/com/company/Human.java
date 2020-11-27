package com.company;

public class Human {
    private String fName;
    private String lName;
    private String mName;
    int birthYear;
    private String hobby;
    private String gender;

    public Human (String fName, String lName, String mName, int age, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.birthYear = 2020 - age;
        this.gender = gender;
    }

    public Human (String fName, String lName, String mName, int age, String hobby, String gender) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.birthYear = 2020 - age;
        this.hobby = hobby;
        this.gender = gender;
    }

    public void about() {
        if (hobby == null) {
            hobby =  "to do nothing";
        }
        System.out.printf("%nName is %s %s %s. Born in %s. %s. Likes %s", this.lName, this.fName, this.mName, this.birthYear, this.gender, this.hobby);
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
        this.birthYear = 2020 - age;
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
