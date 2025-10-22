package com.example.U5_W7_D3.chain;

/**
 * Capitano - Secondo livello della gerarchia militare
 */
public class Capitano extends Ufficiale {

    @Override
    public double getStipendio() {
        return 2000.0;
    }

    @Override
    public String getGrado() {
        return "Capitano";
    }

    @Override
    public String getFunzione() {
        return "Comando di compagnia, coordinamento operazioni tattiche";
    }

    @Override
    public int getLivelloGerarchico() {
        return 2;
    }
}

