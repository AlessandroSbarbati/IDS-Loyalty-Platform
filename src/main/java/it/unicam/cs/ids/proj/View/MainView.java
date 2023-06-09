package it.unicam.cs.ids.proj.View;

import it.unicam.cs.ids.proj.Controller.*;

import java.sql.SQLException;
import java.util.Scanner;

/** Classe main
 *
 * @author
 */
public class MainView {

    static Scanner scanner = new Scanner(System.in);


    /** Backoffice Proprietario
     *
     * @throws SQLException
     */
    public static void azioniProprietario() throws SQLException {
        boolean flag = false;
        do {
            System.out.println("Premere 1 per aggiungere una attivita' \n");
            System.out.println("Premere 2 per aggiungere un utente staff \n");
            System.out.println("Premere 3 per aggiungere un programma fedeltà \n");
            System.out.println("Premere 4 per cancellare un programma fedeltà \n");
            System.out.println("Premere 5 per modificare un programma fedeltà \n");
            System.out.println("Premere 6 per logout \n");

            switch (AutenticazioneView.controlloScanner()) {
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
                    break;
                case 5:
                    ControllerProprietario.modificaProgrammaFedelta();
                    break;
                case 6:{
                    ControllerProprietario.logoutProprietario();
                    flag = true;
                } break;
                default: System.out.println("error");
            }
        }while(!flag);
    }


    /** Backoffice Staff
     *
     * @throws SQLException
     */
    public static void azioniStaff() throws SQLException{
        boolean flag = false;
        do {
            System.out.println("Premere 1 per inserire i punti ad un programma fedeltà  \n");
            System.out.println("Premere 2 per rimuovere i punti ad un programma fedeltà  \n");
            System.out.println("Premere 3 per accreditare del cashback ad un programma fedeltà  \n");
            System.out.println("Premere 4 per rimuovere del cashback ad un programma fedeltà  \n");
            System.out.println("Premere 5 per aumentare il livello di un programma fedeltà  \n");
            System.out.println("Premere 6 per logout  \n");

            switch (AutenticazioneView.controlloScanner()) {
                case 1:
                    ControllerStaff.inserisciPunti(inserisciCodiceTessera(), inserisciSpesaEffettuata());
                    break;
                case 2:
                    ControllerStaff.rimuoviPunti(inserisciCodiceTessera(), inserisciPuntiDaRimuovere());
                    break;
                case 3:
                    ControllerStaff.accreditoCashback(inserisciCodiceTessera(), inserisciSpesaEffettuata());
                    break;
                case 4:
                    ControllerStaff.rimozioneSaldoCashback(inserisciCodiceTessera(), inserisciCashbackDaRimuovere());
                    break;
                case 5:
                    ControllerStaff.aumentaLivello(inserisciCodiceTessera(),inserisciSpesaEffettuata());
                    break;
                case 6:{
                    ControllerStaff.logoutStaff();
                    flag=true;} break;
                default: System.out.println("error");
            }

        }while(!flag);
    }


    /** Sezione Menu Clienti
     *
     * @throws SQLException
     */
    public static void azioniClienti() throws SQLException {
        boolean flag =false;
        do {
            System.out.println("Premere 1 per aderire ad un programma fedeltà  \n");
            System.out.println("Premere 2 per visualizzare un programma fedeltà  \n");
            System.out.println("Premere 3 per logout  \n");


            switch (AutenticazioneView.controlloScanner()) {
                case 1:
                    ControllerCliente.aderisciProgramma();
                    break;
                case 2:
                    ControllerCliente.visualizzaProgrammaFedeltaCliente();
                    break;
                case 3:{
                    ControllerCliente.logoutCliente();
                    flag = true;
                } break;
                default: System.out.println("error");


            }
        }while (!flag);

    }


    /** Metodo che permette al proprietario di creare un programma fedeltà a seconda della scelta fatta.
     *
     *
     * @throws SQLException
     */
    public static void selezioneProgrammaFedelta() throws SQLException {
        System.out.println("Premere 1 per aggiungere un programma fedeltà a punti  \n");
        System.out.println("Premere 2 per aggiungere un programma fedeltà cashback \n");
        System.out.println("Premere 3 per aggiungere un programma fedeltà VIP \n");
        System.out.println("Premere 4 per aggiungere un programma fedeltà a livelli \n");
        switch (AutenticazioneView.controlloScanner()) {
            case 1:
                ControllerProgrammaFedelta.nuovoProgrammaPunti();
                break;
            case 2:
                ControllerProgrammaFedelta.nuovoProgrammaCashback();
                break;
            case 3:
                ControllerProgrammaFedelta.nuovoProgrammaVIP();
                break;
            case 4:
                ControllerProgrammaFedelta.nuovoProgrammaLivelli();
                break;
            default: System.out.println("error");


        }
    }





    /** Metodo che permette al proprietario di scegliere quale programma fedeltà modificare.
     *
     * @throws SQLException
     */
    public static void selezioneModificaProgrammaFedelta() throws SQLException{
        System.out.println("Premere 1 per modificare un programma fedeltà a punti  \n");
        System.out.println("Premere 2 per modificare un programma fedeltà cashback \n");
        System.out.println("Premere 3 per modificare un programma fedeltà VIP \n");
        System.out.println("Premere 4 per modificare un programma fedeltà a livelli \n");
        switch (AutenticazioneView.controlloScanner()) {
            case 1:
                ControllerProgrammaFedelta.nuovoProgrammaPunti();
                break;
            case 2:
                ControllerProgrammaFedelta.nuovoProgrammaCashback();
                break;
            case 3:
                ControllerProgrammaFedelta.nuovoProgrammaVIP();
                break;
            case 4:
                ControllerProgrammaFedelta.nuovoProgrammaLivelli();
                break;
            default: System.out.println("error");
        }
    }

    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static String inserisciNomeProgramma() {
        System.out.println(" Inserisci il nome del programma fedeltà : ");
        return scanner.nextLine();
    }

    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static int inserisciValorePunti() {
        System.out.println("Inserisci il numero di punti da assegnare per ogni euro di spesa");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static int inserisciValorePremio() {
        System.out.println("Inserisci il valore del premio riscattabile dal cliente");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static int inserisciSogliaLivello(){
        System.out.println("Inserisci la soglia in euro per raggiungere il livello");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static int inserisciScontoLivello(){
        System.out.println("Inserisci lo sconto da assegnare al livello");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static int inserisciValoreCashback(){
        System.out.println("Inserisci la spesa da da effettuare per aggiungere 1 euro al tuo cashback");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static int inserisciCodiceTessera() {
        System.out.println("Inserisci il codice del cliente : ");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    public static int inserisciSpesaEffettuata() {
        System.out.println("Inserisci la spesa effettuata dal cliente :");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    private static int inserisciPuntiDaRimuovere() {
        System.out.println("Inserisci il numero di punti da rimuovere :");
        return AutenticazioneView.controlloScanner();
    }
    /** Metodo che permette di prendere in input dei dati
     *
     * @return
     */
    private static int inserisciCashbackDaRimuovere() {
        System.out.println("Inserisci il numero di euro nel cashback da rimuovere :");
        return AutenticazioneView.controlloScanner();
    }

    /** Metodo che ti riporta a visualizzaProgrammafedeltà dopo aver catturato un errore
     *
     * @throws SQLException
     */
    public static void erroreRicerca() throws SQLException {
        ControllerCliente.visualizzaProgrammaFedeltaCliente();
    }
}
