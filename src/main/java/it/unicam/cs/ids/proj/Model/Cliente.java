package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class Cliente extends UtenteAutenticato {

    int punti;
    String codiceTessera;

    public Cliente(String nome, String cognome,
                   String residenza, String email,String nomeUtente, String password,
                   int punti, String codiceTessera) {
        super(nome, cognome, residenza, email,nomeUtente, password);
        this.punti=punti;
        this.codiceTessera=codiceTessera;
    }

    public Cliente(String nome, String cognome, String residenza, String email, String nomeUtente, String pwd) {
        super(nome, cognome, residenza,email,nomeUtente,pwd);
    }

    void guadagnaPunti(int punti){
        this.punti += punti;
    }

    public String getCodiceTessera(){return codiceTessera;}

    public void setCodiceTessera(String codiceTessera) {
        this.codiceTessera = codiceTessera;
    }

}
