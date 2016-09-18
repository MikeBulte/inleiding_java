package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class Opdr6dot2SecondenInEenJaar extends Applet {

    int TekstPosX;
    int Seconde;
    int Uur;
    int Dag;
    int Jaar;


    public void init() {

        TekstPosX = 100;

        Seconde = 1;
        Uur = (Seconde * 60) * 60;
        Dag = Uur * 24;
        Jaar = Dag * 365;


    }

    public void paint(Graphics g) {

        g.drawString("Een seconde in seconde is:" + Seconde, TekstPosX, 100);
        g.drawString("Een uur in seconde is:" + Uur, TekstPosX, 150);
        g.drawString("Een dag in seconde is:" + Dag, TekstPosX, 200);
        g.drawString("Een jaar in seconde is:" + Jaar, TekstPosX, 250);

    }
}