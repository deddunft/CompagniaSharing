import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {

    public HashMap<String,Utente> utenti = new HashMap<String,Utente>();
    public HashMap<String, Veicolo> pVeicoli = new HashMap<String,Veicolo>();




    public Database() {

        Bicicletta bc1 = new Bicicletta(1, "0");
        Bicicletta bc2 = new Bicicletta(2, "0");
        Monopattino mp1 = new Monopattino(1, "0", 100);
        Monopattino mp2 = new Monopattino(2, "0", 100);
        Scooter sc1 = new Scooter(1, "1", 100, 034);
        Scooter sc2 = new Scooter(2, "1", 100, 426);
        Automobile au1 = new Automobile(1, "2", 100, 739);
        Automobile au2 = new Automobile(2, "1", 100, 543);
        Furgone fu1 = new Furgone(1, "2", 100, 222);
        Furgone fu2 = new Furgone(2, "2", 100, 329);
        pVeicoli.put("Bc01",bc1);
        pVeicoli.put("Bc02",bc2);
        pVeicoli.put("Mp01",mp1);
        pVeicoli.put("Mp02", mp2);
        pVeicoli.put("Sc01",sc1);
        pVeicoli.put("Sc02",sc2);
        pVeicoli.put("Au01",au1);
        pVeicoli.put("Au02",au2);
        pVeicoli.put("Fu01",fu1);
        pVeicoli.put("Fu02",fu2);
        DataNascita dti = new DataNascita(15,11,1991);
        Utente io = new Utente("lucus","lrsc452",dti,true, Utente.patenteT.C1,false);
        DataNascita dt1 = new DataNascita(20,2,2004);
        Utente kikku = new Utente("kikketto","kkrhuf34",dt1,false,null,false);
        DataNascita dt2 = new DataNascita(18,3,2000);
        Utente deddu = new Utente("deddu","dert56",dt2,true, Utente.patenteT.A1,true);
        DataNascita dt3 = new DataNascita(20,4,1992);
        Utente nenno = new Utente("nenno","nnnofr34",dt3,true, Utente.patenteT.B1,true);
        utenti.put("Ut001",io);
        utenti.put("Ut002",kikku);
        utenti.put("Ut003",deddu);
        utenti.put("Ut004",nenno);

    }


    public Veicolo getVeicolo(String veicoloid){
        return pVeicoli.get(veicoloid);
    }
    public Utente getUtente(String utenteid){
        return utenti.get(utenteid);
    }




    }






