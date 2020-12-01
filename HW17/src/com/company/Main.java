package com.company;

public class Main {

    public static void main(String[] args) {
        Course java = new Course("Java", "10.06.2020",2020145, "Sabina");

        Student masha = new Student("10.06.2003", "Masha", "Petrova", "Female", 17);
        Student pasha = new Student("15.10.2003", "Pasha", "Petrova", "Male", 17);

        Group group1 = new Group(new Student[]{masha, pasha}, java, "25.06.2020", 9);

        Classes class1 = new Classes("20.10.20", new Student[]{masha, pasha}, java, "20:00", true, false);

        System.out.printf("%nName of the Course: %s, Starting Date: %s, Course ID: %s, Course Mentor: %s", java.getName(), java.getDate(), java.getId(), java.getMentor());
        System.out.printf("%n%s %s, Age: %s, %s, %s", masha.getfName(), masha.getlName(), masha.getAge(), masha.getDateOfBirth(), masha.getGender());
        System.out.printf("%n%s %s, Age: %s, %s, %s", pasha.getfName(), pasha.getlName(), pasha.getAge(), pasha.getDateOfBirth(), pasha.getGender());
        System.out.printf("%nAttendees: %sCourse Name: %s, Starting Date: %s, Duration: %s months", group1.getStudentArray(), group1.getCourse(), group1.getStartingDate(), group1.getDuration());
        System.out.println("");
        System.out.println(java.toString());
        System.out.println(masha.toString());
        System.out.println(pasha.toString());
        System.out.println(group1.toString());
        System.out.println(class1.toString());
    }
}