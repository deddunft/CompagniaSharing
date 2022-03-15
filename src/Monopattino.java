public class Monopattino extends Veicolo {

    public Rifornimento rifornimento;

    public Monopattino(int id, String gps, int carica) {
        super("Mp", id, gps,0.10);
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.ELETTRICO,carica);
    }
}
