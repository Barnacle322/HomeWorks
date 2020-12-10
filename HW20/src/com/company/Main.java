package com.company;

public class Main {

    public static void main(String[] args) {
        Service lamp = new Service("Lamp", 3000, 2);
        Service meteorite = new Service("Meteorite", 1000, 10);
        Service notebook = new Service("Notebook", 20000, 2);

        System.out.println(lamp.buy());
        System.out.println(meteorite.send());
        System.out.println(notebook.order());
    }
}
