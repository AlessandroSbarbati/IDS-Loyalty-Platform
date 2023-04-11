package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.AutenticazioneView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerPuntoVendita {

    public static int trovaPuntoVendita() throws SQLException {
        int codiceAttivita = 0;

        String query = " SELECT * from puntiVendita where partitaIVA = '"
                + AutenticazioneView.inserisciPartitaIVA() + "'" ;

        ResultSet rs = DBpiattaforma.executeQuery(query);

        if(!rs.isBeforeFirst()) {
            System.out.println("Non esiste nessuna puntoVendita con questa partitaIVA");}

        while(rs.next())
            codiceAttivita = rs.getInt("id");

        return codiceAttivita;
    }

    public void invioNotifiche(){
    }


}
