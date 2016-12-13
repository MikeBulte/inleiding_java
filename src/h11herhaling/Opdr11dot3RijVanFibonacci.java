package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 10/26/2016.
 *
 */
public class Opdr11dot3RijVanFibonacci extends Applet {

    @Override
    public void init() {
        super.init();

        this.setSize(600, 400);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int teller;
        int x = 30;
        int y = 50;
        int fibonacciGetal1 = 0;
        int fibonacciGetal2 = 1;
        int fibonacciHolder;

        for (teller = 0; teller < 15; teller++) {

            g.drawString("" + fibonacciGetal1, x, y);
            x += 25;

            fibonacciHolder = fibonacciGetal2;
            fibonacciGetal2 = fibonacciGetal1 + fibonacciGetal2;
            fibonacciGetal1 = fibonacciHolder;
        }
    }
}
