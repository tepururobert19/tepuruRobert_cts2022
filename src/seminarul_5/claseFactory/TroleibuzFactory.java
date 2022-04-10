package seminarul_5.claseFactory;

public class TroleibuzFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
