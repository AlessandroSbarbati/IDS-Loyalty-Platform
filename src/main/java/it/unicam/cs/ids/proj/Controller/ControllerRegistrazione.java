package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.InitView;

import java.sql.SQLException;


public class ControllerRegistrazione {


/*
    public Staff nuovoStaff() {

        DBpiattaforma.addStaff(new Staff(
                autenticazione.inserisciNome(),
                autenticazione.inserisciCognome(),
                autenticazione.inserisciDataDiNascita(),
                autenticazione.inserisciResidenza(),
                autenticazione.inserisciTelefono(),
                autenticazione.inserisciEmail(),
                autenticazione.inserisciNomeUtente(),
                autenticazione.inserisciPassword(),
                ));
    }
*/
    public static void nuovoProprietario() throws SQLException {

                String query = "INSERT into proprietari ( nome, cognome, dataNascita, residenza, telefono," +
                " email, nomeUtente, password) VALUES('" + InitView.inserisciNome()
                                                         + "','" + InitView.inserisciCognome()
                                                         + "','" + InitView.inserisciDataNascita()
                                                         + "','" + InitView.inserisciResidenza()
                                                         + "','" + InitView.inserisciTelefono()
                                                         + "','" + InitView.inserisciEmail()
                                                         + "','" + InitView.inserisciNomeUtente()
                                                         + "','" + InitView.inserisciPassword() + "')";
        DBpiattaforma.insertQuery(query);
    }

    public static void nuovoCliente() throws SQLException {
        String query = "INSERT into clienti ( nome, cognome, dataNascita, residenza, telefono," +
                " email, nomeUtente, pwd) VALUES('" + InitView.inserisciNome()
                                                         + "','" + InitView.inserisciCognome()
                                                         + "','" + InitView.inserisciDataNascita()
                                                         + "','" + InitView.inserisciResidenza()
                                                         + "','" + InitView.inserisciTelefono()
                                                         + "','" + InitView.inserisciEmail()
                                                         + "','" + InitView.inserisciNomeUtente()
                                                         + "','" + InitView.inserisciPassword() + "')";
        DBpiattaforma.insertQuery(query);
    }
/*   public void nuovoPuntoVendita(){
        autenticazione.inserisciNome(),
        autenticazione.inserisciIndirizzo(),
        autenticazione.inserisciPartitaIVA();

    }*/



}
