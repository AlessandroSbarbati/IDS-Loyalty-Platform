package it.unicam.cs.ids.proj.Model;

public class Staff extends UtenteAutenticato {

    private String codiceAttivita;

    public Staff(String nome, String cognome,
                 String residenza, String email,
                 String nomeUtente, String password, String codiceAttivita) {
        super(nome, cognome, residenza, email, nomeUtente, password);
        this.codiceAttivita = codiceAttivita;
    }

}