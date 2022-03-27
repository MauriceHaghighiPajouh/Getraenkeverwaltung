import javax.swing.*;
import java.util.ArrayList;


public class Bestandsfenster {

    ArrayList<Getraenke> liste;
    public JPanel panel1;
    private JComboBox comboBox1;
    private JLabel label1;
    private JButton button1;


    public Bestandsfenster(ArrayList<Getraenke> liste) {
        this.liste = liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());

            label1.setText(String.valueOf(liste.get(0).getBestand()));


            comboBox1.addActionListener(e->label1.setText(String.valueOf(liste.get(comboBox1.getSelectedIndex()).getBestand())));

            button1.addActionListener(e->label1.setText(String.valueOf(liste.get(comboBox1.getSelectedIndex()).getBestand())));


        }


    }
}










