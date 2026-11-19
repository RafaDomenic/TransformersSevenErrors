package com.cybertron.autobot;

public class Autobot {

    private final String name;
    private double energon;
    private final int level;

    public Autobot(String name, double energon, int level) {
        this.name = name;
        this.energon = energon;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public double getEnergon() {
        return energon;
    }

    public int getLevel() {
        return level;
    }

    public void addEnergon(double quantity) {
        this.energon += quantity;
    }
}
