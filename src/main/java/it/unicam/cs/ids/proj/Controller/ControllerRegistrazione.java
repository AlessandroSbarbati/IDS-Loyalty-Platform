package it.unicam.cs.ids.proj.Controller;


import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.Model.*;


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
                autenticazione.inserisciCodiceAttivita()
        ));
        return null;
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
                return null;
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
     /*   autenticazione.inserisciNome(),
        autenticazione.inserisciIndirizzo(),
        autenticazione.inserisciPartitaIVA();*/
    }



}
