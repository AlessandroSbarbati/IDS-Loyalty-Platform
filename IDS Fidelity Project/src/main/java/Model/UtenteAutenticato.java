package Model;

public abstract class UtenteAutenticato implements iUtente {
    String nome;
    String cognome;
    String dataNascita;
    String residenza;
    Integer telefono;
    String email;
    String nomeUtente;
    String password;
    long idUtente;



    public UtenteAutenticato(String nome, String cognome, String dataNascita,
                             String residenza, Integer telefono, String email,
                             String nomeUtente, String password) {
        this.cognome = cognome;
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.residenza = residenza;
        this.telefono = telefono;
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
    public String getDataNascita() {
        return dataNascita;
    }

    @Override
    public String getResidenza() {
        return residenza;
    }

    @Override
    public String getNomeUtente() {
        return nomeUtente;
    }

    @Override
    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public long getIdUtente(){return this.idUtente;}

    @Override
    public void setIdUtente(long idUtente){this.idUtente = idUtente;}

}
