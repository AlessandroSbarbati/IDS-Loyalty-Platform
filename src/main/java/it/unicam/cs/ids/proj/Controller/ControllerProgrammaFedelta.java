package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerProgrammaFedelta {

    public static void nuovoProgrammaPunti() throws SQLException {
        String nome = "";

        String query = " SELECT * from programmiFedelta where nome = '"
                + MainView.inserisciNomeProgramma() + "'" ;

        ResultSet rs = DBpiattaforma.executeQuery(query);

        if(!rs.isBeforeFirst()) {
            System.out.println("Non esiste nessuna programma fedeltà con questo nome");}

        while(rs.next())
            nome = rs.getString("nome");

        String query1 = "UPDATE programmiFedelta SET "
                + "  valorePunti = " + MainView.inserisciValorePunti()
                + ", valorePremio1 = " + MainView.inserisciValorePremio()
                + ", valorePremio2 = " + MainView.inserisciValorePremio()
                + ", valorePremio3 = " + MainView.inserisciValorePremio()
                + " WHERE nome = '" + nome + "'";
        DBpiattaforma.insertQuery(query1);
    }

    public static void nuovoProgrammaCashback() {
    }

    public static void nuovoProgrammaLivelli() {
    }
}

