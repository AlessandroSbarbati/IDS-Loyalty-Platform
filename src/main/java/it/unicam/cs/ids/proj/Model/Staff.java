package it.unicam.cs.ids.proj.Model;

public class Staff extends UtenteAutenticato {

    private int attivita;

    public Staff(String nome, String cognome, String dataNascita,
                 String residenza, Integer telefono, String email,
                 String nomeUtente, String password, int attivita) {
        super(nome, cognome, dataNascita, residenza, telefono, email, nomeUtente, password);
        this.attivita = attivita;
    }

}