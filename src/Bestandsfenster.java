import javax.swing.*;
import java.util.ArrayList;


public class Bestandsfenster {

    ArrayList<Snacks> listesnacks;
    ArrayList<Getraenke> liste;
    public JPanel panel1;
    private JComboBox comboBox1;
    private JLabel label1;
    private JButton button1;
    private JComboBox comboBox2;
    private JLabel label2;


    public Bestandsfenster(ArrayList<Getraenke> liste, ArrayList<Snacks> listesnacks) {
        this.listesnacks = listesnacks;
        this.liste = liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());

            label1.setText(String.valueOf(liste.get(0).getBestand()));


            comboBox1.addActionListener(e -> label1.setText(String.valueOf(liste.get(comboBox1.getSelectedIndex()).getBestand())));

            button1.addActionListener(e -> label1.setText(String.valueOf(liste.get(comboBox1.getSelectedIndex()).getBestand())));


        }
        for (Snacks item : listesnacks) {
            comboBox2.addItem(item.getName());

            label2.setText(String.valueOf(listesnacks.get(0).getBestand()));


            comboBox2.addActionListener(e -> label2.setText(String.valueOf(listesnacks.get(comboBox2.getSelectedIndex()).getBestand())));

            button1.addActionListener(e -> label2.setText(String.valueOf(listesnacks.get(comboBox2.getSelectedIndex()).getBestand())));



        }
    }
}









