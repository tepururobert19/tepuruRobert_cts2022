package seminarul_7.decorator.clase.decorator;

import seminarul_7.decorator.PrinterBilet;

public class PrinterMesajPaste extends Decorator{

    public PrinterMesajPaste(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("Paste fericit!");
    }

    @Override
    public void afiseazaBilet() {

    }
}
