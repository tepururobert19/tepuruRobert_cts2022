package seminarul_6.Sem6_Adapter.adapter_obiecte.main;

import seminarul_6.Sem6_Adapter.adapter_obiecte.clase.metrou.ValidatorMetrou;
import seminarul_6.Sem6_Adapter.adapter_obiecte.clase.metrou.ValidatorScanare;
import seminarul_6.Sem6_Adapter.adapter_obiecte.clase.stb.ValidatorAdapter;

public class Main {

    public static void main(String[] args) {
        ValidatorMetrou validatorMetrou = new ValidatorScanare();
        ValidatorAdapter adapter = new ValidatorAdapter(validatorMetrou);
        adapter.validareBilet();
        adapter.validareAbonament();
    }
}
