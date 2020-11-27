package com.company;

public class Main {

    public static void main(String[] args) {

        Human arstan = new Human("Arstan", "Usenov", "Japarovich", 17, "Coding", "Male");
        Human nicole = new Human("Nicole", "Marotova", "Kanatovna", 17, "Female");
        Human jetigen = new Human("Jetigen", "Kyrmanchiev", "Mahmudovich", 29, "Video Games", "Male");
        Human bermet = new Human("Bermet", "Toktosunova", "Alisherovna", 13, "Horse Riding", "Female");
        Human chyngyz = new Human("Chyngyz", "Asanov", "Gavrilovich", 16, "Football", "Male");
        Human aiperi = new Human("Ai-Peri", "Toktogulova", "Asheralieva", 18, "Female");
        Human emir = new Human("Emir", "Kurmanaliev", "Andreevich", 29, "Video Games", "Male");
        Human azem = new Human("Azem", "Osmonova", "Adilteovna", 124, "Chess", "Female");
        Human roma = new Human("Roman", "Kin", "Sergeevich", 20, "Photography", "Male");
        Human yana = new Human("Yana", "Gaisina", "Egemberdievna", 14, "Athletics","Female");

        Human[] humanList = new Human[]{arstan, nicole, jetigen, bermet, chyngyz, aiperi, emir, azem, roma, yana};

        for (Human s: humanList) {
            s.about();
        }
    }
}
