import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Hauptmenue extends JFrame {



    public JButton bestellenButton1; // bestellknopf
    public JPanel panel1;      //panel
    public JButton infoBestandButton; //bestand knopf
    public JButton verkaufen;
    public JTextField textField1;
    private ArrayList<Getraenke> liste;






    public Hauptmenue(ArrayList<Getraenke> liste) {

        this.liste=liste;

        //BESTELL FENSTER
        JFrame bestellFenster = new JFrame("Bestellungen");
        bestellFenster.setContentPane(new Verkaufsfenster(liste).panel1);
        bestellFenster.setDefaultCloseOperation(bestellFenster.DISPOSE_ON_CLOSE); // close button
        bestellFenster.pack(); // pack
        bestellFenster.setSize(800, 600);  // fenster größe

        //VK FENSTER
        JFrame verkaufsFenster = new JFrame("Verkauf");
        verkaufsFenster.setContentPane(new Verkaufsfenster(liste).panel1);
        verkaufsFenster.setDefaultCloseOperation(verkaufsFenster.DISPOSE_ON_CLOSE); // close button
        verkaufsFenster.pack(); // pack
        verkaufsFenster.setSize(800, 600);  // fenster größe

        //Rechnungsfenster
        JFrame rechnungsFenster = new JFrame("Rechnung");
        rechnungsFenster.setContentPane(new Rechnungsfenster(liste).panel1);
        rechnungsFenster.pack();
        rechnungsFenster.setSize(480,320);

        // LAMBDA LISTENER FÜR VERKAUFEN
        verkaufen.addActionListener(e->rechnungsFenster.setVisible(true));
        verkaufen.addActionListener(e -> verkaufsFenster.setVisible(true));
        verkaufen.addActionListener(e -> bestellFenster.dispose());

        bestellenButton1.addActionListener(e -> bestellFenster.setVisible(true));
        bestellenButton1.addActionListener(e ->verkaufsFenster.dispose());
        bestellenButton1.addActionListener(e->rechnungsFenster.dispose());

        infoBestandButton.addActionListener(e->textField1.setText(String.valueOf(liste.get(1).getBestand())));



    }
}

