package seminarul_6.Sem6_Adapter.adapter_clase.clase.stb;

import seminarul_6.Sem6_Adapter.adapter_obiecte.clase.metrou.ValidatorScanare;

public class ValidatorAdapter extends ValidatorScanare implements ValidatorSTB {


    @Override
    public void validareBilet() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void validareAbonament() {
        super.valideazaAbonamentMetrou();
    }
}
