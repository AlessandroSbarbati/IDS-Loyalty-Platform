package it.unicam.cs.ids.proj.Model;

public class ProgrammaLivelli extends ProgrammaFedelta{


   private int sogliaLivello1;
   private int sogliaLivello2;
   private int sogliaLivello3;
   private int scontoLivello1;
   private int scontoLivello2;
   private int scontoLivello3;

    public ProgrammaLivelli(String nome, int codiceAttivita,
                            int sogliaLivello1, int sogliaLivello2, int sogliaLivello3,
                            int scontoLivello1, int scontoLivello2, int scontoLivello3){
        super(nome, codiceAttivita);
        this.sogliaLivello1 = sogliaLivello1;
        this.sogliaLivello2 = sogliaLivello2;
        this.sogliaLivello3 = sogliaLivello3;
        this.scontoLivello1 = scontoLivello1;
        this.scontoLivello2 = scontoLivello2;
        this.scontoLivello3 = scontoLivello3;
    }

    public int getSogliaLivello1() {
        return sogliaLivello1;
    }

    public int getSogliaLivello2() {
        return sogliaLivello2;
    }

    public int getSogliaLivello3() {
        return sogliaLivello3;
    }

    public int getScontoLivello1() {
        return scontoLivello1;
    }

    public int getScontoLivello2() {
        return scontoLivello2;
    }

    public int getScontoLivello3() {
        return scontoLivello3;
    }
}
