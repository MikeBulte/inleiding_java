package h5variabelen;

/*
 * Created by Mike on 9/13/2016.
 */

import java.applet.Applet;
import java.awt.*;


public class TekenPraktijkOpdrMetVariabelen extends Applet {

    Color achtergrond;
    Color infillkleur;
    Color schwarz;

    //Posities, als je dit veranderd breekt ALLES

    int Positie1;
    int Positie10;
    int Positie15;
    int Positie18;
    int Positie2;
    int Positie25;
    int Positie3;
    int Positie4;
    int Positie50;
    int Positie6;
    int Positie65;


    int yTekstpositieLIJN;
    int yTekstpositie1;
    int yTekstpositie2;

    //Hoeken

    int taartpStart;
    int taartpArc;
    int rRecthoek;

    //Misc
    int tien;
    int vijftien;
    int vijftwin;
    int vijfder;
    int veertig;
    int vijfveer;
    int vijftig;
    int zestig;
    int zeventig;
    int tachtig;
    int negentig;


    public void init() {
        //X posities, vergroot met 200 per Eind punt en 300 per losse positie
        Positie10 = 10;
        Positie15 = 15;
        Positie2 = 200;
        Positie3 = 300;
        Positie4 = 400;
        Positie6 = 600;
        Positie65 = 650;
        //Y posities, vergroot met 100 per Eind punt en 150 per losse positie
        Positie50 = 50;
        Positie18 = 180;
        Positie1 = 100;
        Positie25 = 250;
        //Tekst
        yTekstpositieLIJN = 25;
        yTekstpositie1 = 165;
        yTekstpositie2 = 295;

        //Hoeken
        taartpStart = 0;
        taartpArc = 45;
        rRecthoek = 20;

        //Misc
        tien = 10;
        vijftien = 15;
        vijftwin = 25;
        vijfder = 35;
        veertig = 40;
        vijfveer = 45;
        vijftig = 50;
        zestig = 60;
        zeventig = 70;
        tachtig = 80;
        negentig = 90;
        //kleuren
        achtergrond = new Color(255, 255, 255);
        setBackground(achtergrond);
        infillkleur = new Color(255, 51, 204);
        schwarz = new Color(0, 0, 0);


    }

    public void paint(Graphics g) {
        /*
        /Rijen zijn bepaalt op links naar rechts, dus de linker objecten zijn rij 1, midden rij 2, etc.
        */
        this.setSize(900, 400);
        g.setColor(schwarz);

        //Rij 1

        g.drawLine(Positie10, Positie10, Positie2, Positie10);
        g.drawRect(Positie10, vijftig, Positie2, Positie1);
        g.drawRoundRect(Positie10, Positie2, Positie2, Positie1, rRecthoek, rRecthoek);

        g.drawString("Lijn", Positie1, yTekstpositieLIJN);
        g.drawString("Rechthoek", tachtig, yTekstpositie1);
        g.drawString("Afgeronde Rechthoek", vijftig, Positie3 + Positie15);

        //Rij 2

        g.setColor(infillkleur);
        /*Taartpunt van Rij !3!*/
        g.fillArc(Positie6, vijftig, Positie2, Positie1, taartpStart, taartpArc); //!Taartpunt van Rij 3!
        g.fillRect(Positie3, vijftig, Positie2, Positie1);
        g.fillOval(Positie3, Positie2, Positie2, Positie1);
        g.setColor(schwarz);
        g.drawOval(Positie3, vijftig, Positie2, Positie1);

        g.drawString("Gevulde Rechthoek", Positie3 + veertig, yTekstpositie1);
        g.drawString("Gevulde Ovaal", Positie3 + zestig, Positie3 + vijftien);

        //Rij 3

        g.drawOval(Positie6, vijftig, Positie2, Positie1);
        g.drawOval(Positie65, Positie2, Positie1, Positie1);

        g.drawString("Ovaal met taartpunt omheen", Positie6 + vijftwin, yTekstpositie1);
        g.drawString("Cirkel", Positie65 + vijfder, Positie3 + vijftien);


        /* !!OUDE CODE, ALLEEN VOOR REFERENCE!!
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
       */
    }
}