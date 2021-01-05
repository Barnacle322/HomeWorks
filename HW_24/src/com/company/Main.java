package com.company;

public class Main {

    public static void main(String[] args) {
        Bakeable baguette = new Bread();
        Drawable circle = new Circle();

        baguette.bake();
        circle.draw();
    }
}
