import java.util.HashMap;
import java.util.Scanner;

public class CarSharing {

    private Database databaseA;
    private Database databaseU;
    public Database aff;
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

    public Veicolo ScegliVeicolo (Utente utente,String veicolo){
        System.out.println(databaseA.pVeicoli);
        System.out.println("Scegli un veicolo dalla lista digitando il suo codice: ");
        Scanner inn= new Scanner(System.in);
        String risp= inn.toString();

    }

    public void Affittamelo (String vei,String ut){
        aff.setRegAff(vei,ut);


    }



}
