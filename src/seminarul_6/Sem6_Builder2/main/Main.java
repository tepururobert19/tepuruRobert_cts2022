package seminarul_6.Sem6_Builder2.main;

import seminarul_6.Sem6_Builder2.clase.Autobuz;
import seminarul_6.Sem6_Builder2.clase.AutobuzBuilder;

public class Main {

    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setDeschideUsi(false);
        autobuzBuilder.setNrInmatriculare("AG22ABC");
        Autobuz a = autobuzBuilder.build();
        System.out.println(a);
    }
}
