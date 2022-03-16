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
        if (utaff!=null){
            statoa =STATO.AFF;
        }
    }
}
