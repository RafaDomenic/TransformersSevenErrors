package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

public class AdministerAutobots {

    private static final double ENERGON_BY_REPAIR = 100.0;

    private static final double LIMIT_ENERGON_ELITE = 500.0;

    private static final double LIMIT_ENERGON_STANDARD = 200.0;

    private final List<Autobot> autobots = new ArrayList<>();

    public void addition(Autobot autobot) {
        autobots.add(autobot);
    }

    public double calculateTotalEnergon() {
        double total = 0;
        for (int i = 0; i < autobots.size(); i++) {
            total += autobots.get(i).getEnergon();
        }
        return total;
    }

    public Autobot search(String name) {
        for (Autobot autobot : autobots) {
            if (autobot.getName().equals(name)) {
                return autobot;
            }
        }
        return null;
    }

    public void repair(Autobot autobot) {
        if (autobot.getEnergon() < 0) {
            throw new RepairException("Negative energon: " + autobot.getEnergon());
        }
        autobot.addEnergon(ENERGON_BY_REPAIR);
    }

    public String classify(Autobot autobot) {
        if (autobot.getEnergon() > LIMIT_ENERGON_ELITE) {
            return "ELITE";
        } else if (autobot.getEnergon() > LIMIT_ENERGON_STANDARD) {
            return "STANDARD";
        } else {
            return "RESERVATED";
        }
    }
}
