package seminarul_7.main;

import seminarul_7.clase.Autobuz;
import seminarul_7.clase.Grup;
import seminarul_7.clase.MijlocTransport;
import jdk.jshell.spi.ExecutionControl;

public class Main {

    public static void main(String[] args) {
        MijlocTransport a1 = new Autobuz("STB","Mercedes",10);
        MijlocTransport a2 = new Autobuz("RATB", "OTOKAR",5);
        MijlocTransport a3 = new Autobuz("PTB", "AUDI", 40);

        MijlocTransport g1 = new Grup("Mici");
        MijlocTransport g2 = new Grup("Medii");
        MijlocTransport g3 = new Grup("flota");

        try {
            g1.adaugaMijlocTransport(a1);
            g1.adaugaMijlocTransport(a2);

            g2.adaugaMijlocTransport(a3);

            g3.adaugaMijlocTransport(g1);
            g3.adaugaMijlocTransport(g2);
        }catch (ExecutionControl.NotImplementedException e) {
            e.printStackTrace();
        }
    }

}
