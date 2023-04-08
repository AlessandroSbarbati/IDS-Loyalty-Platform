package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.Proprietario;
import it.unicam.cs.ids.proj.Model.Staff;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerStaff {

    static Staff staff;


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
        MainView.azioniProprietario();
    }
}
