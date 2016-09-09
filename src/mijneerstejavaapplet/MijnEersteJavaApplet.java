package mijneerstejavaapplet;

/**
 * Created by Mike on 9/7/2016.
 */


import java.awt.*;
import java.applet.*;


public class MijnEersteJavaApplet extends Applet {


    //een (lege) methode die de Applet initialiseert
    public void init() {setBackground(Color.blue);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString ("Mike Bulte",50,60 );
    }

}

//Opdracht 2.1

