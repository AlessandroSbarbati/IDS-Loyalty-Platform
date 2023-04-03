package View;

import Controller.ControllerRegistrazione;
import Model.Cliente;
import Model.UtenteAutenticato;

import java.util.ArrayList;
import java.util.Scanner;

public class AutenticazioneView {

    Scanner scanner;
    ControllerRegistrazione controller;

    public AutenticazioneView() {
        scanner = new Scanner(System.in);
         controller = new ControllerRegistrazione();
        }


    public void accesso(){
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

    private void sceltaProfilo() {
        System.out.println("Premere 1 per registrarti come cliente \n");
        System.out.println("Premere 2 per registrarti come proprietario \n");
        int sceltaUtente = scanner.nextInt();
        switch (sceltaUtente) {
            case 1:
                controller.nuovoCliente();
            case 2:
                controller.nuovoProp();
        }
    }

    private void login() {}

    public String inserisciNome() {
        System.out.println(" Inserisci il tuo nome : ");
        return scanner.nextLine();
    }
    public String inserisciCognome() {
        System.out.println(" Inserisci il tuo cognome : ");
        return scanner.nextLine();
    }

    public String inserisciDataDiNascita() {
        System.out.println(" Inserisci la tua data di nascita : ");
        return scanner.nextLine();
    }

    public String inserisciResidenza() {
        System.out.println(" Inserisci la tua residenza : ");
        return scanner.nextLine();
    }
    public Integer inserisciTelefono() {
        System.out.println(" Inserisci il tuo numero di telefono : ");
        return scanner.nextInt();
    }
    public String inserisciEmail() {
        System.out.println(" Inserisci la tua email : ");
        return scanner.nextLine();
    }
    public String inserisciNomeUtente() {
        System.out.println(" Inserisci il tuo nome utente : ");
        return scanner.nextLine();
    }

    public String inserisciPassword() {
        System.out.println(" Inserisci la tua password : ");
        return scanner.nextLine();
    }

    public Integer inserisciPartitaIVA() {
        System.out.println(" Inserisci la tua partita iva : ");
        return scanner.nextInt();
    }

    public String inserisciIndirizzo() {
        System.out.println(" Inserisci l'indirizzo del tuo punto vendita : ");
        return scanner.nextLine();
    }

    public int inserisciCodiceAttivita() {
        System.out.println(" Inserisci il codice del punto vendita dove l'utente lavora : ");
        return scanner.nextInt();
    }
}

