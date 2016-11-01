package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 11/1/2016.
 * Deze applet begint met een kleine cirkel van 10 bij 10 en vergroot zich iedere keer dat de teller omhoog gaat.
 */
public class Opdr11dot7MeerCirkels extends Applet {

    @Override
    public void init() {
        super.init();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        setSize(1900, 1000);

        int teller;
        int x = 400;
        int y = 400;
        int x1 = 10;
        int y1 = 10;

        for (teller = 0; teller < 50; teller++) {

            g.drawOval(x, y, x1, y1);
            x -= 5;
            y -= 5;
            x1 += 10;
            y1 += 10;

        }
    }
}