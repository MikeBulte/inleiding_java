package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 10/31/2016.
 * Deze applet laat de tafel van drie zien met een for loop.
 */
public class Opdr11dot4TafelVanDrie extends Applet {

    @Override
    public void init() {
        super.init();


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int teller;
        int y = 0;
        int tafel = 0;

        for (teller = 0; teller < 10; teller++) {

            y += 25;
            tafel++;
            g.drawString("De tafel van drie is " + (3 * tafel) + " bij tafel " + tafel, 50, y);
        }


    }
}
