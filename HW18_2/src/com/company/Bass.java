package com.company;

public class Bass extends Guitar{
    private String model;
    boolean areThereKnobs;
    private String woodType;
    int pickups;

    public Bass (String model, boolean areThereKnobs, String woodType, int pickups) {
        this.model = model;
        this.areThereKnobs = areThereKnobs;
        this.woodType = woodType;
        this.pickups = pickups;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAreThereKnobs(boolean areThereKnobs) {
        this.areThereKnobs = areThereKnobs;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public void setPickups(int pickups) {
        this.pickups = pickups;
    }

    public String getModel() {
        return model;
    }

    public String getKnobsability() {
        return areThereKnobs? "There are adjusting knobs" : "There are no adjusting knobs";
    }

    public String getWoodType() {
        return woodType;
    }

    public int getPickups() {
        return pickups;
    }

    @Override
    public String toString() {
        String info = String.format("This is a bass guitar model %s made out of %s wood. %s and it has %s pickups. %s", getModel(), getWoodType(), getKnobsability(), getPickups(), getInfo());
        return info;
    }
}
