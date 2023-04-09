package it.unicam.cs.ids.proj.Model;

public class ProgrammaPunti extends ProgrammaFedelta{

    private int valorePunti;
    private int valorePremio1;
    private int valorePremio2;
    private int valorePremio3;

    public ProgrammaPunti(String nome, int codiceAttivita, int valorePunti, int valorePremio1, int valorePremio2, int valorePremio3){
        super(nome, codiceAttivita);
        this.valorePunti = valorePunti;
        this.valorePremio1 = valorePremio1;
        this.valorePremio2=valorePremio2;
        this.valorePremio3=valorePremio3;
    }

    public int getValorePunti() {
        return valorePunti;
    }

    public int getValorePremio1() {
        return valorePremio1;
    }

    public int getValorePremio2() {
        return valorePremio2;
    }

    public int getValorePremio3() {
        return valorePremio3;
    }
}
