public class Patente {
    public boolean patenta;
    enum patenteT {
        A1,B1,C1

    }
    public patenteT patt;

    public Patente(boolean patenta, patenteT patt) {
        this.patenta = patenta;
        if (patenta == false){
            patt =null;
        }
        else {
            this.patt = patt;
        }
    }

    public patenteT getPatt() {
        return patt;
    }

    public boolean isPatenta() {
        return patenta;
    }
}
