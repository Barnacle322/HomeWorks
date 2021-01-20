package com.company;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise A");

        List<String> List1 = new ArrayList<>();
        List<String> List2 = new ArrayList<>();

        List1.add("Ветер с моря дул");
        List1.add("Нагонял беду");
        List1.add("И сказал ты мне");
        List1.add("Больше не приду");

        System.out.println(List1);

        for (int i = 0; i < List1.size(); i += 2) {
            List1.add(i + 1, List1.get(i));

            if (List1.get(i).length() >= 15) {
                List2.add(List1.get(i));
            }
        }

        System.out.println(List1);
        System.out.println(List2);

        for (int i = 0; i < List2.size(); i++) {
            if (List2.get(i).equals("И сказал ты мне")) {
                List2.remove(i);
            }
        }

        System.out.println(List2);

        System.out.println();
        System.out.println("Exercise B");

        Random random = new Random();

        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            int num = random.nextInt(100);

            if (num % 2 == 0) {
                evenNums.add(num);
            } else {
                oddNums.add(num);
            }
        }

        System.out.println(evenNums);
        System.out.println(oddNums);
        
    }
}
