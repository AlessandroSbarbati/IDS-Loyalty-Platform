package Model;

public class PuntoVendita {

    String nome;
    Integer partitaIVA;
    String indirizzo;
    int codiceAttivita;
    ProgrammaFedelta pf;

    public PuntoVendita(String nome, String indirizzo, Integer partitaIVA){
     this.nome=nome;
     this.indirizzo = indirizzo;
     this.partitaIVA= partitaIVA;

    }

    public int getCodiceAttivita() {
        return codiceAttivita;
    }

    public void setCodiceAttivita(int codiceAttivita) {
        this.codiceAttivita = codiceAttivita;
    }

    void setProgrammaFedelta(ProgrammaFedelta pf) {
        this.pf= pf;
    }
}
