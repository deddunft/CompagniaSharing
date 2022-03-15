import java.util.HashMap;

public class CarSharing {

    private Database databaseA;
    private Database databaseU;


    public CarSharing(String vID, String uID){
        databaseA.getVeicolo(vID);
        databaseU.getUtente(uID);
    }



}
