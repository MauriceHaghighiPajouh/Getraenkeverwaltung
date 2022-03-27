import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class Bestellfenster {

    ArrayList<Getraenke> liste;
    public JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;

    public Bestellfenster(ArrayList<Getraenke> liste) {

        this.liste = liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());

        }
        textField1.addActionListener(e->liste.get(comboBox1.getSelectedIndex()).bestellen(Integer.parseInt(textField1.getText())));


    }


}
