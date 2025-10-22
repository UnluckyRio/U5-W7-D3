package com.example.U5_W7_D3.chain;

/**
 * Generale - Quinto e più alto livello della gerarchia militare
 */
public class Generale extends Ufficiale {

    @Override
    public double getStipendio() {
        return 5000.0;
    }

    @Override
    public String getGrado() {
        return "Generale";
    }

    @Override
    public String getFunzione() {
        return "Comando di divisione/corpo d'armata, decisioni strategiche nazionali";
    }

    @Override
    public int getLivelloGerarchico() {
        return 5;
    }
}

