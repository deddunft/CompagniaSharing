public class Furgone extends Veicolo{

    public Rifornimento rifornimento;
    private int targa;

    public Furgone(int id, String gps, int targa) {
        super("FU", id, gps, new Stato(),0.50, new Patente(true, Patente.patenteT.C1));
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.BENZINA,100);
        this.targa = targa;
    }
}
