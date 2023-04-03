/*package DB;

import Model.Cliente;
import Model.Proprietario;
import Model.PuntoVendita;

import java.util.ArrayList;
import java.util.Date;

public class Piattaforma {

    ArrayList<PuntoVendita> puntiVendita;
    static ArrayList<Cliente> clienti;
    ArrayList<attoreAmministrativo> amministrativo;
    long numeroUtenti = this.clienti.size() + this.amministrativo.size();

    public Piattaforma(){
        clienti = new ArrayList<Cliente>();
        amministrativo = new ArrayList<attoreAmministrativo>();
        numeroUtenti = 0;
    }

    public static Cliente trovaCliente(long codiceTessera) throws IllegalArgumentException{
        for(Cliente c : clienti)
            if(codiceTessera == c.getCodiceTessera())
            return c;
        throw new IllegalArgumentException("Il cliente non esiste o non e' iscritto al programma");
    }

    public void nuovoCliente(String nome, String cognome, String dataNascita,
                             String residenza,Integer telefono ,String email , String nomeUtente, String password){

        Cliente cliente = new Cliente(nome,cognome,dataNascita,residenza,telefono,email,nomeUtente,password);
        cliente.setCodiceTessera(this.clienti.size());
        clienti.add(cliente);
    }

    public void nuovoProprietario(String nome, String cognome, String dataNascita,
                           String residenza, String nomeUtente, String password,String partitaIVA){

        Proprietario proprietario =
                new Proprietario(nome,cognome,dataNascita,residenza,nomeUtente,password, partitaIVA);
        amministrativo.add(proprietario);
    }
}*/
