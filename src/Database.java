import java.util.HashMap;

public class Database {

    public HashMap<String,Utente> utenti = new HashMap<String,Utente>();
    public HashMap<String, Veicolo> pVeicoli = new HashMap<String,Veicolo>();
    public HashMap<String,String> regAff = new HashMap<String,String>();
    public String idnum;




    public Database() {

        Bicicletta bc1 = new Bicicletta(000,"02020");
        Bicicletta bc2 = new Bicicletta(001,"02010");
        Monopattino mp1 = new Monopattino(000, "0");
        Monopattino mp2 = new Monopattino(001, "0");
        Scooter sc1 = new Scooter(000,"10020",2587);
        Scooter sc2 = new Scooter(001, "1", 5004);
        Automobile au1 = new Automobile(000, "2", 1218);
        Automobile au2 = new Automobile(001, "1", 1050);
        Furgone fu1 = new Furgone(000, "2",2156 );
        Furgone fu2 = new Furgone(001, "2", 984);
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
        Utente io = new Utente("lucus","lrsc452",dti,new Patente(true, Patente.patenteT.C1),false);
        DataNascita dt1 = new DataNascita(20,2,2004);
        Utente kikku = new Utente("kikketto","kkrhuf34",dt1,new Patente(false,null),false);
        DataNascita dt2 = new DataNascita(18,3,2000);
        Utente deddu = new Utente("deddu","dert56",dt2,new Patente(true, Patente.patenteT.A1),true);
        DataNascita dt3 = new DataNascita(20,4,1992);
        Utente nenno = new Utente("nenno","nnnofr34",dt3,new Patente(true, Patente.patenteT.B1) ,true);
        utenti.put("Ut001",io);
        utenti.put("Ut002",kikku);
        utenti.put("Ut003",deddu);
        utenti.put("Ut004",nenno);

    }


    public HashMap<String, String> getRegAff() {
        return regAff;
    }

    public void setRegAff(Veicolo veicolo,Utente utente) {

        String vei = veicolo.getIdn()+veicolo.getId();
        veicolo.stato.setUtaff(utente);
        String ut = utente.getCf();
        regAff.put(vei, ut);
    }

    public HashMap<String, Utente> getUtenti() {
        return utenti;
    }

    public HashMap<String,Veicolo> getVeicoli(){
        return pVeicoli;
    }

    public Veicolo getVeicolo(String veicoloid){
        return pVeicoli.get(veicoloid);
    }
    public boolean checkVeicolo (String veicolo) {
        if (pVeicoli.containsKey(veicolo)){
            return true;
        }
        else return false;
    }
    public Utente getUtente(String utenteid){
        return utenti.get(utenteid);
    }

    public void setUtenti(String idut, Utente utente) {
       utenti.put(idut,utente);
    }

    public void setpVeicoli(HashMap<String, Veicolo> pVeicoli) {
        this.pVeicoli = pVeicoli;
    }

    public HashMap<String, Veicolo> getpVeicoli() {
        return pVeicoli;
    }
}






