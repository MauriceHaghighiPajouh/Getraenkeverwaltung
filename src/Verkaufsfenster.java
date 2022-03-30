import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Verkaufsfenster {

    ArrayList<Snacks> listesnacks;
    ArrayList<Getraenke> liste;

    public JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTable table1;
    private JButton loeschenButton;
    private JComboBox comboBox2;
    private JTextField textField2;

    // Column Names
    private String[] columnNames = {"Name", "Menge", "Preis"};
    private String[][] data = new String[0][columnNames.length];

    public Verkaufsfenster(ArrayList<Getraenke> liste,ArrayList<Snacks>listesnacks) {

        this.listesnacks=listesnacks;
        this.liste = liste;

        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());
        }

        for (Snacks item : listesnacks){
            comboBox2.addItem(item.getName());
        }


        textField1.addActionListener(e -> this.verkaufenGetraenk());

        textField2.addActionListener(e->this.verkaufenSnacks());

        // Initializing the JTable
        table1.setModel(new DefaultTableModel());


        loeschenButton.addActionListener(e -> warenkorbLoeschen());

        loeschenButton.addActionListener(e -> table1.setModel(new DefaultTableModel()));

    }


    private void verkaufenGetraenk() {
        Getraenke selectedGetraenk = liste.get(comboBox1.getSelectedIndex());
        int vkmenge = Integer.parseInt(textField1.getText());

        selectedGetraenk.verkaufen(vkmenge);

        String[][] updatedData = new String[data.length + 1][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            updatedData[i] = data[i];
        }

        String[] newData = updatedData[updatedData.length - 1];
        newData[0] = selectedGetraenk.getName();
        newData[1] = String.valueOf(vkmenge);
        newData[2] = String.valueOf(vkmenge * selectedGetraenk.getPreis());

        data = updatedData;

        table1.setModel(new DefaultTableModel(data, columnNames));
    }

    private void warenkorbLoeschen() {
        data = new String[0][columnNames.length];
    }

    private void verkaufenSnacks() {
        Snacks selectedSnack = listesnacks.get(comboBox2.getSelectedIndex());
        int vkmenge = Integer.parseInt(textField2.getText());

        selectedSnack.verkaufen(vkmenge);

        String[][] updatedData = new String[data.length + 1][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            updatedData[i] = data[i];
        }

        String[] newData = updatedData[updatedData.length - 1];
        newData[0] = selectedSnack.getName();
        newData[1] = String.valueOf(vkmenge);
        newData[2] = String.valueOf(vkmenge * selectedSnack.getPreis());

        data = updatedData;

        table1.setModel(new DefaultTableModel(data, columnNames));
    }


}











