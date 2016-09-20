package h5variabelen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/15/2016.
 */
public class StaafDiagramVariabelen extends Applet {


    int valgewicht = 350;
    int jergewicht = 200;
    int hangewicht = 250;

    int valbodem = 450 - valgewicht;
    int jerbodem = 450 - jergewicht;
    int hanbodem = 450 - hangewicht;

    public void init() {


    }

    public void paint(Graphics g) {

        setSize(700, 500);



        //diagram opbouw
        g.setColor(Color.black);
        g.drawLine(200, 200, 200, 450);
        g.drawLine(200, 450, 500, 450);

        //diagram namen
        g.drawString("Valerie", 225, 470);
        g.drawString("Jeroen", 285, 470);
        g.drawString("Hans", 345, 470);

        //diagram kg cijfers
        g.drawString("100 KG", 150, 200);
        g.drawString("80 KG", 150, 250);
        g.drawString("60 KG", 150, 300);
        g.drawString("40 KG", 150, 350);
        g.drawString("20 KG", 150, 400);
        g.drawString("0 KG", 150, 450);

        //diagram grijze lijnen
        g.setColor(Color.lightGray);
        g.drawLine(200, 200, 500, 200);
        g.drawLine(200, 250, 500, 250);
        g.drawLine(200, 300, 500, 300);
        g.drawLine(200, 350, 500, 350);
        g.drawLine(200, 400, 500, 400);

        //kolommen met variabelen

        g.setColor(Color.BLUE);
        g.fillRect(225, valgewicht, 40, valbodem);
        g.setColor(Color.RED);
        g.fillRect(285, jergewicht, 40, jerbodem);
        g.setColor(Color.GREEN);
        g.fillRect(345, hangewicht, 40, hanbodem);

    }
}
