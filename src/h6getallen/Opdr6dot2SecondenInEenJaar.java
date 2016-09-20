package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class Opdr6dot2SecondenInEenJaar extends Applet {

    int tekstposx;
    int seconde;
    int uur;
    int dag;
    int jaar;


    public void init() {

        tekstposx = 100;

        seconde = 1;
        uur = (seconde * 60) * 60;
        dag = uur * 24;
        jaar = dag * 365;


    }

    public void paint(Graphics g) {

        g.drawString("Een seconde in seconde is: " + seconde, tekstposx, 100);
        g.drawString("Een uur in seconde is: " + uur, tekstposx, 150);
        g.drawString("Een dag in seconde is: " + dag, tekstposx, 200);
        g.drawString("Een jaar in seconde is: " + jaar, tekstposx, 250);

    }
}