import java.util.Date;

public class mein {

    public static void main(String[] args) {
        DataNascita dti = new DataNascita(15,11,1991);

        Utente io = new Utente("lucus","lrsc452",dti,new Patente(false,null),false);
        System.out.println(io.getAnni());
        CarSharing enjoy = new CarSharing();
        enjoy.RegistraUtente(io);
        Database db = new Database();
        System.out.println(db.getUtenti());
        System.out.println(enjoy.ScegliVeicolo(db.utenti.get("Ut004")));
        System.out.println(db.getRegAff());
        enjoy.terminaAff(db.utenti.get("Ut004"), db.getVeicolo("Mp01"));
        System.out.println(db.getRegAff());

    }
}
