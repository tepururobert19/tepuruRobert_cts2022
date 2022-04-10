package seminarul_7.decorator.clase.decorator;

import seminarul_7.decorator.PrinterBilet;

public class PrinterMesajSpecial extends Decorator{
    public PrinterMesajSpecial(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaBilet() {

    }

    @Override
    public void afiseazaVerso() {

    }
}
