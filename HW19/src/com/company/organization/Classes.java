package com.company.organization;

import com.company.human.Mentor;
import com.company.human.Student;

public class Classes {
    private String date;
    private Student[] studentArray;
    private Course course;
    private String time;
    private boolean assignment;
    boolean testing;
    private Mentor mentor;

    public Classes (String date, Student[] studentArray, Course course, String time, boolean assignment, boolean testing, Mentor mentor) {
        this.date = date;
        this.studentArray = studentArray;
        this.course = course;
        this.time = time;
        this.assignment = assignment;
        this.testing = testing;
        this.mentor = mentor;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setAssignment(boolean assignment) {
        this.assignment = assignment;
    }
    public void setTesting(boolean testing) {
        this.testing = testing;
    }
    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public String getDate() {
        return date;
    }
    public Student[] getStudentArray() {
        return studentArray;
    }
    public String getCourse() {
        return course.getName();
    }
    public String getTime() {
        return time;
    }
    public String getMentor() {
        return mentor.getName();
    }

    @Override
    public String toString() {
        String students = "";
        for (Student s: studentArray) {
            students += s +" ";
        }
        String wasTesting = testing? "was" : "was no";
        String info = String.format("In the %s class there are %s students. They are: %sThere %s testing. The mentor is %s", this.getCourse(), studentArray.length, students, wasTesting, mentor.getName());
        return info;
    }
}