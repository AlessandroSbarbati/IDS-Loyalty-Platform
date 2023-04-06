/*package it.unicam.cs.ids.proj.it.unicam.cs.ids.proj.View;

import it.unicam.cs.ids.proj.it.unicam.cs.ids.proj.Controller.ControllerProprietario;
import it.unicam.cs.ids.proj.it.unicam.cs.ids.proj.Controller.*;

import java.util.Scanner;
comment
public class MainView {

    Scanner scanner;
    ControllerRegistrazione controllerR;
    ControllerProprietario controllerP;

    public MainView() {
        scanner = new Scanner(System.in);
        controllerP = new ControllerProprietario();
    }

    void azioniProprietario() {
        System.out.println("Premere 1 per aggiungere una attivita' \n");
        System.out.println("Premere 2 per aggiungere un utente staff \n");
        int sceltaUtente = scanner.nextInt();
        switch (sceltaUtente) {
            case 1:
                controllerR.nuovoPuntoVendita();
            case 2:
                controllerR.nuovoStaff();

        }
    }
*/