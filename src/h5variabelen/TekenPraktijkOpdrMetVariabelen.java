package h5variabelen;

/**
 * Created by Mike on 9/13/2016.
 */

import java.applet.Applet;
import java.awt.*;


public class TekenPraktijkOpdrMetVariabelen extends Applet {


    //Posities, 1 betekent 100, 10 betekent 10.
    int positie1;
    int positie10;
    int positie15;
    int positie18;
    int positie2;
    int positie3;
    int positie6;
    int positie65;
    int ytekstpositielijn;
    int ytekstpositie1;
    //Hoeken
    int taartpstart;
    int taartparc;
    int roundrecthoek;


    //Misc
    int vijftien;
    int vijftwin;
    int vijfder;
    int veertig;
    int vijftig;
    int zestig;
    int tachtig;
    private Color achtergrond;
    private Color infillkleur;
    private Color schwarz;

    public void init() {
        //Posities in alfabetische volgorde
        positie1 = 100;
        positie10 = 10;
        positie15 = 15;
        positie18 = 180;
        positie2 = 200;
        positie3 = 300;
        positie6 = 600;
        positie65 = 650;

        //Tekst
        ytekstpositielijn = 25;
        ytekstpositie1 = 165;

        //Hoeken
        taartpstart = 0;
        taartparc = 45;
        roundrecthoek = 20;

        //Kleine getallen om de tekst mee recht te krijgen
        vijftien = 15;
        vijftwin = 25;
        vijfder = 35;
        veertig = 40;
        vijftig = 50;
        zestig = 60;
        tachtig = 80;
        //Kleuren
        achtergrond = new Color(255, 255, 255);
        setBackground(achtergrond);
        infillkleur = new Color(255, 51, 204);
        schwarz = new Color(0, 0, 0);


    }

    public void paint(Graphics g) {
        /*
        /Rijen zijn bepaalt op links naar rechts, dus de linker objecten zijn rij 1, midden rij 2, etc.
        */
        setSize(900, 400);
        g.setColor(schwarz);

        //Rij 1

        g.drawLine(positie10, positie10, positie2, positie10);
        g.drawRect(positie10, vijftig, positie2, positie1);
        g.drawRoundRect(positie10, positie2, positie2, positie1, roundrecthoek, roundrecthoek);

        g.drawString("Lijn", positie1, ytekstpositielijn);
        g.drawString("Rechthoek", tachtig, ytekstpositie1);
        g.drawString("Afgeronde Rechthoek", vijftig, positie3 + positie15);

        //Rij 2

        g.setColor(infillkleur);
        //Taartpunt van Rij !3!
        g.fillArc(positie6, vijftig, positie2, positie1, taartpstart, taartparc);
        //!Taartpunt van Rij 3!
        g.fillRect(positie3, vijftig, positie2, positie1);
        g.fillOval(positie3, positie2, positie2, positie1);
        g.setColor(schwarz);
        g.drawOval(positie3, vijftig, positie2, positie1);

        g.drawString("Gevulde Rechthoek", positie3 + veertig, ytekstpositie1);
        g.drawString("Gevulde Ovaal", positie3 + zestig, positie3 + vijftien);

        //Rij 3

        g.drawOval(positie6, vijftig, positie2, positie1);
        g.drawOval(positie65, positie2, positie1, positie1);

        g.drawString("Ovaal met taartpunt omheen", positie6 + vijftwin, ytekstpositie1);
        g.drawString("Cirkel", positie65 + vijfder, positie3 + vijftien);

    }
}