package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class PraktijkOpdrH6Getallen extends Applet {

    double Cijfer1;
    double Cijfer2;
    double Cijfer3;
    double Combineerd;
    double Gemiddelde;
    double Vermenig;
    double Verdeeld;
    int Afkap;


    public void init() {

        Cijfer1 = 5.9;
        Cijfer2 = 6.3;
        Cijfer3 = 6.9;

        Combineerd = Cijfer1 + Cijfer2 + Cijfer3;
        Gemiddelde = Combineerd / 3;
        Vermenig = Gemiddelde * 10;
        Afkap = (int) Vermenig;
        Verdeeld = (double) Afkap / 10;

    }

    public void paint(Graphics g) {

        g.drawString("De Drie cijfers samen zijn: " + Combineerd, 100, 50);
        g.drawString("Het gemiddelde is: " + Verdeeld, 100, 100);


    }

}
