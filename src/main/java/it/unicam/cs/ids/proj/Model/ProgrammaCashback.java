package it.unicam.cs.ids.proj.Model;

public class ProgrammaCashback extends ProgrammaFedelta {

    private double soldiCashback;

    public ProgrammaCashback(String nome, int codiceAttivita, double soldiCashback){
        super(nome, codiceAttivita);
        this.soldiCashback=soldiCashback;
    }

    public double getSoldiCashback() {
        return soldiCashback;
    }
}
