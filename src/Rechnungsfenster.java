import javax.swing.*;
import java.util.ArrayList;

public class Rechnungsfenster {
    private JTable table1;
    public JPanel panel1;

    ArrayList<Getraenke> liste;

    public Rechnungsfenster (ArrayList<Getraenke> liste){

        this.liste=liste;
        for (Getraenke item : liste) {
        }
    }
}
