package Model;

public interface iUtente {


         String getNome();
         String getCognome();
         String getDataNascita();
         String getResidenza();
         String getNomeUtente();
         void setNomeUtente(String nomeUtente);
         String getPassword();
         void setPassword(String password);
         long getIdUtente();
         void setIdUtente(long idUtente);
}
