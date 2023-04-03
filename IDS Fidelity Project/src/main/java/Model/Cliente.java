package Model;

public class Cliente extends UtenteAutenticato {

    int punti;
    long codiceTessera;

    public Cliente(String nome, String cognome, String dataNascita,
                   String residenza, Integer telefono, String email,
                   String nomeUtente, String password) {
        super(nome, cognome, dataNascita, residenza, telefono, email, nomeUtente, password);

    }
    void guadagnaPunti(int punti){
        this.punti += punti;
    }

    public long getCodiceTessera(){return codiceTessera;}

    public void setCodiceTessera(int codiceTessera) {
        this.codiceTessera = codiceTessera;
    }
}
