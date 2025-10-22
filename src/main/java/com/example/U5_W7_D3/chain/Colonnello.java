package com.example.U5_W7_D3.chain;

/**
 * Colonnello - Quarto livello della gerarchia militare
 */
public class Colonnello extends Ufficiale {

    @Override
    public double getStipendio() {
        return 4000.0;
    }

    @Override
    public String getGrado() {
        return "Colonnello";
    }

    @Override
    public String getFunzione() {
        return "Comando di reggimento/brigata, gestione strategica";
    }

    @Override
    public int getLivelloGerarchico() {
        return 4;
    }
}

