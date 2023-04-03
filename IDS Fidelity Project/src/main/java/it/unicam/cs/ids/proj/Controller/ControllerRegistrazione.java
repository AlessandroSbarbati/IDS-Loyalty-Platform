package it.unicam.cs.ids.proj.Controller;

import it.unicam.cs.ids.proj.DB.DBpiattaforma;
import it.unicam.cs.ids.proj.View.AutenticazioneView;
import it.unicam.cs.ids.proj.Model.Cliente;
import it.unicam.cs.ids.proj.Model.Proprietario;
import it.unicam.cs.ids.proj.Model.PuntoVendita;
import it.unicam.cs.ids.proj.Model.Staff;


public class ControllerRegistrazione {


    AutenticazioneView autenticazione;
    public ControllerRegistrazione(AutenticazioneView autenticazione) {
        this.autenticazione = autenticazione;
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
