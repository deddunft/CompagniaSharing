public class Bicicletta extends Veicolo {




    public Bicicletta(int id, String gps) {
        super("BC", id, gps,new Stato(), 0.10,new Patente(false,null));



    }
}