package com.example.U5_W7_D3.composite;

/**
 * Leaf del pattern Composite.
 * Rappresenta una singola pagina del libro.
 */
public class Pagina extends ComponenteLibro {
    private int numeroPagina;
    private String contenuto;

    public Pagina(int numeroPagina, String contenuto) {
        this.numeroPagina = numeroPagina;
        this.contenuto = contenuto;
    }

    @Override
    public int getNumeroPagine() {
        return 1; // Una pagina singola conta sempre come 1
    }

    @Override
    public void stampa() {
        System.out.println("--- Pagina " + numeroPagina + " ---");
        System.out.println(contenuto);
        System.out.println();
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }
}

