package h8knoppenentekstvakken;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 9/20/2016.
 */
public class Opdr8dot1TekstMetReset extends Applet {

    Button Knop;

    public void init() {
    Knop = new Button("Klik Hier");
    add(Knop);
    }

    public void paint(Graphics g) {
     g.drawString("boep",100,100);

    }
}
