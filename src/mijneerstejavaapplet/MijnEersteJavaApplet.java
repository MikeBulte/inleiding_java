package mijneerstejavaapplet;

/**
 * Created by Mike on 9/7/2016.
 */


import java.awt.*;
import java.applet.*;


public class MijnEersteJavaApplet extends Applet {


    //een (lege) methode die de Applet initialiseert
    public void init() {

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString ("Hello Java",50,60 );
    }

}



