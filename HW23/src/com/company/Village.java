package com.company;

public class Village extends Locality{
    static Village[] arr = new Village[6];

    public Village() {}

    public Village(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String msg = "Name of the village: " + getName() + ", leader: " + getLeader();
        return msg;
    }
}