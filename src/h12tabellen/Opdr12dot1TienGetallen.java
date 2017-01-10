package h12tabellen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 12/13/2016.
 * Deze applet bevat een array met een aantal getallen erin. Vervolgens gebruikt het een loop om alle getallen uit te
 * printen op het scherm terwijl het ook het getal in het totaal toevoegt. Daarna deelt het het totaal met het aantal
 * getallen in de array voor het gemiddelde.
 */
public class Opdr12dot1TienGetallen extends Applet {

    private int[] getallen = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

    @Override
    public void init() {
        super.init();

        setSize(400, 350);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int y = 20;
        int totaalGetal = 0;
        int gemiddeldeGetal;

        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("Het getal op teller: " + teller + " is = " + getallen[teller], 20, y);
            y += 20;
            totaalGetal = totaalGetal + getallen[teller];
        }
        gemiddeldeGetal = totaalGetal / getallen.length;
        g.drawString("Het totaal is: " + totaalGetal, 20, 300);
        g.drawString("Het gemiddelde is: " + gemiddeldeGetal, 20, 320);
    }
}
