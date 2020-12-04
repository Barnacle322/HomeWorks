package com.company;

public class Electric extends Guitar{
    private String model;
    boolean isThereWhammyBar;
    private String woodType;
    int pickups;

    public Electric (String model, boolean isThereWhammyBar, String woodType, int pickups) {
        this.model = model;
        this.isThereWhammyBar = isThereWhammyBar;
        this.woodType = woodType;
        this.pickups = pickups;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setThereWhammyBar(boolean isThereWhammyBar) {
        this.isThereWhammyBar = isThereWhammyBar;
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

    public String getWhammyInfo() {
        return isThereWhammyBar? "There is whammy bar available" : "There is no whammy bar available";
    }

    public String getWoodType() {
        return woodType;
    }

    public int getPickups() {
        return pickups;
    }

    @Override
    public String toString() {
        String info = String.format("This is a bass guitar model %s made out of %s wood. %s and it has %s pickups. %s", getModel(), getWoodType(), getWhammyInfo(), getPickups(), getInfo());
        return info;
    }
}
