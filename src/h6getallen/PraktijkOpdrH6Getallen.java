package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 *
 */
public class PraktijkOpdrH6Getallen extends Applet {

    private double combineerd;
    private double verdeeld;


    public void init() {

        double cijfer1 = 5.9;
        double cijfer2 = 6.3;
        double cijfer3 = 6.9;

        combineerd = cijfer1 + cijfer2 + cijfer3;
        double gemiddelde = combineerd / 3;
        double vermenig = gemiddelde * 10;
        int afkap = (int) vermenig;
        verdeeld = (double) afkap / 10;

    }

    public void paint(Graphics g) {

        g.drawString("De Drie cijfers samen zijn: " + combineerd, 100, 50);
        g.drawString("Het gemiddelde is: " + verdeeld, 100, 100);


    }

}
