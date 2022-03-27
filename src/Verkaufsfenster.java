import javax.swing.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Verkaufsfenster {

    ArrayList<Getraenke> liste;
    public JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTable table1;
    private JButton loeschenButton;
    public int x;

    String namewk;
    int mengewk;
    double preiswk;


    public Verkaufsfenster(ArrayList<Getraenke> liste) {


        this.liste = liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());

        }
        textField1.addActionListener(e -> liste.get(comboBox1.getSelectedIndex()).verkaufen(Integer.parseInt(textField1.getText())));

        textField1.addActionListener(e -> mengewk = (Integer.parseInt(textField1.getText())));

        textField1.addActionListener(e -> preiswk = mengewk * liste.get(comboBox1.getSelectedIndex()).getPreis());



        String[][] data = {
                {"penis","vagina","eier"},
        };

        // Column Names
        String[] columnNames = {"Name", "Menge", "Preis"};

        // Initializing the JTable
        table1.setModel(new DefaultTableModel());


        textField1.addActionListener(e -> table1.setModel(new DefaultTableModel(data, columnNames)));

        loeschenButton.addActionListener(e -> table1.setModel(new DefaultTableModel()));


    }

    public void setNamewk(String namewk) {
        this.namewk = namewk;
    }


}











