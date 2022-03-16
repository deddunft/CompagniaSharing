public class Monopattino extends Veicolo {

    public Rifornimento rifornimento;

    public Monopattino( int id, String gps) {
        super("MN", id, gps, new Stato(), 0.10, new Patente(false,null));
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.ELETTRICO,100);
    }
}
