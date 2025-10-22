package com.example.U5_W7_D3.chain;

/**
 * Classe di esempio che dimostra l'utilizzo del pattern Chain of Responsibility
 * per verificare quale ufficiale può gestire un determinato importo di stipendio
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        // Creo la gerarchia militare (dal più basso al più alto)
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        // Costruisco la catena di responsabilità
        // Ogni ufficiale conosce il proprio superiore
        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);
        // Il generale non ha superiori (è al vertice)

        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DI VERIFICA STIPENDI - GERARCHIA MILITARE   ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝\n");

        System.out.println("GERARCHIA MILITARE:");
        System.out.println("-------------------");
        stampaGerarchia(tenente);
        System.out.println("\n");

        // Test con diversi importi
        double[] importiDaTestare = {500, 1500, 2500, 3500, 4500, 6000};

        for (double importo : importiDaTestare) {
            System.out.println("\n═══════════════════════════════════════════════════════════");
            System.out.println("RICHIESTA: Verificare chi percepisce almeno €" + importo);
            System.out.println("═══════════════════════════════════════════════════════════");

            // La richiesta parte dal livello più basso
            tenente.gestisciRichiesta(importo);
        }

        System.out.println("\n\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                    FINE DEMO                             ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }

    /**
     * Metodo helper per stampare la gerarchia completa
     */
    private static void stampaGerarchia(Ufficiale primoUfficiale) {
        Ufficiale corrente = primoUfficiale;
        int posizione = 1;

        while (corrente != null) {
            System.out.println(posizione + ". " + corrente.getGrado() +
                    " - Stipendio: €" + corrente.getStipendio() +
                    " - Livello: " + corrente.getLivelloGerarchico());
            System.out.println("   Funzione: " + corrente.getFunzione());

            // Accedo al campo superiore tramite reflection per stampare la catena
            // In alternativa, potrei usare un getter
            try {
                java.lang.reflect.Field field = Ufficiale.class.getDeclaredField("superiore");
                field.setAccessible(true);
                corrente = (Ufficiale) field.get(corrente);
                posizione++;
            } catch (Exception e) {
                break;
            }
        }
    }
}

