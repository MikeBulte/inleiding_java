package h6getallen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/18/2016.
 */
public class Opdr6dot1Karwei extends Applet {

    int TekstPosX;
    double TotaalBedrag;
    double BedragPP;
    double TotaalOpgetelt;

    public void init() {

        TekstPosX = 100;

        TotaalBedrag = 113;
        BedragPP = TotaalBedrag / 4;
        TotaalOpgetelt = BedragPP * 4;

    }

    public void paint(Graphics g) {

        g.drawString("Het totaal bedrag verdient is: " + TotaalBedrag, TekstPosX, 100);
        g.drawString("Mike verdient: " + BedragPP, TekstPosX, 120);
        g.drawString("Ali verdient: " + BedragPP, TekstPosX, 140);
        g.drawString("Jan verdient: " + BedragPP, TekstPosX, 160);
        g.drawString("Jeannette verdient: " + BedragPP, TekstPosX, 180);
        g.drawString("Samen getelt voor geen verloren info is het:" + TotaalOpgetelt, TekstPosX, 200);


    }
}
