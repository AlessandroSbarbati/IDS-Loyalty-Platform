package it.unicam.cs.ids.proj.Model;

public class Proprietario extends UtenteAutenticato {
    private String partitaIVA;

    public Proprietario(String nome, String cognome,
                        String residenza, String email,
                        String nomeUtente, String password, String partitaIVA) {
        super(nome, cognome, residenza, email, nomeUtente, password);
        this.partitaIVA = partitaIVA;

    }

    public String getPartitaIVA() {
        return partitaIVA;
    }
}
