package applet_tekenen;

/**
 * Created by Mike on 9/8/2016.
 */
import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    setBackground(Color.white);
        g.setColor(Color.gray);
        g.fillRoundRect(45,25,110,260,20,20);
        g.setColor(Color.black);
        g.fillRoundRect(50,30,100,250,20,20);
        g.setColor(Color.RED);
        g.fillOval(75,60,50,50);
        g.setColor(Color.yellow);
        g.fillOval(75,130,50,50);
        g.setColor(Color.green);
        g.fillOval(75,200,50,50);


    }
}