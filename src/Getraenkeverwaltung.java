import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Getraenkeverwaltung {


    public static void main(String[] args) {

        //getränke initialisieren in einer Array-List

        ArrayList<Getraenke> getraenk = new ArrayList<Getraenke>();
        getraenk.add(new Getraenke("Cola", 100, 2.99, 0));
        getraenk.add(new Getraenke("Fanta", 60, 2.99, 0));
        getraenk.add(new Getraenke("Sprite", 30, 2.99, 0));
        getraenk.add(new Getraenke("Mezzo Mix", 40, 2.99, 0));
        getraenk.add(new Getraenke("Kaffee", 80, 1.79, 0));
        getraenk.add(new Getraenke("Latte Machhiato", 70, 3.99, 0));
        getraenk.add(new Getraenke("Cappucino", 80, 3.99, 0));
        getraenk.add(new Getraenke("Weißwein", 100, 4.49, 16));
        getraenk.add(new Getraenke("Rotwein", 70, 4.99, 16));
        getraenk.add(new Getraenke("Bier", 200, 3.49, 16));
        getraenk.add(new Getraenke("Whiskey", 50, 5.99, 18));
        getraenk.add(new Getraenke("Vodka", 35, 5.49, 18));

        ArrayList<Snacks> snack = new ArrayList<Snacks>();
        snack.add(new Snacks("Nic-Nacs",100,3.00,true));
        snack.add(new Snacks("Chips",90,2.50,false));
        snack.add(new Snacks("BumBum-Eis",50,2.00,false));
        snack.add(new Snacks("Erdnüsse",60,2.00,true));
        snack.add(new Snacks("Nachos",50,4.00,false));
        snack.add(new Snacks("Erdnussflips",75,2.50,true));


        JFrame frame = new JFrame("MO-GVFD");
        frame.setContentPane(new Hauptmenue(getraenk,snack).panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button
        frame.pack(); // pack
        frame.setSize(1024, 768);  // fenster größe
        frame.setVisible(true);  // fenster sichtbar machen



    }


}

