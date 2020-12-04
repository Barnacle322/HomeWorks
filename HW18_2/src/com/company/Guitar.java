package com.company;

public class Guitar {
    int strings;
    int price;
    private String size;
    boolean canBeStrapped;

    public Guitar () {}

    public Guitar(int strings, int price, String size, boolean canBeStrapped) {
        this.strings = strings;
        this.price = price;
        this.size = size;
        this.canBeStrapped = canBeStrapped;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCanBeStrapped(boolean canBeStrapped) {
        this.canBeStrapped = canBeStrapped;
    }

    public int getStrings() {
        return strings;
    }

    public int getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getStrapability() {
        return canBeStrapped? "can be strapped": "cannot be strapped";
    }

    public String getInfo() {
        String info = String.format("The guitar has %s strings. It is %s size. It costs about %s $. It %s", getStrings(), getSize(), getPrice(), getStrapability());
        return info;
    }
}
