public class Ware {

    protected String name;
    protected int bestand;
    protected double preis;

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


    //methode getränkeverkauf
    public String verkaufen(int verkaufsmenge) {
        String ausgabetext;
        bestand = bestand - verkaufsmenge;
        ausgabetext = kassenzettelDrucken(verkaufsmenge);
        return ausgabetext;
    }

    public String kassenzettelDrucken(int verkaufsmenge) {
        String kassenzettel;
        double gesamtpreis;
        gesamtpreis = preis * verkaufsmenge;
        kassenzettel = "gesamtpreis" + gesamtpreis;
        return kassenzettel;
    }

}
