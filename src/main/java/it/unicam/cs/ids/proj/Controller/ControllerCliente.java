package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.Cliente;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 */
public class ControllerCliente {

    static Cliente cliente;
    public static void loginCliente() throws SQLException {
        String query = "SELECT * from clienti where nomeUtente = '"
                + AutenticazioneView.inserisciNomeUtente() + "' and pwd = '"
                + AutenticazioneView.inserisciPassword() + "'";
        ResultSet rs = DBpiattaforma.executeQuery(query);
        while(rs.next())
            cliente = new Cliente(
                    (rs.getInt("id")),
                    (rs.getString("nome")),
                    (rs.getString("cognome")),
                    (rs.getString("residenza")),
                    (rs.getString("email")),
                    (rs.getString("nomeUtente")),
                    (rs.getString("pwd")));
        System.out.println(cliente.getNome() + cliente.getCognome());
        MainView.azioniClienti();
    }

    public static void aderisciProgramma() throws SQLException {
        String query = "INSERT into tessere(punti, livello, depositoCashback,"
                +      " codiceTessera, nomeProgramma) "
                + "VALUES(" + 0 + "," + 0 + "," + 0 + "," + cliente.getCodiceTessera()
                +  ",'" +  MainView.inserisciNomeProgramma() + "')";
        DBpiattaforma.insertQuery(query);
    }

    public getTessera() {
        String query = "SELECT * from clienti where nomeUtente = '"
                + AutenticazioneView.inserisciNomeUtente() + "' and pwd = '"
                + AutenticazioneView.inserisciPassword() + "'"
    }

}