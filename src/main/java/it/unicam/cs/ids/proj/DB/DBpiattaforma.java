package it.unicam.cs.ids.proj.DB;

import java.sql.*;

/** Questa classe si occupa del collegamento al database mysql
 *
 */
public class DBpiattaforma {
    /**
     * attributo che contiene la directory per il databse.
     */
    private final static String URL = "jdbc:mysql://localhost:3306/loyalitydb?";
    /**
     * attributo che contiene il nome dello user.
     */
    private final static String USER = "root";
    /**
     * attributo che contiene la password per accedere al database.
     */
    private final static String PASSWORD = "Walixcamel12";
    public static Connection conn;

    /**
     * Metodo per far partire la connessione al database
     */
    public static void init() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connesso");
        } catch (SQLException e) {
            throw new IllegalStateException("Non connesso");
        }
    }

    /** Metodo per inserire delle query nel databse
     *
     * @param query
     * @throws SQLException
     */
    public static void insertQuery(String query) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate(query);

    }

    /** Metodo per eseguire delle query nel databse
     *
     * @param query
     * @return
     * @throws SQLException
     */
    public static ResultSet executeQuery(String query) throws SQLException {
        Statement statement = conn.createStatement();
        return statement.executeQuery(query);

    }
}