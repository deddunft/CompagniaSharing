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

    public Veicolo ScegliVeicolo (Utente utente){
        System.out.println(databaseA.pVeicoli);
        System.out.println("Scegli un veicolo dalla lista digitando il suo codice: ");
        Scanner inn= new Scanner(System.in);
        String risp= inn.next();
        Affittamelo(utente,databaseA.getVeicolo(risp));
        if (Affittamelo(utente, databaseA.getVeicolo(risp))==false){
            System.out.println("Non puoi scegliere questo veicolo!");
            return null;

        }
        else
        return databaseA.getVeicolo(risp);


    }

    public boolean Affittamelo (Utente utente, Veicolo veicolo) {
        if (veicolo.getStato().statoa== Stato.STATO.LIB) {


            if (utente.getTipoPatente().isPatenta() == false && veicolo.patente.isPatenta() == false || utente.getTipoPatente().isPatenta() == true && veicolo.patente.isPatenta() == false) {

                veicolo.setStato(utente);
                databaseA.setRegAff(veicolo,utente);
                return true;
            } else if (utente.getTipoPatente().isPatenta() == true) {
                if (utente.getTipoPatente().getPatt() == Patente.patenteT.C1) {
                    if (veicolo.patente.getPatt() == Patente.patenteT.A1 || veicolo.patente.getPatt() == Patente.patenteT.B1 || veicolo.patente.getPatt() == Patente.patenteT.C1) {

                        veicolo.setStato(utente);
                        databaseA.setRegAff(veicolo,utente);
                        return true;

                    }
                } else if (utente.getTipoPatente().getPatt() == Patente.patenteT.B1) {
                    if (veicolo.patente.getPatt() == Patente.patenteT.C1) {
                        System.out.println("Non poi Affittare questo Veicolo");
                        return false;
                    } else {

                        veicolo.setStato(utente);
                        databaseA.setRegAff(veicolo,utente);
                        return true;



                    }

                } else if (utente.getTipoPatente().getPatt().equals(Patente.patenteT.A1)) {
                    if (veicolo.patente.getPatt().equals(Patente.patenteT.A1)) {

                        veicolo.setStato(utente);
                        databaseA.setRegAff(veicolo,utente);
                        return true;

                    } else {
                        System.out.println("Non poi Affittare questo Veicolo");
                        return false;
                    }
                }
            }

            return true;
        }
        else {
            System.out.println("Il veicolo non è disponibile");
            return false;
        }

    }



}
