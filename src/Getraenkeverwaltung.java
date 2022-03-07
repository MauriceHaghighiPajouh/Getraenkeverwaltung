import javax.swing.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Getraenkeverwaltung {


    public static void main(String[] args) {
        JFrame frame = new JFrame("MO-GVFD");
        frame.setContentPane(new Hauptmenue().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button
        frame.pack(); // pack
        frame.setSize(1024, 768);  // fenster größe
        frame.setVisible(true);  // fenster sichtbar machen




        //getränke initialisieren
        Getraenke getraenk1 = new Getraenke("Cola", 100, 2.99, 0);
        Getraenke getraenk2 = new Getraenke("Fanta", 50, 2.99, 0);
        Getraenke getraenk3 = new Getraenke("Sprite", 30, 2.99, 0);
        Getraenke getraenk4 = new Getraenke("Mezzo Mix", 40, 2.99, 0);
        Getraenke getraenk5 = new Getraenke("Kaffee", 20, 1.79, 0);
        Getraenke getraenk6 = new Getraenke("Latte Macchiato", 70, 3.99, 0);
        Getraenke getraenk7 = new Getraenke("Cappucino", 80, 3.99, 0);
        Getraenke getraenk8 = new Getraenke("Weißwein", 100, 4.49, 16);
        Getraenke getraenk9 = new Getraenke("Rotwein", 75, 4.99, 16);
        Getraenke getraenk10 = new Getraenke("Bier", 150, 3.49, 16);
        Getraenke getraenk11 = new Getraenke("Whiskey", 50, 5.99, 18);
        Getraenke getraenk12 = new Getraenke("Vodka", 35, 5.49, 18);


        //scanner
        Scanner tastatur = new Scanner(System.in);
        //funktionen initalisieren
        int bestellmenge;
        int verkaufsmenge;

        verkaufsmenge = tastatur.nextInt();

        //verkaufen
        getraenk1.verkaufen(verkaufsmenge);






    }




}

