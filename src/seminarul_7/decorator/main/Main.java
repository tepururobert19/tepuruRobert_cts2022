package seminarul_7.decorator.main;

import seminarul_7.decorator.PrinterBilet;
import seminarul_7.decorator.PrinterBiletConcret;

public class Main {

    public static void main(String[] args) {
        PrinterBilet printerBilet = new PrinterBiletConcret("1/12/2022", 10);
        printerBilet.afiseazaBilet();
    }

}
