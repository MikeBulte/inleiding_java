package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class Opdr6dot1Karwei extends Applet {

    int tekstposx;
    double totaalbedrag;
    double bedragpp;
    double totaalopgetelt;

    public void init() {

        tekstposx = 100;

        totaalbedrag = 113;
        bedragpp = totaalbedrag / 4;
        totaalopgetelt = bedragpp * 4;

    }

    public void paint(Graphics g) {

        g.drawString("Het totaal bedrag verdient is: " + totaalbedrag, tekstposx, 100);
        g.drawString("Mike verdient: " + bedragpp, tekstposx, 120);
        g.drawString("Ali verdient: " + bedragpp, tekstposx, 140);
        g.drawString("Jan verdient: " + bedragpp, tekstposx, 160);
        g.drawString("Jeannette verdient: " + bedragpp, tekstposx, 180);
        g.drawString("Samen getelt voor geen verloren info is het:" + totaalopgetelt, tekstposx, 200);


    }
}
