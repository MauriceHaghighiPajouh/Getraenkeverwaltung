import javax.swing.*;
import java.util.ArrayList;


public class Verkaufsfenster {

    ArrayList<Getraenke> liste;
    public JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;


    public Verkaufsfenster (ArrayList<Getraenke> liste){

        this.liste=liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());
        }
    }





}
