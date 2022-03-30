import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Hauptmenue extends JFrame {



    public JButton bestellenButton1; // bestellknopf
    public JPanel panel1;      //panel
    public JButton infoBestandButton; //bestand knopf
    public JButton verkaufen;
    private ArrayList<Getraenke> liste;






    public Hauptmenue(ArrayList<Getraenke> liste,ArrayList<Snacks>listesnacks) {

        this.liste=liste;

        //BESTELL FENSTER
        JFrame bestellFenster = new JFrame("Bestand erhöhen");
        bestellFenster.setContentPane(new Bestellfenster(liste).panel1);
        bestellFenster.setDefaultCloseOperation(bestellFenster.DISPOSE_ON_CLOSE); // close button
        bestellFenster.pack(); // pack
        bestellFenster.setSize(800, 600);  // fenster größe

        //VK FENSTER
        JFrame verkaufsFenster = new JFrame("Verkauf");
        verkaufsFenster.setContentPane(new Verkaufsfenster(liste,listesnacks).panel1);
        verkaufsFenster.setDefaultCloseOperation(verkaufsFenster.DISPOSE_ON_CLOSE); // close button
        verkaufsFenster.pack(); // pack
        verkaufsFenster.setSize(800, 600);  // fenster größe

        //Rechnungsfenster
        JFrame rechnungsFenster = new JFrame("Rechnung");
        rechnungsFenster.setContentPane(new Rechnungsfenster(liste).panel1);
        rechnungsFenster.setDefaultCloseOperation(rechnungsFenster.DISPOSE_ON_CLOSE);
        rechnungsFenster.pack();
        rechnungsFenster.setSize(480,320);

        //bestandsfenstr
        JFrame bestandsFenster = new JFrame("Bestand info");
        bestandsFenster.setContentPane(new Bestandsfenster(liste).panel1);
        bestandsFenster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // close button
        bestandsFenster.pack(); // pack
        bestandsFenster.setSize(768, 576);  // fenster größe

        // LAMBDA LISTENER FÜR VERKAUFEN
        verkaufen.addActionListener(e -> verkaufsFenster.setVisible(true));
        verkaufen.addActionListener(e -> bestellFenster.dispose());

        //BESTELLKNOPF

        bestellenButton1.addActionListener(e -> bestellFenster.setVisible(true));
        bestellenButton1.addActionListener(e ->verkaufsFenster.dispose());
        bestellenButton1.addActionListener(e->rechnungsFenster.dispose());

        //BESTAND KNOPF

         infoBestandButton.addActionListener(e->bestandsFenster.setVisible(true));



    }
}

