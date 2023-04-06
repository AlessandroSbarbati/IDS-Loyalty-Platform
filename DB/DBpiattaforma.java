package it.unicam.cs.ids.proj.DB;

import java.sql.*;

/**
 *
 */
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

          /*      pstmt.setString(1, "dog");
                pstmt.execute();
                pstmt.setString(1, "cat");
                pstmt.execute();
                try (ResultSet rs = stmt.executeQuery(SELECT);) {
                    while (rs.next()) {
                        System.out.println("--------------------------------------");
                        System.out.println("id= " + rs.getString("id"));
                        System.out.println("nome= " + rs.getString("name"));
                        System.out.println("--------------------------------------");
                    }
                }


    public void addCliente(Cliente cliente) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             PreparedStatement pstmt = conn.prepareStatement(INSERT);) {
            Class.forName(DRIVER);
            pstmt.setObject(1, cliente);
            pstmt.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(it.unicam.cs.ids.proj.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addStaff(Staff staff) {
        try(  Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
              Statement stmt = conn.createStatement();
              PreparedStatement pstmt = conn.prepareStatement(INSERT);) {
            Class.forName(DRIVER);
            pstmt.setObject(1, staff);
            pstmt.execute();}
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(it.unicam.cs.ids.proj.Main.class.getName()).log(Level.SEVERE, null, ex);
        }




    }









     static ArrayList<PuntoVendita> listaPuntiVendita;
    static ArrayList<Cliente> listaClienti;
    static ArrayList<Proprietario> listaProprietari;
    static ArrayList<Staff> listaStaff;

    long numeroUtenti = this.listaClienti.size() + this.listaProprietari.size();

    public DBpiattaforma(){
        listaClienti = new ArrayList<Cliente>();
        listaProprietari = new ArrayList<Proprietario>();
        numeroUtenti = 0;
    }

    public static Cliente trovaCliente(long codiceTessera) throws IllegalArgumentException{
        for(Cliente c : listaClienti)
            if(codiceTessera == c.getCodiceTessera())
            return c;
        throw new IllegalArgumentException("Il cliente non esiste o non e' iscritto al programma");
    }

    public static PuntoVendita trovaPuntoVendita(int codicePuntoVendita) throws IllegalArgumentException{
        for(PuntoVendita p : listaPuntiVendita)
            if(p.getCodiceAttivita() == codicePuntoVendita)
                return p;
        throw new IllegalArgumentException("Il punto vendita non esiste o non e' iscritto al programma");
    }


    public static void addStaff(Staff staff) {
        listaStaff.add(staff);
    }

    public static void addProprietario(Proprietario proprietario) {
        listaProprietari.add(proprietario);
    }

    public static void addCliente(Cliente cliente) {
        listaClienti.add(cliente);
    }

    public static void addPuntoVendita(PuntoVendita attivita) {
        attivita.setCodiceAttivita(listaPuntiVendita.size());
        listaPuntiVendita.add(attivita);
    }
*/
}