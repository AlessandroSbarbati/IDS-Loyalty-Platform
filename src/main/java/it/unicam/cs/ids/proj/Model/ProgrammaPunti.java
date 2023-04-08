package it.unicam.cs.ids.proj.Model;

public class ProgrammaPunti extends ProgrammaFedelta{

    int valorePunti;
    int numeroPremi;
    int valorePremio;

    public ProgrammaPunti(String nome, int codiceAttivita, int valorePunti, int numeroPremi, int valorePremio){
        super(nome, codiceAttivita);
        this.valorePunti = valorePunti;
        this.numeroPremi = numeroPremi;
        this.valorePremio = valorePremio;
    }
}
