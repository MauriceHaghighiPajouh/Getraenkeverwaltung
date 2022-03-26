import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class Verkaufsfenster {

    ArrayList<Getraenke> liste;
    public JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTable table1;

    public Verkaufsfenster(ArrayList<Getraenke> liste) {

        this.liste = liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());

        }
        textField1.addActionListener(e->liste.get(comboBox1.getSelectedIndex()).verkaufen(Integer.parseInt(textField1.getText())));


    }

    /*private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            liste.get(1).verkaufen(Integer.parseInt(textField1.getText()));
        }
    }
*/

}
