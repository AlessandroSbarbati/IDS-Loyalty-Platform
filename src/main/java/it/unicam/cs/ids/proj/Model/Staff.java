package it.unicam.cs.ids.proj.Model;

public class Staff extends Model.UtenteAutenticato {

    private PuntoVendita attivita;

    public Staff(String nome, String cognome, String dataNascita,
                 String residenza, Integer telefono, String email,
                 String nomeUtente, String password, PuntoVendita attivita) {
        super(nome, cognome, dataNascita, residenza, telefono, email, nomeUtente, password);
        this.attivita = attivita;
    }

}