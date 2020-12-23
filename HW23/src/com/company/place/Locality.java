package com.company.place;

public abstract  class Locality {
    private String name;
    private String leader;

    public Locality(){}

    public Locality(String name, String leader) {
        this.name = name;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}