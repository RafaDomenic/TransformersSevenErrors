package com.cybertron.autobot;

public class Autobot {

    private final String nome;
    private double energon;
    private final int nivel;

    public Autobot(String nome, double energon, int nivel) {
        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public double getEnergon() {
        return energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void adicionarEnergon(double quantidade) {
        this.energon += quantidade;
    }
}
