
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


    //methode verkauf + bestellen

    public void verkaufen(int verkaufsmenge) {
        bestand = bestand - verkaufsmenge;
    }
    public void bestellen(int bestellmenge){
        bestand=bestand+bestellmenge;
    }




    }




