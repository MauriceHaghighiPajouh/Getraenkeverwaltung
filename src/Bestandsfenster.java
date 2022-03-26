import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Bestandsfenster {

    ArrayList<Getraenke> liste;
    public JPanel panel1;
    public JTable table1;


    public Bestandsfenster(ArrayList<Getraenke> liste) {

        this.liste = liste;
        for (Getraenke item : liste) {
        }



    }
    /*
    public void addRowToJTable()
    {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        Object rowData[] = new Object[4];
        for(int i = 0; i < liste.size(); i++)
    {
        rowData[0] = liste.get(i).getName();
        rowData[1] = liste.get(i).getBestand();
        rowData[2] = liste.get(i).getPreis();
        rowData[3] = liste.get(i).getAltersbeschr();
        model.addRow(rowData);
    }

    } */



}
