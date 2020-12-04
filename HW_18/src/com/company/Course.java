package com.company;

public class Course {
    private String name;
    private String date;
    int id;
    private String mentor;

    public Course () {

    }

    public Course (String name, String date, int id, String mentor) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.mentor = mentor;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setMentor(String mentor) {
        this.mentor = mentor;
    }


    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
    public String getMentor() {
        return mentor;
    }

    @Override
    public String toString() {
        String info = String.format("Это курс %s", this.getName());
        return info;
    }
}
