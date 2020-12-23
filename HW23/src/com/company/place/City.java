package com.company.place;

public class City extends Locality{
    static City[] array = new City[6];

    public City() {}

    public City(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString() {
        String msg = "Name of the city: " + getName() + ", mayor: " + getLeader();
        return msg;
    }
}