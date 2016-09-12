package inleiding_java.h4tekenen;

/**
 * Created by Mike on 9/8/2016.
 */
import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    g.setColor(Color.black);
    g.fillRoundRect(25,25,100,100,20,20);
    g.setColor(Color.white);
    g.fillOval(40,40,20,20);
    g.fillOval(90,40,20,20);
    g.fillOval(90,90,20,20);
    g.fillOval(40,90,20,20);

    }
}
