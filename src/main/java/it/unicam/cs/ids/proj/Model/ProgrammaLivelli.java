package it.unicam.cs.ids.proj.Model;

public class ProgrammaLivelli extends ProgrammaFedelta{

    int numeroLivelli;
    int sogliaLivello;
    int scontoLivello;

    public ProgrammaLivelli(String nome, String codiceAttivita, double spesa, int numeroLivelli,
                            int sogliaLivello, int scontoLivello){
        super(nome, codiceAttivita,spesa);
        this.numeroLivelli = numeroLivelli;
        this.sogliaLivello = sogliaLivello;
        this.scontoLivello = scontoLivello;
    }
}
