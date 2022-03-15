import java.util.HashMap;

public class CarSharing {

    private Database databaseA;
    private Database databaseU;
    private int count=003;
    

    public CarSharing() {
        databaseA = new Database();
        databaseU = new Database();
    }

    public String RegistraUtente(Utente utente){
        if (utente.isMaggiorenne()) {
            String ut = "UT" + count;
            databaseU.setUtenti(ut, utente);
            count++;
            return utente.getNome()+" sei registrato Al Carsharing Di Nenno";
        }
        else return "Non puoi registrarti bambocio";
    }

    public Boolean



}
