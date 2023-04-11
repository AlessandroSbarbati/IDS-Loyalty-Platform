package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.Proprietario;
import it.unicam.cs.ids.proj.Model.Staff;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerStaff {

    private static Staff staff;


    public static void loginStaff() throws SQLException {

        String query = "SELECT * from Staff where nomeUtente = '"
                + AutenticazioneView.inserisciNomeUtente() + "' and pwd = '"
                + AutenticazioneView.inserisciPassword() + "'";
        ResultSet rs = DBpiattaforma.executeQuery(query);

        if(!rs.isBeforeFirst()) {
            AutenticazioneView.erroreLogin();}

        while(rs.next())
            staff = new Staff(
                    (rs.getString("nome")),
                    (rs.getString("cognome")),
                    (rs.getString("residenza")),
                    (rs.getString("email")),
                    (rs.getString("nomeUtente")),
                    (rs.getString("pwd")),
                    (rs.getInt("id")));
        MainView.azioniStaff();
    }
    public static void logoutStaff(){
        staff=null;
    }

    public static void inserisciPunti(int codiceTessera, int spesa) throws SQLException {
        int puntiGuadagnati = 0;
        String query = " SELECT * from programmiFedelta where nome = '"
                + MainView.inserisciNomeProgramma() + "'" ;

        ResultSet rs = DBpiattaforma.executeQuery(query);

        if(!rs.isBeforeFirst()) {
            System.out.println("Non esiste nessuna programma fedeltà con questo nome");}

        while(rs.next())
            puntiGuadagnati = rs.getInt("valorePunti") * spesa;

            String query1 = "UPDATE programmiFedeltaClienti SET "
                    + " punti = punti + " + puntiGuadagnati +
                    " where codiceTessera = " + codiceTessera ;

            DBpiattaforma.insertQuery(query1);
    }

    public static void rimuoviPunti(int codiceTessera, int puntiRimossi) throws SQLException {

        String query1 = "UPDATE programmiFedeltaClienti SET "
                + " punti = punti - " + puntiRimossi +
                " where codiceTessera = " + codiceTessera ;

        DBpiattaforma.insertQuery(query1);
    }

    public static void accreditoCashback(int codiceTessera, int spesa) throws SQLException {
        int cashbackGuadagnato = 0;
        String query = " SELECT * from programmiFedelta where nome = '"
                + MainView.inserisciNomeProgramma() + "'" ;

        ResultSet rs = DBpiattaforma.executeQuery(query);

        if(!rs.isBeforeFirst()) {
            System.out.println("Non esiste nessuna programma fedeltà con questo nome");}

        while(rs.next())
            cashbackGuadagnato = spesa/rs.getInt("valoreCashback");

        String query1 = "UPDATE programmiFedeltaClienti SET "
                + " depositoCashback = depositoCashback + " + cashbackGuadagnato +
                " where codiceTessera = " + codiceTessera ;

        DBpiattaforma.insertQuery(query1);
    }

    public static void rimozioneSaldoCashback(int codiceTessera, int cashbackRimosso) throws SQLException {
        String query1 = "UPDATE programmiFedeltaClienti SET "
                + " punti = punti - " + cashbackRimosso +
                " where codiceTessera = " + codiceTessera ;

        DBpiattaforma.insertQuery(query1);
    }

    public static void aumentaLivello() {
    }

    public static Staff getStaff() {
        return staff;
    }
}
