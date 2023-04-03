package Controller;

import DB.DBpiattaforma;
import Model.*;
import View.AutenticazioneView;


public class ControllerRegistrazione {


    AutenticazioneView autenticazione;
    public ControllerRegistrazione() {
        autenticazione = new AutenticazioneView();
        autenticazione.accesso();
    }

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

    public Proprietario nuovoProp() {

                DBpiattaforma.addProp( new Proprietario(
                autenticazione.inserisciNome(),
                autenticazione.inserisciCognome(),
                autenticazione.inserisciDataDiNascita(),
                autenticazione.inserisciResidenza(),
                autenticazione.inserisciTelefono(),
                autenticazione.inserisciEmail(),
                autenticazione.inserisciNomeUtente(),
                autenticazione.inserisciResidenza(),
                autenticazione.inserisciPartitaIVA()));
    }

    public void nuovoCliente() {
        DBpiattaforma.addCliente(new Cliente(autenticazione.inserisciNome(),
                             autenticazione.inserisciCognome(),
                             autenticazione.inserisciDataDiNascita(),
                             autenticazione.inserisciResidenza(),
                             autenticazione.inserisciTelefono(),
                             autenticazione.inserisciEmail(),
                             autenticazione.inserisciNomeUtente(),
                             autenticazione.inserisciResidenza()));
    }

    public void nuovoPuntoVendita(){
        autenticazione.inserisciNome(),
        autenticazione.inserisciIndirizzo(),
        autenticazione.inserisciPartitaIVA();

    }



}
