package com.example.U5_W7_D3;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe di esempio che dimostra l'utilizzo del pattern Adapter
 * per rendere compatibili Info e UserData tramite InfoAdapter
 */
public class AdapterDemo {

    public static void main(String[] args) {
        // Creo un oggetto Info con i dati di una persona
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        // Creo una data di nascita (es: 15/03/1990)
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.MARCH, 15);
        Date dataNascita = cal.getTime();
        info.setDataDiNascita(dataNascita);

        // Uso l'Adapter per rendere Info compatibile con DataSource
        InfoAdapter adapter = new InfoAdapter(info);

        // Ora posso passare l'adapter a UserData
        UserData userData = new UserData();
        userData.getData(adapter);

        // Stampo i risultati
        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}

