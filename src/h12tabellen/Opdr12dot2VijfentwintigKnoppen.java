package h12tabellen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 1/10/2017.
 * Een loop en een array om 25 knoppen te maken
 */
public class Opdr12dot2VijfentwintigKnoppen extends Applet {

    @Override
    public void init() {
        super.init();

        Button[] knoppenArray = new Button[25];

        for (int teller = 0; teller < knoppenArray.length; teller++) {
            //Object krijgt de waarde van de teller
            knoppenArray[teller] = new Button("Knop " + teller);
            add(knoppenArray[teller]);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
