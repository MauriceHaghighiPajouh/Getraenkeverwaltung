public abstract class Ware {

    private String name;
    private int bestand;
    private double preis;

    Ware(String name, int bestand, double preis) {
        this.name = name;
        this.bestand = bestand;
        this.preis = preis;
    }

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


    //methode verkauf
    public String verkaufen(int verkaufsmenge) {
        String ausgabetext;
        bestand = bestand - verkaufsmenge;
        ausgabetext = warenkorb(verkaufsmenge);
        return ausgabetext;
    }

    public void bestellen(int bestellmenge) {
        String bestellbeleg;
        bestand = bestand + bestellmenge;
    }

    public String warenkorb(int verkaufsmenge) {
        String kassenzettel;
        double gesamtpreis;
        gesamtpreis = preis * verkaufsmenge;
        kassenzettel = "gesamtpreis" + gesamtpreis;
        return kassenzettel;
    }

}
