package com.company;

public class Main {

    public static void main(String[] args) {
        Acoustic yamaha = new Acoustic("C40m", "nylon", "oak", false);
        yamaha.setStrings(6);
        yamaha.setPrice(200);
        yamaha.setSize("40cm");
        yamaha.setCanBeStrapped(false);

        Ukulele cordoba = new Ukulele("28T-CE", "nylon", "brown", true);
        cordoba.setStrings(4);
        cordoba.setPrice(120);
        cordoba.setSize("Concert");
        cordoba.setCanBeStrapped(false);

        Bass fender = new Bass("American Ultra Stratocaster", true, "maple", 3);
        fender.setStrings(4);
        fender.setPrice(400);
        fender.setSize("Standard");
        fender.setCanBeStrapped(true);

        Electric peavey = new Electric("Raptor Plus SunBurst", true, "basswood", 4);
        peavey.setStrings(7);
        peavey.setPrice(350);
        peavey.setSize("22 fret");
        peavey.setCanBeStrapped(true);

        System.out.println(yamaha.toString());
        System.out.println(cordoba.toString());
        System.out.println(fender.toString());
        System.out.println(peavey.toString());
    }
}
