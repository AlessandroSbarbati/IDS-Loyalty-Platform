package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class ProgrammaFedelta {

    String nome;
    String codiceAttivita;
    double spesa;

    public ProgrammaFedelta(String nome, String codiceAttivita, Double spesa){
        this.nome = nome;
        this.codiceAttivita = codiceAttivita;
        this.spesa = spesa;
    }

    double getSpesa() {return spesa;}
}



