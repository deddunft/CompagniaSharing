public class Automobile extends Veicolo {

    public Rifornimento rifornimento;
    private int targa;


    public Automobile(int id, String gps,int targa) {
        super("AU", id, gps, new Stato(), 0.30, new Patente(true, Patente.patenteT.B1));
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.BENZINA,100);
        this.targa = targa;
    }
}
