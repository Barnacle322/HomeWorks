package com.company;

public class Ukulele extends Acoustic{
    private String model;
    private String stringType;
    private String color;
    boolean canBeAMPed;

    public Ukulele (String model, String stringType, String color, boolean canBeAMPed) {
        this.model = model;
        this.stringType = stringType;
        this.color = color;
        this.canBeAMPed = canBeAMPed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCanBeAMPed(boolean canBeAMPed) {
        this.canBeAMPed = canBeAMPed;
    }

    public String getModel() {
        return model;
    }

    public String getStringType() {
        return stringType;
    }

    public String getColor() {
        return color;
    }

    public String getAMPibility() {
        return canBeAMPed? "can be AMPed" : "can't be AMPed";
    }

    @Override
    public String toString() {
        String info = String.format("This is a ukulele guitar model %s with a %s color It uses %s and it %s. %s", getModel(), getColor(), getStringType(), getAMPibility(), getInfo());
        return info;
    }
}
