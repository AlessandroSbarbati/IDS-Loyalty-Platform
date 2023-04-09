package it.unicam.cs.ids.proj.Model;

public class Tessera {
    private int punti;
    private int livello;
    private double depositoCashback;
    /*int codiceTessera;
    String nomeProgrammaFedelta;*/

    public Tessera() {
        punti = 0;
        livello = 0;
        depositoCashback = 0;
    }

    public int getPunti() {
        return punti;
    }

    public int getLivello() {
        return livello;
    }

    public double getDepositoCashback() {
        return depositoCashback;
    }
}
