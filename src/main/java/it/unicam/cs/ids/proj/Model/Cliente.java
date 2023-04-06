package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class Cliente extends UtenteAutenticato {

    int punti;
    String codiceTessera;

    public Cliente(String nome, String cognome,
                   String residenza, String email,String nomeUtente, String password) {
        super(nome, cognome, residenza, email,nomeUtente, password);

    }
    void guadagnaPunti(int punti){
        this.punti += punti;
    }

    public String getCodiceTessera(){return codiceTessera;}

    public void setCodiceTessera(String codiceTessera) {
        this.codiceTessera = codiceTessera;
    }

}
