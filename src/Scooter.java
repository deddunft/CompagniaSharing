public class Scooter extends Veicolo{

    public Rifornimento rifornimento;
    private int targa;


    public Scooter(int id, String gps,  int targa) {
        super("SC", id, gps,new Stato(), 0.15, new Patente(true, Patente.patenteT.A1));
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.BENZINA,100);
        this.targa = targa;
    }

    public int getTarga() {
        return targa;
    }


}
