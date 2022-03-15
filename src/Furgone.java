public class Furgone extends Veicolo{

    public Rifornimento rifornimento;
    private int targa;


    public Furgone( int id, String gps, int benzina, int targa) {
        super("Fr", id, gps,0.50);
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.BENZINA,benzina);
        this.targa = targa;
    }
}
