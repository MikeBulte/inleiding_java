package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 10/26/2016.
 * Deze applet gebruikt loops om ervoor te zorgen dat het iedere keer een verticale lijn tekent.
 */
public class Opdr11dot1VerticaleLijnen extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int teller;
        int x = 0;

        for (teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x, 50, x, 200);
            g.drawString("" + teller, x, 40);
        }
    }
}
