import java.lang.*;

public class Getraenke {

    // Attribute
    private String name;
    private int bestand;
    private double preis;

    //Konstruktoren

    public Getraenke(String getraenkeName, int getrankeBestand, double getraenkePreis) {
        this.name = getraenkeName;
        this.bestand = getrankeBestand;
        this.preis = getraenkePreis;

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
}
