package com.example.U5_W7_D3.chain;

/**
 * Tenente - Primo livello della gerarchia militare
 */
public class Tenente extends Ufficiale {

    @Override
    public double getStipendio() {
        return 1000.0;
    }

    @Override
    public String getGrado() {
        return "Tenente";
    }

    @Override
    public String getFunzione() {
        return "Comando di plotone, gestione operazioni tattiche di base";
    }

    @Override
    public int getLivelloGerarchico() {
        return 1;
    }
}

