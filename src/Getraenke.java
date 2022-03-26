import java.lang.*;


public class Getraenke extends Ware {

    // Attribute

    /*private String name;
    private int bestand;
    private double preis;*/

    private int altersbeschr;


    //Arraylist


    public Getraenke(String getraenkeName, int getrankeBestand, double getraenkePreis, int altersbeschr) {
        this.name = getraenkeName;
        this.bestand = getrankeBestand;
        this.preis = getraenkePreis;
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
