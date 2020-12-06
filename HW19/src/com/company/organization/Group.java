package com.company.organization;

import com.company.human.Mentor;
import com.company.human.Student;

public class Group {
    private Student[] studentArray;
    private Course course;
    private String startingDate;
    private int duration;
    private Mentor mentor;

    public Group () {

    }

    public Group (Student[] studentArray, Course course, String startingDate, int duration, Mentor mentor) {
        this.studentArray = studentArray;
        this.course = course;
        this.startingDate = startingDate;
        this.duration = duration;
        this.mentor = mentor;
    }

    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public String getStudentArray() {
        String list = "";
        for (Student s: studentArray) {
            list += s.getfName() +", ";
        }
        return list;
    }
    public String getCourse() {
        return course.getName();
    }
    public String getStartingDate() {
        return startingDate;
    }
    public int getDuration() {
        return duration;
    }
    public Mentor getMentor() {
        return mentor;
    }

    @Override
    public String toString() {
        String info = String.format("Это группа по курсу %s, в которой обучается %s студентов. Ментором является %s", this.getCourse(), this.studentArray.length, mentor.getName());
        return info;
    }
}