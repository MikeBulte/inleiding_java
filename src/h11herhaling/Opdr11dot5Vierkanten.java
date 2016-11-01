package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 11/1/2016.
 * Deze applet gebruikt een loop om 2 trappen te schrijven die naast elkaar gaan zodat ze 5 vierkanten tekenen.
 */
public class Opdr11dot5Vierkanten extends Applet {

    @Override
    public void init() {
        super.init();



    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int teller;
        int x = 60;
        int x1 = 80;
        int y = 60;
        int y1 = 80;

        for (teller = 0; teller <5; teller++) {

            //De vijf vierkanten bestaan uit 2 losse trappen.
            g.drawLine( x, y, x1, y);
            g.drawLine( x1, y, x1, y1);

            g.drawLine( x, y, x, y1);
            g.drawLine( x, y1, x1, y1);

            x += 20;
            x1 += 20;
            y += 20;
            y1 += 20;

        }

    }
}
