package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class Opdr6dot3TweePos extends Applet {

    int pos1;
    int pos2;
    int neg;

    public void init() {

        pos1 = 2147483647;
        pos2 = 2147483647;
        neg = pos1 + pos2;

    }

    public void paint(Graphics g) {

        g.drawString("pos 1 + pos 2 is= " + neg, 100, 100);

    }
}
