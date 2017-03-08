package h13methodes;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 02-03-17.
 * Probeer alle Or- Statements te vervangen met een calculatie later.
 */
public class Opdr13dot3Muur extends Applet {

    @Override
    public void init() {
        super.init();

        setSize(600, 500);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 0, y = 0, width = 100, height = 40;

        tekenMuur(g, x, y, width, height);
    }

    private void tekenMuur(Graphics g, int x, int y, int width, int height) {

        setBackground(Color.red);

        for (int i = 1; i < 100; i++) {
            g.setColor(Color.gray);
            g.drawRect(x, y, width, height);
            x += 100;
            if (i == 10 || i == 30 || i == 50 || i == 70 || i == 90) {
                y += 40;
                x = -50;
            }
            if (i == 20 || i == 40 || i == 60 || i == 80) {
                y += 40;
                x = 0;
            }
        }

        /* g.setColor(Color.red);
        g.fillRect(x1, y1, x2, y2);
        g.setColor(Color.gray);
        g.drawRect(x1, y1, x2, y2);
        x1 += 60;
        x2 += 60; */

    }

}
