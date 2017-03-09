package h13methodes;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 02-03-17.
 * Deze applet gebruikt een method in de paint method om een bakstenen muur te tekenen met loops.
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

        int x = 0, y = 0, width = 40, height = 25;

        tekenMuur(g, x, y, width, height);
    }

    private void tekenMuur(Graphics g, int x, int y, int width, int height) {

        for (int i = 0; i < 20; i++) {
            for (int baksteen = 0; baksteen < 20; baksteen++) {
                g.setColor(Color.lightGray);
                g.fillRect(x, y, width, height);
                g.setColor(Color.red);
                g.fill3DRect((x + 5), (y + 5), (width - 10), (height - 10), true);
                x += width;
            } //Einde Bakstenen Loop
            y += height;
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || i == 10 ||  i == 12 ||  i == 14 ||  i == 16 ||  i == 18) {
                x = -20;
            } else {
                x = 0;
            }
        }
    }
}
