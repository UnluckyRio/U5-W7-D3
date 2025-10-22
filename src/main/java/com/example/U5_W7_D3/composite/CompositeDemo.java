package com.example.U5_W7_D3.composite;

/**
 * Classe di esempio che dimostra l'utilizzo del pattern Composite
 * per modellare la struttura gerarchica di un libro
 */
public class CompositeDemo {

    public static void main(String[] args) {
        // Creo un libro
        Libro libro = new Libro("Design Patterns in Java", 49.99);
        libro.aggiungiAutore("Mario Rossi");
        libro.aggiungiAutore("Luigi Verdi");

        // Creo alcune pagine singole (introduzione)
        Pagina prefazione = new Pagina(1, "Questa è la prefazione del libro...");
        Pagina introduzione = new Pagina(2, "In questo libro esploreremo i design patterns...");

        libro.aggiungiComponente(prefazione);
        libro.aggiungiComponente(introduzione);

        // Creo la prima sezione: Creational Patterns
        Sezione sezioneCreational = new Sezione("Capitolo 1: Creational Patterns");

        // Creo una sottosezione per Singleton
        Sezione sottosezioneSingleton = new Sezione("1.1 Singleton Pattern");
        sottosezioneSingleton.aggiungiComponente(new Pagina(3, "Il pattern Singleton garantisce che una classe abbia una sola istanza..."));
        sottosezioneSingleton.aggiungiComponente(new Pagina(4, "Esempio di implementazione del Singleton..."));
        sottosezioneSingleton.aggiungiComponente(new Pagina(5, "Vantaggi e svantaggi del Singleton..."));

        // Creo una sottosezione per Factory
        Sezione sottosezioneFactory = new Sezione("1.2 Factory Pattern");
        sottosezioneFactory.aggiungiComponente(new Pagina(6, "Il pattern Factory fornisce un'interfaccia per creare oggetti..."));
        sottosezioneFactory.aggiungiComponente(new Pagina(7, "Esempio pratico di Factory..."));

        // Aggiungo le sottosezioni alla sezione principale
        sezioneCreational.aggiungiComponente(sottosezioneSingleton);
        sezioneCreational.aggiungiComponente(sottosezioneFactory);

        // Aggiungo la sezione al libro
        libro.aggiungiComponente(sezioneCreational);

        // Creo la seconda sezione: Structural Patterns
        Sezione sezioneStructural = new Sezione("Capitolo 2: Structural Patterns");

        // Creo sottosezioni
        Sezione sottosezioneAdapter = new Sezione("2.1 Adapter Pattern");
        sottosezioneAdapter.aggiungiComponente(new Pagina(8, "L'Adapter permette a classi incompatibili di lavorare insieme..."));
        sottosezioneAdapter.aggiungiComponente(new Pagina(9, "Implementazione dell'Adapter..."));

        Sezione sottosezioneComposite = new Sezione("2.2 Composite Pattern");
        sottosezioneComposite.aggiungiComponente(new Pagina(10, "Il Composite permette di trattare oggetti individuali e composizioni..."));
        sottosezioneComposite.aggiungiComponente(new Pagina(11, "Struttura del Composite..."));
        sottosezioneComposite.aggiungiComponente(new Pagina(12, "Esempio: struttura di un file system..."));

        sezioneStructural.aggiungiComponente(sottosezioneAdapter);
        sezioneStructural.aggiungiComponente(sottosezioneComposite);

        libro.aggiungiComponente(sezioneStructural);

        // Aggiungo una pagina finale
        Pagina conclusioni = new Pagina(13, "Conclusioni: I design patterns sono strumenti fondamentali...");
        libro.aggiungiComponente(conclusioni);

        // Dimostro le funzionalità
        System.out.println("\n========== DEMO PATTERN COMPOSITE ==========\n");

        // 1. Chiedo il numero totale di pagine del libro
        System.out.println("📖 Numero totale di pagine del libro: " + libro.getNumeroPagine());

        // 2. Chiedo il numero di pagine di una sezione specifica
        System.out.println("📚 Numero di pagine della sezione Creational: " + sezioneCreational.getNumeroPagine());
        System.out.println("📚 Numero di pagine della sezione Structural: " + sezioneStructural.getNumeroPagine());

        // 3. Stampo una singola pagina
        System.out.println("\n--- Stampa di una singola pagina ---");
        prefazione.stampa();

        // 4. Stampo una sezione specifica
        System.out.println("\n--- Stampa di una sezione ---");
        sottosezioneSingleton.stampa();

        // 5. Stampo l'intero libro
        System.out.println("\n--- Stampa dell'intero libro ---");
        libro.stampa();
    }
}

