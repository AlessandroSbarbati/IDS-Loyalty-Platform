package it.unicam.cs.ids.proj;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.AutenticazioneView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;


public class Main {

    private final static String URL = "jdbc:mysql://localhost:3306/test?";
    private final static String USER = "admin";
    private final static String PASSWORD = "admin";
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String DROP_TABLE = "DROP TABLE IF EXISTS animals";
    private final static String CREATE_TABLE = "CREATE TABLE animals (\n" +
            "     id MEDIUMINT NOT NULL AUTO_INCREMENT,\n" +
            "     name CHAR(30) NOT NULL,\n" +
            "     PRIMARY KEY (id)\n" +
            ");";
    private final static String INSERT = "INSERT INTO animals " + "(name) values (?)";
    private final static String SELECT = "SELECT * from animals";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             PreparedStatement pstmt = conn.prepareStatement(INSERT);) {
            Class.forName(DRIVER);
            stmt.executeUpdate(DROP_TABLE);
            stmt.executeUpdate(CREATE_TABLE);
        }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

            AutenticazioneView init = new AutenticazioneView();
        }
    }
}
