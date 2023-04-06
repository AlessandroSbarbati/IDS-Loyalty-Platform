package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public abstract class UtenteAutenticato implements iUtente {
    String nome;
    String cognome;
    String residenza;
    String email;
    String nomeUtente;
    String password;



    public UtenteAutenticato(String nome, String cognome,
                             String residenza, String email,
                             String nomeUtente, String password) {
        this.cognome = cognome;
        this.nome = nome;
        this.residenza = residenza;
        this.email = email;
        this.nomeUtente = nomeUtente;
        this.password = password;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCognome() {
        return cognome;
    }

    @Override
    public String getResidenza() {
        return residenza;
    }

    @Override
    public String getEmail() { return email; }

    @Override
    public String getNomeUtente() {
        return nomeUtente;
    }

    @Override
    public String getPassword() {
        return password;
    }

}
