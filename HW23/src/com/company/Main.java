package com.company;

import com.company.place.City;
import com.company.place.District;
import com.company.place.Locality;
import com.company.place.Village;

public class Main {
    public static void main(String[] args) {
        City bishkek = new City("Бишкек", "Тулобаев Балбак Зарлыкович");
        City washington = new City("Вашингтон", "Трамп");
        City paris = new City("Париж","Анна Хидалго");
        Village maevka = new Village("Маевка", "Somebody");
        Village baetovo = new Village("Баетово", "Насыров");
        District sverdlov = new District("Свердловский", "Somebody2");

        Locality[] LocalityArray = {bishkek, washington, paris, maevka, baetovo, sverdlov};

        for (Locality i: LocalityArray){
            System.out.println(i + " ");
        }

        String name = "Трамп";

        for(Locality i: LocalityArray){
            if (name.equals(i.getLeader())) {
                System.out.println("Есть совпадение" + "\n" + i);
                break;
            }
        }
    }
}