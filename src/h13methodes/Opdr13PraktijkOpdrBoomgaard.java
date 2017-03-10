package h13methodes;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 10-03-17.
 * Deze applet tekent met een bewerkte methode van Opdr13PraktijkOpdrBoom een simpele boomgaard te maken met 2 for loops.
 */
public class Opdr13PraktijkOpdrBoomgaard extends Applet {

    @Override
    public void init() {
        super.init();

        setSize(1400, 700);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int xArc = 100, yArc = 100, xBoom = (xArc + 25), yBoom = (yArc + 50), arcWidth = 80, arcHeight = 175, boomWidth = 30, boomHeight = 175;

        tekenBoom(g, xArc, yArc, xBoom, yBoom, arcWidth, arcHeight, boomWidth, boomHeight);

    }

    private void tekenBoom(Graphics g, int xArc, int yArc, int xBoom, int yBoom, int arcWidth, int arcHeight, int boomWidth, int boomHeight) {

        for (int regel = 0; regel < 3; regel++) {
            for (int lijn = 0; lijn < 10; lijn++) {
                g.setColor(new Color(139, 69, 19));
                g.fillRect(xBoom, yBoom, boomWidth, boomHeight);
                g.setColor(new Color(0, 100, 0));
                g.fillArc(xArc, yArc, arcWidth, arcHeight, 0, 360);
                xArc += 75;
                xBoom += 75;
            } //Einde Lijn loop
            xArc = 100;
            xBoom = 125;
            yBoom += 175;
            yArc += 175;
        } // Einde Regel loop
    }
}
