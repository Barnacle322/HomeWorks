package com.company;

public class Classes {
    private String date;
    Student[] studentArray;
    Course course;
    private String time;
    boolean assignment;
    boolean testing;

    public Classes (String date, Student[] studentArray, Course course, String time, boolean assignment, boolean testing) {
        this.date = date;
        this.studentArray = studentArray;
        this.course = course;
        this.time = time;
        this.assignment = assignment;
        this.testing = testing;
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

    @Override
    public String toString() {
        String students = "";
        for (Student s: studentArray) {
            students += s +" ";
        }
        String wasTesting = testing? "was" : "was no";
        String info = String.format("In the %s class there are %s students. They are: %sThere %s testing", this.getCourse(), studentArray.length, students, wasTesting);
        return info;
    }
}