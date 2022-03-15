import java.util.Objects;

public abstract class Veicolo {

    private String idn;
    private int id;
    private String gps;
    enum STATO { AFF,LIB}
    public STATO stato;
    private double prezzo;


    public Veicolo(String idn, int id, String gps,double prezzo) {
        this.idn = idn;
        this.id = id;
        this.gps = gps;
        this.prezzo=prezzo;

    }

    public STATO getStato() {
        return stato;
    }

    public String getGps() {
        return gps;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "id='" + idn + " "+ id +
                ", gps='" + gps + '\'' +
                ", stato=" + stato +
                '}';
    }
}
