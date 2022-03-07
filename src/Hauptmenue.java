import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Hauptmenue extends JFrame {
    Getraenke getraenk1 = new Getraenke("Cola",100,2.99,0);
    Getraenke getraenk2= new Getraenke ("Fanta",50,2.99,0);
    Getraenke getraenk3= new Getraenke ("Sprite",30,2.99,0);
    Getraenke getraenk4= new Getraenke ("Mezzo Mix",40,2.99,0);
    Getraenke getraenk5= new Getraenke ("Kaffee",20,1.79,0);
    Getraenke getraenk6= new Getraenke ("Latte Macchiato",70,3.99,0);
    Getraenke getraenk7= new Getraenke ("Cappucino",80,3.99,0);
    Getraenke getraenk8= new Getraenke ("Weißwein",100,4.49,16);
    Getraenke getraenk9= new Getraenke ("Rotwein",75,4.99,16);
    Getraenke getraenk10= new Getraenke ("Bier",150,3.49,16);
    Getraenke getraenk11= new Getraenke ("Whiskey",50,5.99,18);
    Getraenke getraenk12= new Getraenke ("Vodka",35,5.49,18);



    public JButton bestellenButton1; // bestellknopf
    public JPanel panel1;      //panel
    public JButton infoBestandButton; //bestand knopf
    public JButton verkaufen;
    public JTextField textField1;



    public Hauptmenue() {

        //BESTELL FENSTER
        JFrame bestellFenster = new JFrame("Bestellungen");
        bestellFenster.setContentPane(new Verkaufsfenster().panel1);
        bestellFenster.setDefaultCloseOperation(bestellFenster.DISPOSE_ON_CLOSE); // close button
        bestellFenster.pack(); // pack
        bestellFenster.setSize(800, 600);  // fenster größe

        //VK FENSTER
        JFrame verkaufsFenster = new JFrame("Verkauf");
        verkaufsFenster.setContentPane(new Verkaufsfenster().panel1);
        verkaufsFenster.setDefaultCloseOperation(verkaufsFenster.DISPOSE_ON_CLOSE); // close button
        verkaufsFenster.pack(); // pack
        verkaufsFenster.setSize(800, 600);  // fenster größe


        infoBestandButton.addActionListener(e->textField1.setText(""+getraenk1.getBestand()));
        // LAMBDA LISTENER FÜR VERKAUFEN
        verkaufen.addActionListener(e -> verkaufsFenster.setVisible(true));
        verkaufen.addActionListener(e -> bestellFenster.dispose());

        bestellenButton1.addActionListener(e -> bestellFenster.setVisible(true));
        bestellenButton1.addActionListener(e ->verkaufsFenster.dispose());



    }
}

