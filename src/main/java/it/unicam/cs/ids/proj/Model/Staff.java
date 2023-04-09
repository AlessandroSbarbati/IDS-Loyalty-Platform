package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class Staff extends UtenteAutenticato {

    private int codiceAttivita;

    public Staff(String nome, String cognome,
                 String residenza, String email,
                 String nomeUtente, String password, int codiceAttivita) {
        super(nome, cognome, residenza, email, nomeUtente, password);
        this.codiceAttivita = codiceAttivita;
    }

    public int getCodiceAttivita() {
        return codiceAttivita;
    }
}