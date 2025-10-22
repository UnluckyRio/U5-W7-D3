package com.example.U5_W7_D3.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite del pattern Composite.
 * Rappresenta una sezione che può contenere pagine e/o sottosezioni.
 */
public class Sezione extends ComponenteLibro {
    private String titolo;
    private List<ComponenteLibro> sottoElementi;

    public Sezione(String titolo) {
        this.titolo = titolo;
        this.sottoElementi = new ArrayList<>();
    }

    /**
     * Aggiunge un componente (pagina o sottosezione) alla sezione
     */
    public void aggiungiComponente(ComponenteLibro componente) {
        sottoElementi.add(componente);
    }

    /**
     * Rimuove un componente dalla sezione
     */
    public void rimuoviComponente(ComponenteLibro componente) {
        sottoElementi.remove(componente);
    }

    /**
     * Restituisce la lista dei componenti della sezione
     */
    public List<ComponenteLibro> getSottoElementi() {
        return sottoElementi;
    }

    @Override
    public int getNumeroPagine() {
        // Il numero di pagine è la somma delle pagine di tutti i sottoelementi
        int totalePagine = 0;
        for (ComponenteLibro componente : sottoElementi) {
            totalePagine += componente.getNumeroPagine();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("═══════════════════════════════════");
        System.out.println("SEZIONE: " + titolo);
        System.out.println("Numero di pagine: " + getNumeroPagine());
        System.out.println("═══════════════════════════════════");
        System.out.println();

        // Stampa ricorsivamente tutti i sottoelementi
        for (ComponenteLibro componente : sottoElementi) {
            componente.stampa();
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}

