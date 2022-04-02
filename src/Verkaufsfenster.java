import javax.swing.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

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
    private JLabel labelrechnung;
    private JButton verkaufenbutton;
    private JLabel labelmwst;


    // Column Names
    private String[] columnNames = {"Name", "Menge", "Preis"};
    protected String[][] data = new String[0][columnNames.length];


    public Verkaufsfenster(ArrayList<Getraenke> liste, ArrayList<Snacks> listesnacks) {

        JFrame rechnungsFenster = new JFrame("Rechnung");
        rechnungsFenster.setContentPane(new Rechnungsfenster(liste).panel1);
        rechnungsFenster.setDefaultCloseOperation(rechnungsFenster.DISPOSE_ON_CLOSE);
        rechnungsFenster.pack();
        rechnungsFenster.setSize(320, 160);

        this.listesnacks = listesnacks;
        this.liste = liste;

        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());
        }

        for (Snacks item : listesnacks) {
            comboBox2.addItem(item.getName());
        }


        textField1.addActionListener(e -> this.verkaufenGetraenk());

        textField2.addActionListener(e -> this.verkaufenSnacks());

        // Initializing the JTable
        table1.setModel(new DefaultTableModel());


        loeschenButton.addActionListener(e -> warenkorbLoeschen());

        loeschenButton.addActionListener(e -> table1.setModel(new DefaultTableModel()));

        verkaufenbutton.addActionListener(e->getSum());

        loeschenButton.addActionListener(e->labelrechnung.setText(""));
        loeschenButton.addActionListener(e->labelmwst.setText(""));


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
        newData[2] = String.valueOf( vkmenge * selectedGetraenk.getPreis());


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


    public void getSum()
    {
        int numrow= table1.getRowCount();
        double total=0;

        for (int i = 0;i<numrow;i++){
            double value = Double.valueOf(table1.getValueAt(i,2).toString());
            total+=value;
        }
        labelrechnung.setText(String.format("%4.2f",(total)));
        labelmwst.setText(String.format("%4.2f",(total*0.19)));

    }

}












