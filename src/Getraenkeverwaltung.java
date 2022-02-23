import javax.swing.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Getraenkeverwaltung {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MO-GVFD");
        frame.setContentPane(new Hauptmenue().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(640,360);
        frame.setVisible(true);



        //getränke initialisieren
        Getraenke getraenk1 = new Getraenke("Cola",100,2.99);

        //scanner
        Scanner tastatur=new Scanner(System.in);
        //funktionen initalisieren
        int bestellmenge;
        int verkaufsmenge;

        verkaufsmenge=tastatur.nextInt();

        //verkaufen
        getraenk1.verkaufen(verkaufsmenge);

        //test
        System.out.println("test test einkauf blabla"+getraenk1.getBestand());








    }

}
