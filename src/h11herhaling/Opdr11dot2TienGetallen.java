package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 10/26/2016.
 * Deze applet gebruikt een loop die van 20 tot 10 gaat om de teller te tekenen.
 */
public class Opdr11dot2TienGetallen extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int teller;
        int x = 0;

        for (teller = 20; teller > 10; teller--) {
            x += 20;
            g.drawString("" + teller, x, 75);
        }
    }
}
