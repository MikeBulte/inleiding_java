package h13methodes;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 09-03-17.
 * Deel 1 van 2 van de Praktijk Opdracht voor hoofdstuk 13, dit is de methode voor de boom.
 */
public class Opdr13PraktijkOpdrBoom extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int xArc = 100, yArc = 100, xBoom = (xArc + 25), yBoom = (yArc + 50), arcWidth = 80, arcHeight = 175, boomWidth = 30, boomHeight = 175;

        tekenBoom(g, xArc, yArc, xBoom, yBoom, arcWidth, arcHeight, boomWidth, boomHeight);

    }

    private void tekenBoom (Graphics g, int xArc, int yArc, int xBoom, int yBoom, int arcWidth, int arcHeight, int boomWidth, int boomHeight) {
        g.setColor(new Color(139, 69, 19));
        g.fillRect(xBoom, yBoom, boomWidth, boomHeight);
        g.setColor(new Color(0, 100,0));
        g.fillArc(xArc, yArc, arcWidth, arcHeight, 0, 360);
    }
}
