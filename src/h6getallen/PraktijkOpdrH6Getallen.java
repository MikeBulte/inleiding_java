package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class PraktijkOpdrH6Getallen extends Applet {

    double cijfer1;
    double cijfer2;
    double cijfer3;
    double combineerd;
    double gemiddelde;
    double vermenig;
    double verdeeld;
    int afkap;


    public void init() {

        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;

        combineerd = cijfer1 + cijfer2 + cijfer3;
        gemiddelde = combineerd / 3;
        vermenig = gemiddelde * 10;
        afkap = (int) vermenig;
        verdeeld = (double) afkap / 10;

    }

    public void paint(Graphics g) {

        g.drawString("De Drie cijfers samen zijn: " + combineerd, 100, 50);
        g.drawString("Het gemiddelde is: " + verdeeld, 100, 100);


    }

}
