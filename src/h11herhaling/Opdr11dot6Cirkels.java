package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 11/1/2016.
 * Deze applet doet een loop om dezelfde cirkel steeds groter te maken dan daarvoor.
 */
public class Opdr11dot6Cirkels extends Applet {

    @Override
    public void init() {
        super.init();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int teller;
        int x = 70;
        int y = 70;
        int x1 = 90;
        int y1 = 90;

        for (teller = 0; teller < 5; teller++) {

            g.drawOval(x, y, x1, y1);
            x += 10;
            y += 10;
            x1 -= 20;
            y1 -= 20;

        }

    }
}
