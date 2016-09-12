package inleiding_java.h4tekenen;

/**
 * Created by Mike on 9/8/2016.
 */
import java.awt.*;
import java.applet.*;

public class GeleEllips extends Applet {

    public void init() {
    }

 public void paint(Graphics g) {

     setBackground(Color.BLUE);
     g.setColor(Color.yellow);
     g.fillArc(100,100,150,75,360,360);




 }
}