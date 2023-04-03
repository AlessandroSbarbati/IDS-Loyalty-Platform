package DB;

import Model.*;

import java.util.ArrayList;
import java.util.Date;

public class DBpiattaforma {

    static ArrayList<PuntoVendita> listaPuntiVendita;
    static ArrayList<Cliente> listaClienti;
    static ArrayList<Proprietario> listaProprietari;
    static ArrayList<Staff> listaStaff;
    
    long numeroUtenti = this.listaClienti.size() + this.listaProprietari.size();

    public DBpiattaforma(){
        listaClienti = new ArrayList<Cliente>();
        listaProprietari = new ArrayList<Proprietario>();
        numeroUtenti = 0;
    }

    public static Cliente trovaCliente(long codiceTessera) throws IllegalArgumentException{
        for(Cliente c : listaClienti)
            if(codiceTessera == c.getCodiceTessera())
            return c;
        throw new IllegalArgumentException("Il cliente non esiste o non e' iscritto al programma");
    }

    public static PuntoVendita trovaPuntoVendita(int codicePuntoVendita) throws IllegalArgumentException{
        for(PuntoVendita p : listaPuntiVendita)
            if(p.getCodiceAttivita() == codicePuntoVendita)
                return p;
        throw new IllegalArgumentException("Il punto vendita non esiste o non e' iscritto al programma");
    }


    public static void addStaff(Staff staff) {
        listaStaff.add(staff);
    }

    public static void addProprietario(Proprietario proprietario) {
        listaProprietari.add(proprietario);
    }

    public static void addCliente(Cliente cliente) {
        listaClienti.add(cliente);
    }

    public static void addPuntoVendita(PuntoVendita attivita) {
        attivita.setCodiceAttivita(listaPuntiVendita.size());
        listaPuntiVendita.add(attivita);
    }

}
