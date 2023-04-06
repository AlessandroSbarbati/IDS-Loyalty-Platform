package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.*;
import java.sql.SQLException;


public class ControllerRegistrazione {


    public static void nuovoProprietario() throws SQLException {

        String query = "INSERT into proprietari ( nome, cognome, residenza," +
                " email, nomeUtente, pwd, partitaIVA) VALUES('"
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
        String query = "INSERT into Staff ( nome, cognome, residenza," +
                " email, nomeUtente, pwd, codiceAttivita) VALUES('" + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciCognome()
                + "','" + AutenticazioneView.inserisciResidenza()
                + "','" + AutenticazioneView.inserisciEmail()
                + "','" + AutenticazioneView.inserisciNomeUtente()
                + "','" + AutenticazioneView.inserisciPassword()
                + "','" + AutenticazioneView.inserisciCodiceAttivita() + "')";

        DBpiattaforma.insertQuery(query);
    }
    public static void nuovoPuntoVendita() throws SQLException {

        String query = "INSERT into PuntiVendita( nome, indirizzo, partitaIVA) VALUES('"
                + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciIndirizzo()
                + "','" + AutenticazioneView.inserisciPartitaIVA() + "')";

        DBpiattaforma.insertQuery(query);
    }

    public static void nuovoProgrammaFedelta() throws SQLException {

        String query = "INSERT into ProgrammiFedelta(nome, codiceAttivita) VALUES('"
                +         AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciCodiceAttivita() + "')";
        DBpiattaforma.insertQuery(query);
        MainView.selezioneProgrammaFedelta();
    }
}
