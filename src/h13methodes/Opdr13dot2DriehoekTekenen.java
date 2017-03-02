package h13methodes;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 02-03-17.
 * Deze applet maakt een driehoek met lijnen via een voorgeleverde methode.
 */
public class Opdr13dot2DriehoekTekenen extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //x1 en y1 zijn het linkerpunt, x2 en y2 zijn het middenpunt, x3 en y3 zijn het rechterpunt
        int x1 = 50, y1 = 100, x2 = 75, y2 = 50, x3 = 100, y3 = 100;

        tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
    }

    private void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x2, y2, x3, y3);

    }

}
