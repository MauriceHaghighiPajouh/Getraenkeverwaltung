import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


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


    // Jtable
    private String[] columnNames = {"Name", "Menge", "Preis"};
    private String[][] data = new String[0][columnNames.length];


    public Verkaufsfenster(ArrayList<Getraenke> liste, ArrayList<Snacks> listesnacks) {

        // arrayliste snack und getränke
        this.listesnacks = listesnacks;
        this.liste = liste;

        //comboboxen werden mit loop gefüllt
        for (Getraenke item : liste) {
            comboBox1.addItem(item.getName());
        }

        for (Snacks item : listesnacks) {
            comboBox2.addItem(item.getName());
        }

        //textfields führen verkaufen methode aus
        textField1.addActionListener(e -> this.verkaufenGetraenk());

        textField2.addActionListener(e -> this.verkaufenSnacks());

        // Jtable initalisieren
        table1.setModel(new DefaultTableModel());

        //löschenknopf löscht warenkorb


        loeschenButton.addActionListener(e -> table1.setModel(new DefaultTableModel()));  //Jtable wird geleert

        verkaufenbutton.addActionListener(e->getSum());         // methode getsum wird ausgeführt bei aktion

        loeschenButton.addActionListener(e->labelrechnung.setText(""));     //label werden "gelöscht"
        loeschenButton.addActionListener(e->labelmwst.setText(""));


        loeschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                warenkorbLoeschen();
            }
        });
    }

    /*2. Verkauf methode, kopiert menge , getränk und preis
    * in ein array, welches dann in das 2d array gefüllt wird, welches in der tabelle angezeigt wird*/
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
        //warenkorb wird "gelöscht"
    private void warenkorbLoeschen() {
        data = new String[0][columnNames.length];
    }
        //selbe methode wie getränke , nur für snacks. Leider hat es für mich nicht funktioniert beides zu kombinieren
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

        //Funktion um die werte einer JTable zusammenzurechnen
    public void getSum()
    {
        int numrow= table1.getRowCount();
        double total=0;

        for (int i = 0;i<numrow;i++){
            double value = Double.valueOf(table1.getValueAt(i,2).toString());
            total+=value;
        }
        //preis wird angezeigt
        labelrechnung.setText(String.format("%4.2f",(total)));
        labelmwst.setText(String.format("%4.2f",(total*0.19)));

    }

}












