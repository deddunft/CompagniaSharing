import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.Clock;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class Utente {

    private String nome;
    private String cf;
    private DataNascita dataNascita;
    private boolean patente;
    enum patenteT {
        A1,B1,C1
    }
    private patenteT tipoPatente;
    public DataNascita oggi = new DataNascita(15,03,2022);
    public boolean casco;
    private double saldo = 50;

    public Utente(String nome, String cf, DataNascita dataNascita, boolean patente,patenteT tipoPatente,Boolean casco) {
        this.nome = nome;
        this.cf = cf;
        this.dataNascita = dataNascita;
        this.patente = patente;
        this.tipoPatente = tipoPatente;
        this.casco = casco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getAnni(){
        if (dataNascita.getMese()>oggi.getMese()&&dataNascita.giorno>oggi.giorno){
            int anni = oggi.getAnno()-dataNascita.getAnno()-1;
            return anni;
        }
        else {
        int anni = oggi.getAnno()-dataNascita.getAnno();
        return anni;}
    }

    public boolean isMaggiorenne(){
        if (getAnni()>18){
            return true;
        }
        else return false;
    }

    public patenteT getTipoPatente() {
        return tipoPatente;
    }
    public boolean isPatente(){
        return patente;
    }

    public boolean isCasco() {
        return casco;
    }


    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cf='" + cf + '\'' +
                ", tipoPatente=" + tipoPatente +
                ", casco=" + casco +
                '}';
    }
}
