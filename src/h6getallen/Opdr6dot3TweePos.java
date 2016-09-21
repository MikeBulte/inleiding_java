package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 *
 */
public class Opdr6dot3TweePos extends Applet {

    private int neg;

    public void init() {

        int pos1 = 2147483647;
        int pos2 = 2147483647;
        neg = pos1 + pos2;

    }

    public void paint(Graphics g) {

        g.drawString("pos 1 + pos 2 is= " + neg, 100, 100);

    }
}
