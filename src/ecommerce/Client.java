package ecommerce;

import java.util.Random;

public class Client {
  private   int codiceCliente;
    private String nome;

    private String cognome;
    private String email;
    private String dataIscrizione;


    public Client(String nome, String cognome, String email, String dataiscr) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataiscr;
        Random rndm = new Random();
        this.codiceCliente = rndm.nextInt(1, 1000);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  int getCodiceCliente() {
        return codiceCliente;
    }

    @Override
    public String toString() {
        return "Client{" +
                "codiceCliente=" + codiceCliente +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione='" + dataIscrizione + '\'' +
                '}';
    }
}
