import java.lang.*;


public class Getraenke extends Ware {


    private int altersbeschr;


    //Arraylist

    public Getraenke(String getraenkeName, int getrankeBestand, double getraenkePreis, int altersbeschr) {
        super(getraenkeName, getrankeBestand, getraenkePreis);
        this.altersbeschr = altersbeschr;
    }
    //get-methode

    public void setAltersbeschr(int altersbeschr) {
        this.altersbeschr = altersbeschr;
    }

    public int getAltersbeschr() {
        return altersbeschr;
    }

}
