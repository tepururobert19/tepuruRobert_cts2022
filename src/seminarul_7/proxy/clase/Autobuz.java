package seminarul_7.proxy.clase;

public class Autobuz implements MijlocTransport{
    private int nrCalatori;
    private int nrLinie;

    public Autobuz(int nrCalatori, int nrLinie) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + nrLinie + " a oprit avand " + nrCalatori + " calatori.");
    }
}
