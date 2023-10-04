package ecommerce;


import java.util.Arrays;

public class Cart {
    private Client cliente;
    private Article[] elencoArticoli  = new Article[0];
    private double totCostoCarrello;

    public Cart( Client cliente ) {
        this.cliente = cliente;
    }

    public void aggiungiArticolo(Article nuovoArticolo) {
        Article[] nuovoElenco = new Article[elencoArticoli.length + 1];
        System.arraycopy(elencoArticoli, 0, nuovoElenco, 0, elencoArticoli.length);
        nuovoElenco[nuovoElenco.length - 1] = nuovoArticolo;
        elencoArticoli = nuovoElenco;
        totCostoCarrello += nuovoArticolo.getPrezzo();
    }
    @Override
    public String toString() {
        return "Cart{" +
                "codiceClienteAssociato=" + cliente.getCodiceCliente() +
                ", elencoArticoli=" + Arrays.toString(elencoArticoli) +
                ", totCostoCarrello=€" + totCostoCarrello +
                '}';
    }
}
