package it.unicam.cs.ids.proj.Model;

public class ProgrammaCashback extends ProgrammaFedelta {

    double soldiCashback;

    public ProgrammaCashback(String nome, String codiceAttivita, double spesa, double soldiCashback){
        super(nome, codiceAttivita,spesa);
        this.soldiCashback=soldiCashback;
    }
}
