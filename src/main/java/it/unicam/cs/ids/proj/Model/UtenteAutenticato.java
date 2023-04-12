package it.unicam.cs.ids.proj.Model;

/** Classe Astratta che rappresenta utente autenticato nella piattaforma.
 *
 */
public abstract class UtenteAutenticato implements iUtente {
   private String nome;
   private String cognome;
   private String residenza;
   private String email;
   private String nomeUtente;
   private String password;


    /**Costruttore
     *
     * @param nome
     * @param cognome
     * @param residenza
     * @param email
     * @param nomeUtente
     * @param password
     */
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
