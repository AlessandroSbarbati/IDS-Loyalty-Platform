package it.unicam.cs.ids.proj.View;

import it.unicam.cs.ids.proj.Controller.ControllerCliente;
import it.unicam.cs.ids.proj.Controller.ControllerProprietario;
import it.unicam.cs.ids.proj.Controller.ControllerRegistrazione;
import it.unicam.cs.ids.proj.Controller.ControllerStaff;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 *
 */
public class AutenticazioneView {

    static Scanner scanner = new Scanner(System.in);

    public static void accesso() throws SQLException {
        boolean flag = false;
        do {
            System.out.println("Premere 1 per effettuare la registrazione \n");
            System.out.println("Premere 2 per effettuare il login \n");
            System.out.println("Premere 3 per uscire \n");


            switch (provaScannerInt()) {
                case 1 -> sceltaProfilo();
                case 2 -> login();
                case 3 -> flag=true;
            }
        }while(!flag);
        System.out.println("buon proseguimento");
    }

    private static void login() throws SQLException {

            System.out.println("Premere 1 per eseguire il login cliente \n");
            System.out.println("Premere 2 per eseguire il login proprietario \n");
            System.out.println("Premere 3 per eseguire il login staff \n");
            System.out.println("Premere 4 per tornare indietro \n");


            switch (provaScannerInt()) {
                case 1 -> ControllerCliente.loginCliente();
                case 2 -> ControllerProprietario.loginProprietario();
                case 3 -> ControllerStaff.loginStaff();
                case 4 -> AutenticazioneView.accesso();
            }

    }

    private static void sceltaProfilo() throws SQLException {
        System.out.println("Premere 1 per registrarti come cliente \n");
        System.out.println("Premere 2 per registrarti come proprietario \n");

        switch (provaScannerInt()) {
            case 1:
                ControllerRegistrazione.nuovoCliente();
                break;
            case 2:
                ControllerRegistrazione.nuovoProprietario();
        }
    }




    public static String inserisciNome() {
        System.out.println(" Inserisci il nome : ");
        return scanner.nextLine();
    }
    public static String inserisciCognome() {
        System.out.println(" Inserisci il cognome : ");
        return scanner.nextLine();
    }
    public static String inserisciResidenza() {
        System.out.println(" Inserisci la tua residenza : ");
        return scanner.nextLine();
    }
    public static String inserisciEmail() {
        System.out.println(" Inserisci la tua email : ");
        return scanner.nextLine();
    }
    public static String inserisciNomeUtente() {
        System.out.println(" Inserisci il nome utente : ");
        return scanner.nextLine();
    }

    public static String inserisciPassword() {
        System.out.println(" Inserisci la password : ");
        return scanner.nextLine();
    }

    public static String inserisciPartitaIVA() {
        System.out.println(" Inserisci la tua partita iva : ");
        return scanner.nextLine();
    }

    public static String inserisciIndirizzo() {
        System.out.println(" Inserisci l'indirizzo del tuo punto vendita : ");
        return scanner.nextLine();
    }

    public static String inserisciCodiceAttivita() {
        System.out.println(" Inserisci il codice del punto vendita : ");
        return scanner.nextLine();
    }

    public static void erroreLogin() throws SQLException {
        System.out.println("Hai inserito le credenziali sbagliate");
        login();
    }

    protected static int provaScannerInt() {
        while (true) {
            try {
                int intero = scanner.nextInt();
                scanner.nextLine();
                return intero;
            } catch (Exception e) {
                System.out.println("Cio' che hai inserito non e' un valore numerico, ritenta ");
            }
        }
    }
}



