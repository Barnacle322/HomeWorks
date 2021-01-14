package com.company;

public class Main {

    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey(monkey1);

        monkey1.info();
        monkey2.info();

    }
}
