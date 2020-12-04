package com.company;

public class Acoustic extends Guitar{
    private String model;
    private String stringType;
    private String woodType;
    boolean canBeAMPed;

    public Acoustic () {}

    public Acoustic (String model, String stringType, String woodType, boolean canBeAMPed) {
        this.model = model;
        this.stringType = stringType;
        this.woodType = woodType;
        this.canBeAMPed = canBeAMPed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
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

    public String getWoodType() {
        return woodType;
    }

    public String getAMPibility() {
        return canBeAMPed? "can be AMPed" : "can't be AMPed";
    }

    @Override
    public String toString() {
        String info = String.format("This is an acoustic guitar model %s made out of %s wood. It uses %s and it %s. %s", getModel(), getWoodType(), getStringType(), getAMPibility(), getInfo());
        return info;
    }
}
