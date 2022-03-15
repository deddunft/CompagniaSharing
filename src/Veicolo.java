import java.util.Objects;

public abstract class Veicolo {

    private String idn;
    private int id;
    private String gps;
    enum STATO { AFF,LIB}
    public STATO stato;


    public Veicolo(String idn, int id, String gps) {
        this.idn = idn;
        this.id = id;
        this.gps = gps;
    }

    public STATO getStato() {
        return stato;
    }

    public String getGps() {
        return gps;
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
