package inleiding_java.h4tekenen;

/**
 * Created by Mike on 9/8/2016.
 */
//Voorbeeld 4.1

import java.awt.*;
        import java.applet.*;

public class GelijkbenigeDriehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(100,200,300,200);
        g.drawLine(300,200,200,50);
        g.drawLine(100,200,200,50);
    }
}
