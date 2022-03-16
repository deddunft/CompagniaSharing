import java.util.Objects;

public abstract class Veicolo {

    private String idn;
    private int id;
    private String gps;

    public Stato stato;
    private double prezzo;
    public Patente patente;


    public Veicolo(String idn, int id, String gps, Stato stato, double prezzo, Patente patente) {
        this.idn = idn;
        this.id = id;
        this.gps = gps;
        this.stato = stato;
        this.prezzo = prezzo;
        this.patente = patente;
    }

    public Stato getStato() {
        return stato;
    }

    public String getGps() {
        return gps;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getId() {
        return id;
    }

    public String getIdn() {
        return idn;
    }

    public void setStato(Utente utente) {
        this.stato.setUtaff(utente);
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
