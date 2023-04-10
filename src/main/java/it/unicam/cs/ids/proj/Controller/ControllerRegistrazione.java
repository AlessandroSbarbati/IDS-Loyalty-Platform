package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.*;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ControllerRegistrazione {


    public ControllerRegistrazione() throws SQLException {
    }

    public static void nuovoProprietario() throws SQLException {

        String query = "INSERT into proprietario ( nome, cognome, residenza," +
                " email, nomeutente, pwd, partitaIVA) VALUES('"
                + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciCognome()
                + "','" + AutenticazioneView.inserisciResidenza()
                + "','" + AutenticazioneView.inserisciEmail()
                + "','" + AutenticazioneView.inserisciNomeUtente()
                + "','" + AutenticazioneView.inserisciPassword()
                + "','" + AutenticazioneView.inserisciPartitaIVA() + "')";

        DBpiattaforma.insertQuery(query);
    }

    public static void nuovoCliente() throws SQLException {
        String query = "INSERT into clienti ( nome, cognome, residenza," +
                " email, nomeUtente, pwd) VALUES('"
                + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciCognome()
                + "','" + AutenticazioneView.inserisciResidenza()
                + "','" + AutenticazioneView.inserisciEmail()
                + "','" + AutenticazioneView.inserisciNomeUtente()
                + "','" + AutenticazioneView.inserisciPassword() + "')";
        DBpiattaforma.insertQuery(query);
    }

    public static void nuovoStaff() throws SQLException {
        int codiceAttivita = 0;

        String query = " SELECT * from puntiVendita where id = "
                + AutenticazioneView.inserisciCodiceAttivita() ;
        ResultSet rs = DBpiattaforma.executeQuery(query);
        if(!rs.isBeforeFirst()) {
            System.out.println("Non esiste nessuna attività con questo codice");}
        while(rs.next())
        codiceAttivita = rs.getInt("id");

        String query1 = "INSERT into Staff ( nome, cognome, residenza," +
                " email, nomeUtente, pwd, codiceAttivita) VALUES('"
                + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciCognome()
                + "','" + AutenticazioneView.inserisciResidenza()
                + "','" + AutenticazioneView.inserisciEmail()
                + "','" + AutenticazioneView.inserisciNomeUtente()
                + "','" + AutenticazioneView.inserisciPassword()
                + "','" + codiceAttivita + "')";

        DBpiattaforma.insertQuery(query1);
    }
    public static void nuovoPuntoVendita() throws SQLException {

        String query = "INSERT into PuntiVendita( nome, indirizzo, partitaIVA) VALUES('"
                + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciIndirizzo()
                + "','" + AutenticazioneView.inserisciPartitaIVA() + "')";

        DBpiattaforma.insertQuery(query);
    }

    public static void nuovoProgrammaFedelta() throws SQLException {

        int codiceAttivita = 0;

        String query = " SELECT * from puntiVendita where id = "
                + AutenticazioneView.inserisciCodiceAttivita() ;

        ResultSet rs = DBpiattaforma.executeQuery(query);

        if(!rs.isBeforeFirst()) {
            System.out.println("Non esiste nessuna attività con questo codice");}

        while(rs.next())
            codiceAttivita = rs.getInt("id");

        String query1 = "INSERT into ProgrammiFedelta(nome, codiceAttivita) " +
                "VALUES('"
                +         MainView.inserisciNomeProgramma()
                + "','" + codiceAttivita + "')";
        DBpiattaforma.insertQuery(query1);
        MainView.selezioneProgrammaFedelta();
    }
}
