package seminarul_6.Sem6_Adapter.adapter_clase.main;

import  seminarul_6.Sem6_Adapter.adapter_clase.clase.stb.ValidatorAdapter;
import  seminarul_6.Sem6_Adapter.adapter_clase.clase.stb.ValidatorNFC;
import  seminarul_6.Sem6_Adapter.adapter_clase.clase.stb.ValidatorSTB;

public class Main {

    private static void valideaza(ValidatorSTB validator){
        validator.validareAbonament();
    }

    public static void main(String[] args) {
        ValidatorAdapter validatorAdapter = new ValidatorAdapter();
        validatorAdapter.validareBilet();
        validatorAdapter.validareAbonament();

        //cu functia statica
        ValidatorSTB val = new ValidatorNFC();
        valideaza(val);

        ValidatorAdapter validatorAdapter1 = new ValidatorAdapter();
        valideaza(validatorAdapter1);
    }
}
