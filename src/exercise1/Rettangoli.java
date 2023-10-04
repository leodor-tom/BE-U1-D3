package exercise1;

public class Rettangoli {
    private double altezza;
    private double larghezza;
    private double perimetro;
    private double area;



    public Rettangoli(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
        double altezza1 = this.altezza;
        double larghezza1 = this.larghezza;
        setPerimetro(altezza1, larghezza1);
        setArea(altezza1, larghezza1);

    }



    private double setPerimetro(double altezza, double larhezza ) {
      double per = (this.altezza + this.larghezza) * 2;
        return  perimetro = per;
    }

    private double setArea(double altezza, double larghezza) {
        double ar = this.altezza *this.larghezza;
        return area = ar;
    }

    public void stampaRettangolo() {
        System.out.println("Perimetro: " + this.perimetro + ", area: " + this.area);
    }

    public static void stampaRettangoli(Rettangoli R1, Rettangoli R2){
        System.out.println("perimetro1: " + R1.perimetro + ", area1: " + R1.area + ", perimetro2: " + R2.perimetro + ", area2: " + R2.area);
        System.out.println("somma perimetri: " + (R1.perimetro + R2.perimetro) + ", somma aree: " + (R1.area + R2.area));
    }
    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getPerimetro() {

        return perimetro;
    }


    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }


}
