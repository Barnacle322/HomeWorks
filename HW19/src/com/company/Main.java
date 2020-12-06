
package com.company;

import com.company.human.Mentor;
import com.company.human.Student;
import com.company.organization.Classes;
import com.company.organization.Course;
import com.company.organization.Group;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Mentor adilet = new Mentor("Adilet", "Male", 27, "Java");
        adilet.setGraduated(true);

        Course java = new Course("Java", "10.06.2020",2020145, adilet);

        Student masha = new Student(LocalDate.of(2003,06,10), "Masha", "Petrova", "Female", 17);
        masha.setHobbies("Hockey");
        Student pasha = new Student(LocalDate.of(2003,10,15), "Pasha", "Petrova", "Male", 17);
        pasha.setRelatives(10);
        Group group1 = new Group(new Student[]{masha, pasha}, java, "25.06.2020", 9, adilet);

        Classes class1 = new Classes("20.10.20", new Student[]{masha, pasha}, java, "20:00", true, false, adilet);

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

        System.out.println(adilet.getName() + " " + adilet.getGraduationStatus());
        System.out.println(masha.getfName() + " loves " + masha.getHobbies());
        System.out.println(pasha.getfName() + " has " + pasha.getRelatives() + " relatives");
    }
}