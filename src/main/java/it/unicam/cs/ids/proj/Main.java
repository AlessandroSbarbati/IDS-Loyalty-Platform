package it.unicam.cs.ids.proj;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.AutenticazioneView;

import java.sql.SQLException;

/** Questa è la classe menu, dove parte tutto
 *
 *
 *
 *
 */
public class Main {


    public static void main(String[] args) throws SQLException {
        DBpiattaforma.init();
        AutenticazioneView view = new AutenticazioneView();
        view.accesso();
    }
}

