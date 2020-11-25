package com.company;

public class Main {

    public static void main(String[] args) {
//      Задача А
        Animal fish = new Animal();
        fish.setLegs(0);
        fish.setLivesOn("Water");

        Animal cat = new Animal();
        cat.setLegs(4);
        cat.setLivesOn("Ground");

        Animal dog = new Animal();
        dog.setLegs(4);
        dog.setLivesOn("Ground");

        Animal parrot = new Animal();
        parrot.setLegs(2);
        parrot.setLivesOn("Trees");

        System.out.printf("Fish has %s legs and lives in the %s, Cat has %s legs and lives on the %s, Dog has %s legs and lives on the %s, Parrot has %s legs and lives in the %s, ",fish.getLegs(), fish.getLivesOn(), cat.getLegs(), cat.getLivesOn(), dog.getLegs(), dog.getLivesOn(), parrot.getLegs(), parrot.getLivesOn());
        System.out.println("");
//      Задача Б
        Course java = new Course("java", "10.06.2020",2020145, "Sabina");
        Student masha = new Student("10.06.2003", "Masha", "Petrova", "Female", 17);
        Student pasha = new Student("15.10.2003", "Pasha", "Petrova", "Male", 17);
        Group group1 = new Group(new String[]{masha.getfName(), pasha.getfName()}, java.getName(), "25.06.2020", 9);

        System.out.printf("%nName of the Course: %s, Starting Date: %s, Course ID: %s, Course Mentor: %s", java.getName(), java.getDate(), java.getId(), java.getMentor());
        System.out.printf("%n%s %s, Age: %s, %s, %s", masha.getfName(), masha.getlName(), masha.getAge(), masha.getDateOfBirth(), masha.getGender());
        System.out.printf("%n%s %s, Age: %s, %s, %s", pasha.getfName(), pasha.getlName(), pasha.getAge(), pasha.getDateOfBirth(), pasha.getGender());
        System.out.printf("%nAttendees: %s, Course Name: %s, Starting Date: %s, Duration: %s months", group1.getStudentArray(), group1.getCourse(), group1.getStartingDate(), group1.getDuration());
    }
}
