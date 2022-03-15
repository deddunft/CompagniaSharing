public class Scooter extends Veicolo{

    public Rifornimento rifornimento;
    private int targa;


    public Scooter( int id, String gps, int benzina, int targa) {
        super("Sc", id, gps,0.25);
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.BENZINA,benzina);
        this.targa = targa;
    }

    public int getTarga() {
        return targa;
    }

}
