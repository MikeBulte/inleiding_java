package inleiding_java.h2eerstejava_applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/8/2016.
 */

public class MijnTweedeJavaApplet extends Applet {


    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }

    //een methode die de inhoud van het scherm tekent
         public void paint(Graphics g) {
              g.setColor(Color.blue);
              g.drawString ("Mike",50,60);
              g.setColor(Color.red);
              g.drawString ("Bulte",50,90);
    }

}

//Opdracht 2.2
