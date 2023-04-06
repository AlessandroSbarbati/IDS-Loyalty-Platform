package it.unicam.cs.ids.proj.View;

import it.unicam.cs.ids.proj.Controller.ControllerProprietario;
import it.unicam.cs.ids.proj.Controller.ControllerRegistrazione;
import java.sql.SQLException;
import java.util.Scanner;

public class MainView {

    static Scanner scanner = new Scanner(System.in);

    public static void azioniProprietario() throws SQLException {
        System.out.println("Premere 1 per aggiungere una attivita' \n");
        System.out.println("Premere 2 per aggiungere un utente staff \n");
        System.out.println("Premere 3 per aggiungere un programma fedeltà \n");
        System.out.println("Premere 4 per cancellare un programma fedeltà \n");
        int sceltaUtente = scanner.nextInt();
        switch (sceltaUtente) {
            case 1:
                ControllerRegistrazione.nuovoPuntoVendita();
                break;
            case 2:
                ControllerRegistrazione.nuovoStaff();
                break;
            case 3:
                ControllerRegistrazione.nuovoProgrammaFedelta();
                break;
            case 4:
                ControllerProprietario.cancellaProgrammaFedelta();

        }
    }

    public static void selezioneProgrammaFedelta() {
        System.out.println("Premere 1 per aggiungere un programma fedeltà a punti  \n");
        System.out.println("Premere 2 per aggiungere un programma fedeltà cashback \n");
        System.out.println("Premere 3 per aggiungere un programma fedeltà VIP \n");
        System.out.println("Premere 4 per aggiungere un programma fedeltà a livelli \n");
        int sceltaUtente = scanner.nextInt();
        switch (sceltaUtente) {
            case 1:
                ControllerProprietario.nuovoProgrammaPunti();
                break;
            case 2:
                ControllerProprietario.nuovoProgrammaCashback();
                break;
            case 3:
                System.out.println("Creazione programma VIP"); //NON IMPLEMENTATO!
                break;
            case 4:
                ControllerProprietario.nuovoProgrammaLivelli();


        }
    }
}
