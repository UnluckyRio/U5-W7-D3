package com.example.U5_W7_D3;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * Adapter che rende la classe Info compatibile con l'interfaccia DataSource.
 * Questo adapter permette a UserData di lavorare con oggetti Info
 * senza modificare le classi esistenti.
 */
public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        // Combina nome e cognome per creare il nome completo
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        // Calcola l'età dalla data di nascita
        Date dataDiNascita = info.getDataDiNascita();
        if (dataDiNascita == null) {
            return 0;
        }

        // Converte Date in LocalDate per calcolare l'età
        LocalDate birthDate = dataDiNascita.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate currentDate = LocalDate.now();

        return Period.between(birthDate, currentDate).getYears();
    }
}
package com.example.U5_W7_D3;

public interface DataSource {
    public String getNomeCompleto();
    public int getEta();
}

