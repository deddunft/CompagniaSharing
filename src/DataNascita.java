public class DataNascita {

    public int giorno;
    public int mese;
    public int anno;
    public int cazz;

    public DataNascita(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnni(DataNascita datagiorno){
        cazz = datagiorno.getAnno()-anno;
        if (datagiorno.getMese()>datagiorno.getMese()){

            return cazz-1;
        }
        else {return cazz;}
    }
}
