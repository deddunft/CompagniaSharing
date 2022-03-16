public class Stato {
    enum STATO { AFF,LIB}
    public STATO statoa;
    public Utente Utaff;

    public Stato() {
        statoa = STATO.LIB;
    }

    public Utente getUtaff() {
        return Utaff;
    }

    public void setUtaff(Utente utaff) {
        Utaff = utaff;
        statoa=STATO.AFF;
    }



    @Override
    public String toString() {
        if (Utaff == null) {
            return
                    "stato=" + statoa;
        } else {
            return
                    "Utente Aff=" + Utaff;
        }
    }
}
