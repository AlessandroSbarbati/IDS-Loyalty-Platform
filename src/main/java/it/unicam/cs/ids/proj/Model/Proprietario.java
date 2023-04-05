package it.unicam.cs.ids.proj.Model;

import java.util.Date;

public class Proprietario extends UtenteAutenticato {
    private Integer partitaIVA;

    public Proprietario(String nome, String cognome, String dataNascita,
                        String residenza, Integer telefono, String email,
                        String nomeUtente, String password, Integer partitaIVA) {
        super(nome, cognome, dataNascita, residenza, telefono, email, nomeUtente, password);
        this.partitaIVA = partitaIVA;
    }

}
