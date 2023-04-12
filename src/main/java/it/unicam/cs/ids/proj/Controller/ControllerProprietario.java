package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.Proprietario;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.View.MainView;

import java.sql.ResultSet;
import java.sql.SQLException;

/** Classe che contiene tutti i metodi del proprietario
 *
 */
public class ControllerProprietario {

   private static Proprietario proprietario;


    /** Metodo che permette al Proprietario di autenticarsi nella piattaforma.
     *
     * @throws SQLException
     */
    public static void loginProprietario() throws SQLException {

        String query = "SELECT * from proprietario where nomeUtente = '"
                + AutenticazioneView.inserisciNomeUtente() + "' and pwd = '"
                + AutenticazioneView.inserisciPassword() + "'";
        ResultSet rs = DBpiattaforma.executeQuery(query);

        if (!rs.isBeforeFirst()) {
            AutenticazioneView.erroreLogin();
        }

        while (rs.next())
            proprietario = new Proprietario(
                    (rs.getString("nome")),
                    (rs.getString("cognome")),
                    (rs.getString("residenza")),
                    (rs.getString("email")),
                    (rs.getString("nomeUtente")),
                    (rs.getString("pwd")),
                    (rs.getString("partitaIVA")));
        MainView.azioniProprietario();
    }

    /**
     * metodo logout
     */
    public static void logoutProprietario(){
        proprietario = null;
    }

    /** Metodo che permette al proprietare di modificare il programma fedeltà.
     *
     * @throws SQLException
     */
    public static void modificaProgrammaFedelta() throws SQLException{
        MainView.selezioneModificaProgrammaFedelta();
    }

    public static void visualizzaProgrammaFedeltaProprietario() throws SQLException {

    int codiceAttivita = ControllerPuntoVendita.trovaPuntoVendita();
    String query = "SELECT * from programmiFedelta where codiceAttivita = "
                + codiceAttivita;
        ResultSet rs = DBpiattaforma.executeQuery(query);
        while (rs.next())
        rs.getString("nome");
    }

    /** Metodo che permette al proprietario di eliminare un programma fedeltà
     *
     * @throws SQLException
     */
    public static void cancellaProgrammaFedelta() throws SQLException {
        String nomePF = MainView.inserisciNomeProgramma();
        String query = "delete from ProgrammiFedelta where nome = '" + nomePF + "'";
        DBpiattaforma.insertQuery(query);
    }

}


