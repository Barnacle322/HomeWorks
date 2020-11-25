package com.company;

public class Group {
    private String[] studentArray;
    private String course;
    private String startingDate;
    int duration;

    public Group (String[] studentArray, String course, String startingDate, int duration) {
        this.studentArray = studentArray;
        this.course = course;
        this.startingDate = startingDate;
        this.duration = duration;
    }

    public void setStudentArray(String[] studentArray) {
        this.studentArray = studentArray;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public String getStudentArray() {
        String list = "";
        for (String s:studentArray) {
            list += s + " ";
        }
        return list;
    }

    public String getCourse() {
        return course;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public int getDuration() {
        return duration;
    }
}
