package h4tekenen;

/*
 * Created by Mike on 9/8/2016.
 */

import java.awt.*;
import java.applet.*;

public class HuisMetDeur extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);
        g.setColor(Color.red);
        //dak
        int[] xPoints = {200, 100, 300};
        int[] yPoints = {50, 200, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        //huis
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 200, 200, 200);
        //deur
        g.setColor(Color.white);
        g.fillRect(200, 300, 50, 100);
        g.setColor(Color.lightGray);
        g.fillOval(235, 350, 10, 10);
        //ramen
        g.setColor(Color.cyan);
        g.fillRect(125, 300, 50, 50);
        g.fillRect(120, 225, 70, 50);
        g.fillRect(210, 225, 70, 50);

    }
}
