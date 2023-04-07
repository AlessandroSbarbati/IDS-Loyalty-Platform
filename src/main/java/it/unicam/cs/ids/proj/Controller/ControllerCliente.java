package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.Cliente;
import it.unicam.cs.ids.proj.Model.Proprietario;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 */
public class ControllerCliente {

  static Cliente clienti;

    public static void loginCliente() throws SQLException {

        String query = "SELECT * from clienti where nomeUtente = '"
                + AutenticazioneView.inserisciNomeUtente() + "' and pwd = '"
                + AutenticazioneView.inserisciPassword() + "'";
        ResultSet rs = DBpiattaforma.executeQuery(query);
        while(rs.next());
            clienti = new Cliente(
                    (rs.getString("nome")),
                    (rs.getString("cognome")),
                    (rs.getString("residenza")),
                    (rs.getString("email")),
                    (rs.getString("nomeUtente")),
                    (rs.getString("pwd")));
        System.out.println(clienti.getNome() + clienti.getCognome());

        MainView.azioniProprietario();
    }
}