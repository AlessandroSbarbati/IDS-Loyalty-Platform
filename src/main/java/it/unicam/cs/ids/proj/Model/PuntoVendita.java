package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class PuntoVendita {

   private String nomePuntoVendita;
   private String partitaIVA;
   private String indirizzo;

    public PuntoVendita(String nomePuntoVendita, String partitaIVA, String indirizzo){
        this.nomePuntoVendita=nomePuntoVendita;
        this.partitaIVA= partitaIVA;
        this.indirizzo = indirizzo;
    }

    public String getNomePuntoVendita() {
        return nomePuntoVendita;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
}
