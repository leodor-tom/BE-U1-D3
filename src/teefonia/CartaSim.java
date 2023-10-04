package teefonia;

import java.util.Arrays;

public class CartaSim {
    private long numerocell;
    private double credito;
    private Object[] listaChiamate;

    public CartaSim(long numTell) {
        this.numerocell = numTell;
        this.credito = 0;
        this.listaChiamate = null;
    }

    public long getNumerocell() {
        return numerocell;
    }

    public double getCredito() {
        return credito;
    }

    public Object[] getListaChiamate() {
        return listaChiamate;
    }

    @Override
    public String toString() {
        return "CartaSim{" +
                "numerocell=" + numerocell +
                ", credito=" + credito +
                ", listaChiamate=" + Arrays.toString(listaChiamate) +
                '}';
    }
}

