package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class Opdr6dot3TweePos extends Applet {

    int Pos1;
    int Pos2;
    int Neg;

    public void init() {

        Pos1 = 2147483647;
        Pos2 = 2147483647;
        Neg = Pos1 + Pos2;

    }

    public void paint(Graphics g) {

        g.drawString("Pos1 + Pos 2 is= " + Neg, 100, 100);

    }
}
