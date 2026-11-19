package com.cybertron.autobot;

public class Main {

    public static void main(String[] args) {
        AdministerAutobots administer = new AdministerAutobots();

        Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);
        Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);
        Autobot ratchet = new Autobot("Ratchet", 180.0, 7);

        administer.addition(optimus);
        administer.addition(bumblebee);
        administer.addition(ratchet);

        System.out.println("Total energon: " + administer.calculateTotalEnergon());

        Autobot found = administer.search("Bumblebee");
        if (found != null) {
            System.out.println("Found: " + found.getName());
        } else {
            System.out.println("Autobot not found.");
        }

        administer.repair(ratchet);
        System.out.println("Ratchet's Energon: " + ratchet.getEnergon());
        System.out.println("Classification: " + administer.classify(ratchet));
    }
}
