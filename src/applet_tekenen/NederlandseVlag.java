package applet_tekenen;

/**
 * Created by Mike on 9/8/2016.
 */

import java.awt.*;
import java.applet.*;


public class NederlandseVlag extends Applet {

public void init() {
}
    public void paint (Graphics g){
        //vlag
        setBackground(Color.black);
        g.setColor(Color.RED);
        g.fillRect(100,100,200,50);
        g.setColor(Color.white);
        g.fillRect(100,150,200,50);
        g.setColor(Color.blue);
        g.fillRect(100,200,200,50);
    //vlaggenmast
     g.setColor(Color.lightGray);
     g.fillRect(80,100,20,1000);
     g.fillRect(75,90,30,10);


    }
}