import exercise1.Rettangoli;

import static exercise1.Rettangoli.stampaRettangoli;

public class Rettangolo {
    public static void main(String[] args) {

        Rettangoli franco = new Rettangoli(15,12);
        Rettangoli ajeje = new Rettangoli(16.3,132);
        ajeje.stampaRettangolo();
        stampaRettangoli( franco,  ajeje);



    }
}