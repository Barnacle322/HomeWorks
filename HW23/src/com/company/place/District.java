
package com.company.place;

public class District extends Locality{

    public District() {}

    public District(String name, String leader) {
        super(name, leader);
    }

    @Override
    public String toString(){
        String msg = "Name of the district: " + getName() + ", akim: " + getLeader();
        return msg;
    }
}