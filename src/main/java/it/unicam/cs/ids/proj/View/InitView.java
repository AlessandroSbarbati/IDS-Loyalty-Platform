package it.unicam.cs.ids.proj.View;

import it.unicam.cs.ids.proj.Controller.ControllerRegistrazione;

import java.sql.SQLException;
import java.util.Scanner;

public class InitView {

    static Scanner scanner = new Scanner(System.in);

    public void accesso() throws SQLException {
        System.out.println("Premere 1 per effettuare la registrazione \n");
        System.out.println("Premere 2 per effettuare il login \n");
        int sceltaUtente = scanner.nextInt();
        switch (sceltaUtente) {
            case 1:
                sceltaProfilo();
            case 2:
                login();
        }
    }

    private void sceltaProfilo() throws SQLException {
        System.out.println("Premere 1 per registrarti come cliente \n");
        System.out.println("Premere 2 per registrarti come proprietario \n");
        int sceltaUtente = scanner.nextInt();
        scanner.nextLine();
        switch (sceltaUtente) {
            case 1:
                ControllerRegistrazione.nuovoCliente();
                break;
            case 2:
                System.out.println("nuovo Proprietario");
        }
    }

    private void login() {}

    public static String inserisciNome() {
        System.out.println(" Inserisci il tuo nome : ");
        return scanner.nextLine();
    }
    public static String inserisciCognome() {
        System.out.println(" Inserisci il tuo cognome : ");
        return scanner.nextLine();
    }

    public static String inserisciDataNascita() {
        System.out.println(" Inserisci la tua data di nascita : ");
        return scanner.nextLine();
    }

    public static String inserisciResidenza() {
        System.out.println(" Inserisci la tua residenza : ");
        return scanner.nextLine();
    }
    public static String inserisciTelefono() {
        System.out.println(" Inserisci il tuo numero di telefono : ");
        return scanner.nextLine();
    }
    public static String inserisciEmail() {
        System.out.println(" Inserisci la tua email : ");
        return scanner.nextLine();
    }
    public static String inserisciNomeUtente() {
        System.out.println(" Inserisci il tuo nome utente : ");
        return scanner.nextLine();
    }

    public static String inserisciPassword() {
        System.out.println(" Inserisci la tua password : ");
        return scanner.nextLine();
    }

    public static Integer inserisciPartitaIVA() {
        System.out.println(" Inserisci la tua partita iva : ");
        return scanner.nextInt();
    }

    public static String inserisciIndirizzo() {
        System.out.println(" Inserisci l'indirizzo del tuo punto vendita : ");
        return scanner.nextLine();
    }

    public static int inserisciCodiceAttivita() {
        System.out.println(" Inserisci il codice del punto vendita dove l'utente lavora : ");
        return scanner.nextInt();
    }
}

