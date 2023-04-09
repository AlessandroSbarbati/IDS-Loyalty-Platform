package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class Cliente extends UtenteAutenticato {


    private int codiceTessera;
    private Tessera tessera;

    public Cliente(int codiceTessera,String nome, String cognome,
                   String residenza, String email,String nomeUtente, String password) {
        super(nome, cognome, residenza, email,nomeUtente, password);
        this.codiceTessera = codiceTessera;

    }

    public int getCodiceTessera(){return codiceTessera;}

    public Tessera getTessera() {
        return tessera;
    }
}
