package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 11/1/2016.
 * ａｅｓｔｈｅｔｉｃ
 */
public class Opdr11dot8CirkelsOpHetzelfdeBeginpunt extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int teller;
        int x = 50;
        int x1 = 20;
        int y = 50;
        int y1 = 20;

        for (teller = 0; teller < 150; teller++) {

            setSize(1910,1000);

            g.drawOval(x, y, x1, y1);
            x1 += 5;
            y1 += 5;

        }

    }
}
