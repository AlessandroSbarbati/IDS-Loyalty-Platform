package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.Cliente;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

/**Classe che contiene tutti i metodi del del cliente
 *
 * 
 */
public class ControllerCliente {
    /** Attributo che rappresenta un cliente al momento del login
     *
     */
    private static Cliente cliente;

    /** Metodo che permette al cliete di autenticarsi nella piattaforma.
     *
     * @throws SQLException
     */
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

        MainView.azioniClienti();
    }

    /** Metodo logout
     *
     */
    public static void logoutCliente(){
        cliente=null;
    }

    /** Metodo che permette al cliente di aderire ad un programma fedeltà
     *
     * @throws SQLException
     */
    public static void aderisciProgramma() throws SQLException {

        String nome = ControllerProgrammaFedelta.trovaProgrammaFedelta();

        String query = "INSERT into programmiFedeltaClienti(punti, livello, depositoCashback,"
                +      " codiceTessera, nomeProgramma,) "
                + "VALUES(" + 0 + "," + 0 + "," + 0 + "," + cliente.getCodiceTessera()
                +  ",'" +  nome + "')";
        DBpiattaforma.insertQuery(query);
    }

    /** Metodo che permette al cliente di visualizzare gli eventuali punti raccolti, livello o il depositoCashback.
     *
     * @throws SQLException
     */
    public static void visualizzaProgrammaFedeltaCliente() throws SQLException {

        String nome = ControllerProgrammaFedelta.trovaProgrammaFedelta();

        String query = "SELECT * from programmiFedeltaClienti where codiceTessera = "
                + cliente.getCodiceTessera() + " and nome = '"
                + nome + "'";
        ResultSet rs = DBpiattaforma.executeQuery(query);
        if(!rs.isBeforeFirst()) {
            MainView.erroreRicerca();}
        while (rs.next())
        System.out.println("I tuoi punti in questo programma fedeltà sono :" +rs.getInt("punti"));
        System.out.println("Il tuo livello in questo programma fedeltà è :" +rs.getInt("livello"));
        System.out.println("Il cashback disponibile in questo programma fedeltà :" + rs.getDouble("depositoCashback"));

    }

}