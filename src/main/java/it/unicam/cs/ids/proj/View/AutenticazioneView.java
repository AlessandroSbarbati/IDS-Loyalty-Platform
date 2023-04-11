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


            switch (controlloScanner()) {
                case 1 :
                     sceltaProfilo();
                     break;
                case 2 :
                     login();
                     break;
                case 3 :
                    flag=true;
                    break;
                default: System.out.println("error");
            }
        }while(!flag);
        System.out.println("Arrivederci e grazie");
    }

    private static void login() throws SQLException {

            System.out.println("Premere 1 per eseguire il login cliente \n");
            System.out.println("Premere 2 per eseguire il login proprietario \n");
            System.out.println("Premere 3 per eseguire il login staff \n");
            System.out.println("Premere 4 per tornare indietro \n");


            switch (controlloScanner()) {
                case 1 :
                    ControllerCliente.loginCliente();
                     break;
                case 2 :
                    ControllerProprietario.loginProprietario();
                    break;
                case 3 :
                    ControllerStaff.loginStaff();
                    break;
                case 4 : AutenticazioneView.accesso();
                default: System.out.println("error");
            }

    }

    private static void sceltaProfilo() throws SQLException {
        System.out.println("Premere 1 per registrarti come cliente \n");
        System.out.println("Premere 2 per registrarti come proprietario \n");

        switch (controlloScanner()) {
            case 1:
                ControllerRegistrazione.nuovoCliente();
                break;
            case 2:
                ControllerRegistrazione.nuovoProprietario();
            default: System.out.println("error");
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
        System.out.println(" Inserisci la partita iva : ");
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


    protected static int controlloScanner() {
        while (true) {
            try {
                int intero = scanner.nextInt();
                scanner.nextLine();
                return intero;
            } catch (Exception e) {
                System.out.println("Cio' che hai inserito non e' un valore numerico, ritenta ");
                scanner.nextLine();
                return 99;

            }
        }
    }
}



