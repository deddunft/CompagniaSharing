import java.util.Date;

public class mein {

    public static void main(String[] args) {
        DataNascita dti = new DataNascita(15,11,1991);

        Utente io = new Utente("lucus","lrsc452",dti,true, Utente.patenteT.C1,false);
        System.out.println(io.getAnni());

    }
}
