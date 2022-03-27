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

    // Column Names
    private String[] columnNames = {"Name", "Menge", "Preis"};
    private String[][] data = new String[0][columnNames.length];

    public Verkaufsfenster(ArrayList<Getraenke> liste) {


        this.liste = liste;
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());
        }

        textField1.addActionListener(e -> this.verkaufen());

        // Initializing the JTable
        table1.setModel(new DefaultTableModel());

        loeschenButton.addActionListener(e -> table1.setModel(new DefaultTableModel()));
    }


    private void verkaufen() {
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


}











