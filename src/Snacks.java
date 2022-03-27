public class Snacks extends Ware {

    private boolean nuss;

    public Snacks(String snackName, int snackBestand, double snackPreis, boolean nuss) {
        super(snackName, snackBestand, snackPreis);
        this.nuss = nuss;
    }

}
