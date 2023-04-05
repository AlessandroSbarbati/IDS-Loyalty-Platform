package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.AutenticazioneView;

import java.sql.SQLException;


public class ControllerRegistrazione {


    public static void nuovoProprietario() throws SQLException {

        String query = "INSERT into proprietari ( nome, cognome, dataNascita, residenza, telefono," +
                " email, nomeUtente, password) VALUES('" + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciCognome()
                + "','" + AutenticazioneView.inserisciDataNascita()
                + "','" + AutenticazioneView.inserisciResidenza()
                + "','" + AutenticazioneView.inserisciTelefono()
                + "','" + AutenticazioneView.inserisciEmail()
                + "','" + AutenticazioneView.inserisciNomeUtente()
                + "','" + AutenticazioneView.inserisciPassword() + "')";
        DBpiattaforma.insertQuery(query);
    }

    public static void nuovoCliente() throws SQLException {
        String query = "INSERT into clienti ( nome, cognome, dataNascita, residenza, telefono," +
                " email, nomeUtente, pwd) VALUES('" + AutenticazioneView.inserisciNome()
                + "','" + AutenticazioneView.inserisciCognome()
                + "','" + AutenticazioneView.inserisciDataNascita()
                + "','" + AutenticazioneView.inserisciResidenza()
                + "','" + AutenticazioneView.inserisciTelefono()
                + "','" + AutenticazioneView.inserisciEmail()
                + "','" + AutenticazioneView.inserisciNomeUtente()
                + "','" + AutenticazioneView.inserisciPassword() + "')";
        DBpiattaforma.insertQuery(query);
    }

}
