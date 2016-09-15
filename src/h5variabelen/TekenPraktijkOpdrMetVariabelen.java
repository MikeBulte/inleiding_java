package h5variabelen;

/*
 * Created by Mike on 9/13/2016.
 */

import java.applet.Applet;
import java.awt.*;


public class TekenPraktijkOpdrMetVariabelen extends Applet {

    Color achtergrond;
    Color infillkleur;
    Color tekst;
    //X, Y, Tekst posities, E achter een positie staat voor Eind Positie
    int Xpositie1;
    int Xpositie1E;
    int Xpositie2;
    int Xpositie2E;
    int Xpositie3;
    int Xpositie3E;
    //
    int YpositieLIJN;
    int Ypositie1;
    int Ypositie1E;
    int Ypositie2;
    int Ypositie2E;

    //
    int xTekstpositie1;
    int xTekstpositie2;
    int xTekstpositie3;
    //
    int yTekstpositie1;
    int yTekstpositie2;
    int yTesktpositie3;

    public void init() {
        //X posities, vergroot met 200 per Eind punt en 300 per losse positie
        Xpositie1 = 10;
        Xpositie2 = Xpositie1 + 290;
        Xpositie3 = Xpositie2 + 300;
        Xpositie1E = Xpositie1 + 200;
        Xpositie2E = Xpositie2 + 200;
        Xpositie3E = Xpositie3 + 200;
        //Y posities, vergroot met 100 per Eind punt en 150 per losse positie
        YpositieLIJN = 10;
        Ypositie1 = 50;
        Ypositie2 = Ypositie1 + 150;
        Ypositie1E = Ypositie1 + 100;
        Ypositie2E = Ypositie2 + 100;
        //hou de tekst posities 15 pixels onder de Y posities en X op 050's
       // xTekstpositie1;
       // xTekstpositie2;
       // xTekstpositie3;

        //kleuren
        setBackground(Color.white);
        infillkleur = new Color(255, 51, 204);

    }

    public void paint(Graphics g) {

        //mangenta gekleurde objecten

        g.setColor(infillkleur);
        g.fillRect(300, 50, 200, 100);
        g.fillOval(300, 200, 200, 100);
        g.fillArc(600, 50, 200, 100, 0, 45);

        //outlines

        g.setColor(Color.black);
        g.drawLine(10, 10, 200, 10);
        g.drawRect(10, 50, 200, 100);
        g.drawRoundRect(10, 200, 200, 100, 20, 20);
        g.drawOval(300, 50, 200, 100);
        g.drawOval(600, 50, 200, 100);
        g.drawOval(650, 200, 100, 100);

        //tekst

        g.drawString("Lijn", 100, 25);
        g.drawString("Rechthoek", 75, 175);
        g.drawString("Afgeronde Rechthoek", 50, 325);
        g.drawString("Gevulde Rechthoek met Ovaal", 320, 175);
        g.drawString("Gevulde Ovaal", 360, 325);
        g.drawString("Taartpunt met Ovaal eromheen", 610, 175);
        g.drawString("Cirkel", 685, 325);
    }
}