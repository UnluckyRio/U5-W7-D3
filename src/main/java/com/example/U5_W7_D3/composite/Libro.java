package com.example.U5_W7_D3.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe che rappresenta un libro completo.
 * Contiene una struttura composita di sezioni e pagine,
 * oltre ad autori e prezzo.
 */
public class Libro {
    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<ComponenteLibro> contenuto;

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.autori = new ArrayList<>();
        this.contenuto = new ArrayList<>();
    }

    /**
     * Aggiunge un autore al libro
     */
    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    /**
     * Aggiunge un componente (pagina o sezione) al libro
     */
    public void aggiungiComponente(ComponenteLibro componente) {
        contenuto.add(componente);
    }

    /**
     * Rimuove un componente dal libro
     */
    public void rimuoviComponente(ComponenteLibro componente) {
        contenuto.remove(componente);
    }

    /**
     * Restituisce il numero totale di pagine del libro
     * sommando le pagine di tutti i componenti
     */
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (ComponenteLibro componente : contenuto) {
            totalePagine += componente.getNumeroPagine();
        }
        return totalePagine;
    }

    /**
     * Stampa l'intero libro (tutte le sezioni e pagine)
     */
    public void stampa() {
        System.out.println("\n╔═══════════════════════════════════════════════════════╗");
        System.out.println("║                    LIBRO                              ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        System.out.println("Titolo: " + titolo);
        System.out.print("Autori: ");
        if (autori.isEmpty()) {
            System.out.println("Nessun autore");
        } else {
            System.out.println(String.join(", ", autori));
        }
        System.out.println("Prezzo: €" + String.format("%.2f", prezzo));
        System.out.println("Numero totale di pagine: " + getNumeroPagine());
        System.out.println("\n--- CONTENUTO ---\n");

        // Stampa ricorsivamente tutti i componenti
        for (ComponenteLibro componente : contenuto) {
            componente.stampa();
        }

        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("║                  FINE LIBRO                           ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝\n");
    }

    // Getters e Setters

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public List<String> getAutori() {
        return autori;
    }

    public void setAutori(List<String> autori) {
        this.autori = autori;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<ComponenteLibro> getContenuto() {
        return contenuto;
    }
}

