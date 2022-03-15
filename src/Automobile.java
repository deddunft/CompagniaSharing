public class Automobile extends Veicolo {

    public Rifornimento rifornimento;
    private int targa;


    public Automobile( int id, String gps, int benzina, int targa) {
        super("Au", id, gps);
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.BENZINA,benzina);
        this.targa = targa;
    }
}
