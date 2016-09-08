package applet_tekenen;

/**
 * Created by Mike on 9/8/2016.
 */
import java.awt.*;
import java.applet.*;

public class HuisMetDeur extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
         //dak
          g.drawLine(100,200,300,200);
          g.drawLine(300,200,200,050);
          g.drawLine(100,200,200,050);
        //ramen
             g.drawRect(100,200,200,200);
             g.drawRect(200,300,80,100);
             g.drawRect(140,250,50,50);
             g.drawRect(130,330,50,50);
          //deuren
                  g.drawRect(180,320,50,50);
                  g.drawRect(175,100,50,100);
     //deurknoppen
                     g.drawOval(210,140,10,10);
                     g.drawOval(265,350,10,10);
    }
}
