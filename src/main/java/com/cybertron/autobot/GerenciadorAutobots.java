package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAutobots {

    private static final double ENERGON_POR_REPARO = 100.0;

    private static final double LIMITE_ENERGON_ELITE = 500.0;

    private static final double LIMITE_ENERGON_PADRAO = 200.0;

    private final List<Autobot> autobots = new ArrayList<>();

    public void adicionar(Autobot autobot) {
        autobots.add(autobot);
    }

    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i < autobots.size(); i++) {
            total += autobots.get(i).getEnergon();
        }
        return total;
    }

    public Autobot buscar(String nome) {
        for (Autobot autobot : autobots) {
            if (autobot.getNome().equals(nome)) {
                return autobot;
            }
        }
        return null;
    }

    public void reparar(Autobot autobot) {
        if (autobot.getEnergon() < 0) {
            throw new ReparoException("Energon negativo: " + autobot.getEnergon());
        }
        autobot.adicionarEnergon(ENERGON_POR_REPARO);
    }

    public String classificar(Autobot autobot) {
        if (autobot.getEnergon() > LIMITE_ENERGON_ELITE) {
            return "ELITE";
        } else if (autobot.getEnergon() > LIMITE_ENERGON_PADRAO) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }
}
