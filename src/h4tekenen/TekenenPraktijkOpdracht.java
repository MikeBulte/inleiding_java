package h4tekenen;

/*
 * Created by Mike on 9/8/2016.
 */

import java.awt.*;
import java.applet.*;

public class TekenenPraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        //mangenta gekleurde objecten

        g.setColor(Color.magenta);
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
