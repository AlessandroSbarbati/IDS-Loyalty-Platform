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

    public void nuovoStaff() {

        DBpiattaforma.addStaff(new Staff(
                autenticazione.inserisciNome(),
                autenticazione.inserisciCognome(),
                autenticazione.inserisciDataDiNascita(),
                autenticazione.inserisciResidenza(),
                autenticazione.inserisciTelefono(),
                autenticazione.inserisciEmail(),
                autenticazione.inserisciNomeUtente(),
                autenticazione.inserisciPassword(),
                autenticazione.inserisciCodiceAttivita()
                ));
    }

    public void nuovoProprietario() {

                DBpiattaforma.addProprietario( new Proprietario(
                autenticazione.inserisciNome(),
                autenticazione.inserisciCognome(),
                autenticazione.inserisciDataDiNascita(),
                autenticazione.inserisciResidenza(),
                autenticazione.inserisciTelefono(),
                autenticazione.inserisciEmail(),
                autenticazione.inserisciNomeUtente(),
                autenticazione.inserisciPassword(),
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
                             autenticazione.inserisciPassword()));
    }

    public void nuovoPuntoVendita(){

        DBpiattaforma.addPuntoVendita(new PuntoVendita(
        autenticazione.inserisciNome(),
        autenticazione.inserisciIndirizzo(),
        autenticazione.inserisciPartitaIVA()));
    }



}
