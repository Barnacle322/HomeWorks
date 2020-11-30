package com.company;

public class Main {

    public static void main(String[] args) {
	    Sheep sheep = new Sheep(150, 2, "Female", "Byaka");
        Sheep sheep2 = new Sheep(130, 2, "Female", "Zvezdochka");
        Sheep sheep3= new Sheep(180, 3, "Male", "Cherushka");
        Sheep sheep4 = new Sheep(170, 4, "Male", "Kudryashka");

        Cow cow = new Cow(300, 6, "Female", "Burena");
	    Cow cow2 = new Cow(400, 2, "Male", "Bychok");
	    Cow cow3 = new Cow(280, 8, "Female", "Korovushka");
	    Cow cow4 = new Cow(350, 6, "Male", "Borka");
        Cow cow5 = new Cow(275, 9, "Female", "Businka");
        Cow cow6 = new Cow(378, 3, "Female", "Marta");

        Horse horse = new Horse(500, 15, "Yellow","Male", "Spirit");
        Horse horse2 = new Horse(540, 9, "White","Female", "Adele");
        Horse horse3 = new Horse(600, 20, "Black", "Male", "Knight");

        Farm farm = new Farm("Poselochnoe 16", new Cow[]{cow, cow2, cow3, cow4, cow5}, new Sheep[]{sheep, sheep2, sheep3}, new Horse[]{horse, horse2});
        Farm farm2 = new Farm("Proezdnoe 28", new Cow[]{cow6}, new Sheep[]{sheep4}, new Horse[]{horse3});

        farm.Info();
        farm2.Info();
    }
}
