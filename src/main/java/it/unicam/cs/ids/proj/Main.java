package it.unicam.cs.ids.proj;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.InitView;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        DBpiattaforma.init();
        InitView view = new InitView();
        view.accesso();
        }
    }

