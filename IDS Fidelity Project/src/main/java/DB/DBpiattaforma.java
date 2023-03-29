package DB;

import Model.*;

import java.util.ArrayList;
import java.util.Date;

public class DBpiattaforma {

    ArrayList<PuntoVendita> listaPuntiVendita;
    ArrayList<Cliente> listaClienti;
    ArrayList<Proprietario> listaProprietari;
    ArrayList<Staff> listaStaff;
    
    long numeroUtenti = this.listaClienti.size() + this.listaProprietari.size();

    public DBpiattaforma(){
        listaClienti = new ArrayList<Cliente>();
        listaProprietari = new ArrayList<Proprietario>();
        numeroUtenti = 0;
    }

    public Cliente trovaCliente(long codiceTessera) throws IllegalArgumentException{
        for(Cliente c : listaClienti)
            if(codiceTessera == c.getCodiceTessera())
            return c;
        throw new IllegalArgumentException("Il cliente non esiste o non e' iscritto al programma");
    }

    public PuntoVendita trovaPuntoVendita(int codicePuntoVendita) throws IllegalArgumentException{
        for(PuntoVendita p : listaPuntiVendita)
            if(p.getCodiceAttivita() == codicePuntoVendita)
                return p;
        throw new IllegalArgumentException("Il punto vendita non esiste o non e' iscritto al programma");
    }


    public void addStaff(Staff staff) {
        this.listaStaff.add(staff);
    }

    public void addProp(Proprietario proprietario) {
        this.listaProprietari.add(proprietario);
    }

    public void addCliente(Cliente cliente) {
        this.listaClienti.add(cliente);
    }

    public void addPuntoVendita(PuntoVendita attivita) {
        this.listaPuntiVendita.add(attivita);
    }

}
