package seminarul_5.claseFactory;

public abstract class MijlocTransport {
    protected String nrInmatriculare;

    public MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afiseazaDescriere();
}
