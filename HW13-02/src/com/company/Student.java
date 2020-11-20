package com.company;

public class Student {
    String course;
    int age;
    String gender;

    public static void main (String[] args) {
        Student Arstan = new Student();
        Arstan.course = "Java";
        Arstan.age = 17;
        Arstan.gender = "Male";

        Student Kanykei = new Student();
        Kanykei.course = "Frontend";
        Kanykei.age = 18;
        Kanykei.gender = "Female";

        Student Arthur = new Student();
        Arthur.course = "Python";
        Arthur.age = 19;
        Arthur.gender = "Male";

        System.out.printf("%s %s %s", Arstan.course, Arstan.age, Arstan.gender);
        System.out.printf("%n%s %s %s", Kanykei.course, Kanykei.age, Kanykei.gender);
        System.out.printf("%n%s %s %s", Arthur.course, Arthur.age, Arthur.gender);
    }
}
