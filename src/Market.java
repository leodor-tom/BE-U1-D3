import ecommerce.Article;
import ecommerce.Cart;
import ecommerce.Client;

public class Market {
    public static void main(String[] args) {
        Article banana = new Article("frutto ricco di potassio", 1.50, 50);
        Article mario = new Article("Mario l'uomo comune", 100, 1000);
        Article sedia = new Article("la migliore sedia", 350, 5)      ;
        Client sgaragagarro = new Client("Franco", "Carasau", "franco.Eja@sardinia.sr", "01/01/01");
        int codice = sgaragagarro.getCodiceCliente();
        String[] elenco = {"mario", "banana", "sedia"};
        double tot = banana.getPrezzo() + mario.getPrezzo() + sedia.getPrezzo();

        Cart carrello = new Cart(elenco, codice, tot);
        System.out.println(sgaragagarro);
        System.out.println(carrello);


    }
}
