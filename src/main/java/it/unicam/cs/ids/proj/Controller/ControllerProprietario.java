package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.Proprietario;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerProprietario {

    static Proprietario proprietario;

    public static void cancellaProgrammaFedelta() throws SQLException {
        String nomePF = AutenticazioneView.inserisciNome();
        String query = "delete from ProgrammiFedelta where nome = '" + nomePF + "'";
        DBpiattaforma.insertQuery(query);
    }

    public static void loginProprietario() throws SQLException {

        String query = "SELECT * from proprietari where nomeUtente = '"
                + AutenticazioneView.inserisciNomeUtente() + "' and pwd = '"
                + AutenticazioneView.inserisciPassword() + "'";
        ResultSet rs = DBpiattaforma.executeQuery(query);
        while(rs.next())
        proprietario = new Proprietario(
                (rs.getString("nome")),
                (rs.getString("cognome")),
                (rs.getString("residenza")),
                (rs.getString("email")),
                (rs.getString("nomeUtente")),
                (rs.getString("pwd")),
                (rs.getString("partitaIVA")));
        System.out.println(proprietario.getNome() + proprietario.getCognome());
        MainView.azioniProprietario();
    }

    public static void nuovoProgrammaPunti() {
    }

    public static void nuovoProgrammaCashback() {
    }

    public static void nuovoProgrammaLivelli() {
    }
}

