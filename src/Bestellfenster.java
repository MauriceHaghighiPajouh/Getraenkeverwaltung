import javax.swing.*;
import java.util.ArrayList;


public class Bestellfenster {
    ArrayList<Snacks>listesnacks;
    ArrayList<Getraenke> liste;
    public JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField2;

    public Bestellfenster(ArrayList<Getraenke> liste,ArrayList<Snacks>listesnacks) {
        this.listesnacks=listesnacks;
        this.liste = liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());

        }
        for (Snacks item : listesnacks){
            comboBox2.addItem(item.getName());
        }
        textField2.addActionListener(e->listesnacks.get(comboBox2.getSelectedIndex()).bestellen(Integer.parseInt(textField2.getText())));

        textField1.addActionListener(e->liste.get(comboBox1.getSelectedIndex()).bestellen(Integer.parseInt(textField1.getText())));


    }


}
