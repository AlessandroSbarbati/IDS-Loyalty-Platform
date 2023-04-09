package it.unicam.cs.ids.proj.Model;

public class ProgrammaFedelta {

   private String nomeProgrammaFedelta;
   private int codiceAttivita;

    public ProgrammaFedelta(String nomeProgrammaFedelta, int codiceAttivita) {
        this.nomeProgrammaFedelta = nomeProgrammaFedelta;
        this.codiceAttivita = codiceAttivita;
    }

    public String getNomeProgrammaFedelta() {
        return nomeProgrammaFedelta;
    }

    public int getCodiceAttivita() {
        return codiceAttivita;
    }

}




