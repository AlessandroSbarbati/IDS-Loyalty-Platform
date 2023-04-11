package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerProgrammaFedelta {

    public static void nuovoProgrammaPunti() throws SQLException {
        String nome = trovaProgrammaFedelta();

        String query1 = "UPDATE programmiFedelta SET "
                + "  valorePunti = " + MainView.inserisciValorePunti()
                + ", valorePremio1 = " + MainView.inserisciValorePremio()
                + ", valorePremio2 = " + MainView.inserisciValorePremio()
                + ", valorePremio3 = " + MainView.inserisciValorePremio()
                + " WHERE nome = '" + nome + "'";
        DBpiattaforma.insertQuery(query1);
    }

    public static void nuovoProgrammaCashback() throws SQLException{
        String nome = trovaProgrammaFedelta();

        String query1 = "UPDATE programmiFedelta SET "
                + "  valoreCashback = " + MainView.inserisciValoreCashback()
                + " WHERE nome = '" + nome + "'";
        DBpiattaforma.insertQuery(query1);
    }

    public static void nuovoProgrammaVIP() {
        System.out.println("Programma VIP non disponibile"); //NON IMPLEMENTATO!
    }

    public static void nuovoProgrammaLivelli() throws SQLException{
        String nome = trovaProgrammaFedelta();

        String query1 = "UPDATE programmiFedelta SET "
                + "  valoreSoglia1 = " + MainView.inserisciSogliaLivello()
                + "  valoreSoglia2 = " + MainView.inserisciSogliaLivello()
                + "  valoreSoglia3 = " + MainView.inserisciSogliaLivello()
                + ", scontoLivello1 = " + MainView.inserisciScontoLivello()
                + ", scontoLivello2 = " + MainView.inserisciScontoLivello()
                + ", scontoLivello3 = " + MainView.inserisciScontoLivello()
                + " WHERE nome = '" + nome + "'";
        DBpiattaforma.insertQuery(query1);
    }

    public static String trovaProgrammaFedelta() throws SQLException {
        String nome = "";

        String query = " SELECT * from programmiFedelta where nome = '"
                + MainView.inserisciNomeProgramma() + "'" ;

        ResultSet rs = DBpiattaforma.executeQuery(query);

        if(!rs.isBeforeFirst()) {
            System.out.println("Non esiste nessuna programma fedeltà con questo nome");}

        while(rs.next())
            nome = rs.getString("nome");

        return nome;
    }
}


