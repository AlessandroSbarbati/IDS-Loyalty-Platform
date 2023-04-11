package it.unicam.cs.ids.proj.DB;

import java.sql.*;

public class DBpiattaforma {

    private final static String URL = "jdbc:mysql://localhost:3306/piattaforma?";
    private final static String USER = "root";
    private final static String PASSWORD = "AleWalo1!";
    public static Connection conn;

    public static void init() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connesso");
        } catch (SQLException e) {
            throw new IllegalStateException("Non connesso");
        }
    }

    public static void insertQuery(String query) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate(query);

    }


    public static ResultSet executeQuery(String query) throws SQLException {
        Statement statement = conn.createStatement();
        return statement.executeQuery(query);

    }
}