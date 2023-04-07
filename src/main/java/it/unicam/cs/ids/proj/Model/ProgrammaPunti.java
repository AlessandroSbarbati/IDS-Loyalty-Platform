package it.unicam.cs.ids.proj.Model;

/**
 *
 */
public class ProgrammaPunti extends ProgrammaFedelta{

    private int punti;
    private int numeroPremi;
    private int valorePremio;
    public ProgrammaPunti(String nome,String codiceAttivita, double spesa,
                          int punti, int numeroPremi, int valorePremio) {
        super(nome,codiceAttivita,spesa);
        this.punti=punti;
    }
}
