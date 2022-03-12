import javax.swing.*;
import java.util.ArrayList;

public class Bestandsfenster {

    ArrayList<Getraenke> liste;
    private JTable table1;
    public JPanel panel1;

    public Bestandsfenster (ArrayList<Getraenke> liste){

        this.liste=liste;
        for (Getraenke item : liste) {
        }
    }
}
