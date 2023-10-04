package ecommerce;


import java.util.Arrays;

public class Cart {
    private int codiceClienteAssociato;
    private String[] elencoArticoli;
    private double totCostoCarrello;

    public Cart(String[] elencoArticoli, int codice, double tot ) {
        this.codiceClienteAssociato = codice;
        this.elencoArticoli = elencoArticoli;
        this.totCostoCarrello = tot;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "codiceClienteAssociato=" + codiceClienteAssociato +
                ", elencoArticoli=" + Arrays.toString(elencoArticoli) +
                ", totCostoCarrello=€" + totCostoCarrello +
                '}';
    }
}
