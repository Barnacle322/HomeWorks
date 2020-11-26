package com.company;

public class Main {

    public static void main(String[] args) {
//      Задача А
        Cat persian = new Cat();
        persian.setName("Tom");
        persian.setColor("Beige");
        persian.setBreed("Persian");
        persian.setGender("Male");
        persian.setAge("8 months");
        persian.setLikesWater(false);

        System.out.printf("Name is %s and it's %s cat of %s color. It's %s and %s old",
                persian.getName(),
                persian.getBreed(),
                persian.getColor(),
                persian.getGender(),
                persian.getAge());

        Cat siamese = new Cat();
        siamese.setName("Cleo");
        siamese.setColor("White");
        siamese.setBreed("Siamese");
        siamese.setGender("Female");
        siamese.setAge("2 years");
        siamese.setLikesWater(true);

        System.out.printf("%nName is %s and it's %s cat of %s color. It's %s and %s old",
                siamese.getName(),
                siamese.getBreed(),
                siamese.getColor(),
                siamese.getGender(),
                siamese.getAge());

        Parrot ara = new Parrot();
        ara.setName("Blu");
        ara.setBreed("Blue Ara");
        ara.setColor("Blue");
        ara.setAge("15 years");
        ara.setCanTalk(true);

        System.out.printf("%nName is %s and it's %s parrot of %s color. It's %s old and %s talk",
                ara.getName(),
                ara.getBreed(),
                ara.getColor(),
                ara.getAge(),
                ara.getCanTalk());

        Parrot toucan = new Parrot();
        toucan.setName("Rafael");
        toucan.setBreed("Toco Toucan");
        toucan.setColor("Black");
        toucan.setAge("20 years");
        toucan.setCanTalk(true);

        System.out.printf("%nName is %s and it's %s parrot of %s color. It's %s old and %s talk",
                toucan.getName(),
                toucan.getBreed(),
                toucan.getColor(),
                toucan.getAge(),
                toucan.getCanTalk());

        Dog terrier = new Dog();
        terrier.setName("Max");
        terrier.setColor("Brown");
        terrier.setBreed("Jack Russell terrier");
        terrier.setGender("Male");
        terrier.setAge("5 years");
        terrier.setLikesWater(true);

        System.out.printf("%nName is %s and it's %s %s dog of %s color. It's %s old and %s water",
                terrier.getName(),
                terrier.getGender(),
                terrier.getBreed(),
                terrier.getColor(),
                terrier.getAge(),
                terrier.getLikesWater());

        Dog pomeranian = new Dog();
        pomeranian.setName("Gidget");
        pomeranian.setColor("White");
        pomeranian.setBreed("Pomeranian");
        pomeranian.setGender("Female");
        pomeranian.setAge("4 years");
        pomeranian.setLikesWater(false);

        System.out.printf("%nName is %s and it's %s %s dog of %s color. It's %s old and %s water",
                pomeranian.getName(),
                pomeranian.getGender(),
                pomeranian.getBreed(),
                pomeranian.getColor(),
                pomeranian.getAge(),
                pomeranian.getLikesWater());

        Fish clownfish = new Fish();
        clownfish.setName("Nemo");
        clownfish.setType("Clownfish");
        clownfish.setColor("Orange");
        clownfish.setAquariumType("Small");

        System.out.printf("%nName is %s and it's %s fish of %s color. It lives in a %s aquarium",
                clownfish.getName(),
                clownfish.getType(),
                clownfish.getColor(),
                clownfish.getAquariumType());


        Fish tang = new Fish();
        tang.setName("Dory");
        tang.setType("Regal Blue Tang");
        tang.setColor("Blue");
        tang.setAquariumType("Medium");

        System.out.printf("%nName is %s and it's %s fish of %s color. It lives in a %s aquarium",
                tang.getName(),
                tang.getType(),
                tang.getColor(),
                tang.getAquariumType());

        System.out.println("");
//      Задача Б
        Course java = new Course("Java", "10.06.2020",2020145, "Sabina");

        Student masha = new Student("10.06.2003", "Masha", "Petrova", "Female", 17);
        Student pasha = new Student("15.10.2003", "Pasha", "Petrova", "Male", 17);

        Group group1 = new Group(new Student[]{masha, pasha}, java, "25.06.2020", 9);

        System.out.printf("%nName of the Course: %s, Starting Date: %s, Course ID: %s, Course Mentor: %s", java.getName(), java.getDate(), java.getId(), java.getMentor());
        System.out.printf("%n%s %s, Age: %s, %s, %s", masha.getfName(), masha.getlName(), masha.getAge(), masha.getDateOfBirth(), masha.getGender());
        System.out.printf("%n%s %s, Age: %s, %s, %s", pasha.getfName(), pasha.getlName(), pasha.getAge(), pasha.getDateOfBirth(), pasha.getGender());
        System.out.printf("%nAttendees: %sCourse Name: %s, Starting Date: %s, Duration: %s months", group1.getStudentArray(), group1.getCourse(), group1.getStartingDate(), group1.getDuration());
    }
}
