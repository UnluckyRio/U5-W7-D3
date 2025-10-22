package com.example.U5_W7_D3.chain;

/**
 * Maggiore - Terzo livello della gerarchia militare
 */
public class Maggiore extends Ufficiale {

    @Override
    public double getStipendio() {
        return 3000.0;
    }

    @Override
    public String getGrado() {
        return "Maggiore";
    }

    @Override
    public String getFunzione() {
        return "Comando di battaglione, pianificazione operazioni complesse";
    }

    @Override
    public int getLivelloGerarchico() {
        return 3;
    }
}

