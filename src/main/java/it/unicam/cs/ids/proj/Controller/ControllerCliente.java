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
        if(!rs.isBeforeFirst()) {
            AutenticazioneView.erroreLogin();}
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
    public static void logoutCliente(){
        cliente=null;
    }

    public static void aderisciProgramma() throws SQLException {
        String query = "INSERT into programmiFedeltaClienti(punti, livello, depositoCashback,"
                +      " codiceTessera, nomeProgramma) "
                + "VALUES(" + 0 + "," + 0 + "," + 0 + "," + cliente.getCodiceTessera()
                +  ",'" +  MainView.inserisciNomeProgramma() + "')";
        DBpiattaforma.insertQuery(query);
    }

    public static void visualizzaProgrammaFedelta() throws SQLException {
        String query = "SELECT * from programmiFedeltaClienti where codiceTessera = '"
                + cliente.getCodiceTessera() + "' and nome = '"
                + MainView.inserisciNomeProgramma() + "'";
        ResultSet rs = DBpiattaforma.executeQuery(query);
        while (rs.next())
        System.out.println("I tuoi punti in questo programma fedeltà sono :" +rs.getInt("punti"));
        System.out.println("Il tuo livello in questo programma fedeltà è :" +rs.getInt("livello"));
        System.out.println("Il cashback disponibile in questo programma fedeltà :" + rs.getDouble("depositoCashback"));

    }

}