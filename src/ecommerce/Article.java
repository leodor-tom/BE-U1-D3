package ecommerce;

import java.util.Random;

public class Article {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

    public Article(String descrizione, double prezzo, int dispo) {
        this.descrizioneArticolo = descrizione;
        this.prezzo = prezzo;
        this.pezziDisponibili = dispo;
        Random rndm = new Random();
        this.codiceArticolo = rndm.nextInt(1, 1000);
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }


    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Article{" +
                "codiceArticolo= " + codiceArticolo +
                ", descrizioneArticolo= " + descrizioneArticolo + '\'' +
                ", prezzo= €" + prezzo +
                ", pezziDisponibili= " + pezziDisponibili +
                '}';
    }
}
