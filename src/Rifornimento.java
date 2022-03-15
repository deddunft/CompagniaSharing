public class Rifornimento {
    enum TIPO {
        ELETTRICO, BENZINA
    }
    public TIPO tipo;
    public int energ;

    public Rifornimento(TIPO tipo, int energ) {
        this.tipo = tipo;
        this.energ = energ;
    }
}
