import java.lang.*;

public class Getraenke {

    // Attribute
    private String name;
    private int bestand;
    private double preis;
    private int altersbeschr;

    //Konstruktoren

    public Getraenke(String getraenkeName, int getrankeBestand, double getraenkePreis, int altersbeschr) {
        this.name = getraenkeName;
        this.bestand = getrankeBestand;
        this.preis = getraenkePreis;
        this.altersbeschr = altersbeschr;

    }
    //get-methode

    public String getName() {
        return name;
    }

    public int getBestand() {
        return bestand;
    }

    public double getPreis() {
        return preis;
    }

    public int getAltersbeschr() {
        return altersbeschr;
    }

    //set-methode

    public void setName(String name) {
        this.name = name;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setAltersbeschr(int altersbeschr) {
        this.altersbeschr = altersbeschr;
    }

    //kassenzettel methode
    public String kassenzettelDrucken(int verkaufsmenge) {
        String kassenzettel;
        double gesamtpreis;
        gesamtpreis = preis * verkaufsmenge;
        kassenzettel = "gesamtpreis" + gesamtpreis;
        return kassenzettel;
    }

    //methode getränkeverkauf
    public String verkaufen(int verkaufsmenge) {
        String ausgabetext;
        bestand = bestand - verkaufsmenge;
        ausgabetext = kassenzettelDrucken(verkaufsmenge);
        return ausgabetext;
    }
}
