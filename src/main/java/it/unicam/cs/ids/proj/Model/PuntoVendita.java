package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class PuntoVendita {

    String nome;
    String partitaIVA;
    String indirizzo;
    int codiceAttivita;

    public PuntoVendita(String nome, String partitaIVA, String indirizzo){
        this.nome=nome;
        this.partitaIVA= partitaIVA;
        this.indirizzo = indirizzo;
    }

    public int getCodiceAttivita() {
        return codiceAttivita;
    }

}
