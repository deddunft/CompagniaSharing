public class Monopattino extends Veicolo {

    public Rifornimento rifornimento;

    public Monopattino(int id, String gps, int carica) {
        super("Mp", id, gps);
        this.rifornimento = new Rifornimento(Rifornimento.TIPO.ELETTRICO,carica);
    }
}
