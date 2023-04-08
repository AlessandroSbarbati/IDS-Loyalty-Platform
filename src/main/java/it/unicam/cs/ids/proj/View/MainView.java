package it.unicam.cs.ids.proj.View;

import it.unicam.cs.ids.proj.Controller.ControllerCliente;
import it.unicam.cs.ids.proj.Controller.ControllerProgrammaFedelta;
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
        switch (AutenticazioneView.provaScannerInt()) {
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

    public static void selezioneProgrammaFedelta() throws SQLException {
        System.out.println("Premere 1 per aggiungere un programma fedeltà a punti  \n");
        System.out.println("Premere 2 per aggiungere un programma fedeltà cashback \n");
        System.out.println("Premere 3 per aggiungere un programma fedeltà VIP \n");
        System.out.println("Premere 4 per aggiungere un programma fedeltà a livelli \n");
        switch (AutenticazioneView.provaScannerInt()) {
            case 1:
                ControllerProgrammaFedelta.nuovoProgrammaPunti();
                break;
            case 2:
                ControllerProgrammaFedelta.nuovoProgrammaCashback();
                break;
            case 3:
                System.out.println("Creazione programma VIP"); //NON IMPLEMENTATO!
                break;
            case 4:
                ControllerProgrammaFedelta.nuovoProgrammaLivelli();


        }
    }

    public static void azioniClienti() throws SQLException {
        System.out.println("Premere 1 per creare una tessera  \n");
        System.out.println("Premere 2 per aggiungere un programma fedeltà cashback \n");
        System.out.println("Premere 3 per aggiungere un programma fedeltà VIP \n");
        System.out.println("Premere 4 per aggiungere un programma fedeltà a livelli \n");
        scanner.nextLine();
        switch (AutenticazioneView.provaScannerInt()) {
            case 1:
                ControllerCliente.aderisciProgramma();
            case 2:
                ControllerProgrammaFedelta.nuovoProgrammaCashback();
            case 3:
                System.out.println("Creazione programma VIP"); //NON IMPLEMENTATO!
            case 4:
                ControllerProgrammaFedelta.nuovoProgrammaLivelli();

        }
    }

    public static String inserisciNomeProgramma() {
        System.out.println(" Inserisci il nome del programma fedeltà : ");
        return scanner.nextLine();
    }

    public static String inserisciCodiceAttivitaProgramma() {
        System.out.println(" Inserisci il codice del punto vendita da assegnare al programma fedeltà: ");
        return scanner.nextLine();
    }

    public static int inserisciValorePunti() {
        System.out.println("Inserisci il numero di punti da assegnare per ogni euro di spesa");
        return AutenticazioneView.provaScannerInt();
    }

    public static int inserisciValorePremio() {
        System.out.println("Inserisci il valore del premio riscattabile dal cliente");
        return AutenticazioneView.provaScannerInt();
    }

    public static int inserisciSogliaLivello(){
        System.out.println("Inserisci la soglia in euro per raggiungere il livello");
        return AutenticazioneView.provaScannerInt();
    }

    public static int inserisciScontoLivello(){
        System.out.println("Inserisci lo sconto da assegnare al livello");
        return AutenticazioneView.provaScannerInt();
    }





}
