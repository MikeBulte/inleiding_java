package test;

import java.applet.Applet;
import java.awt.*;
/*
 * Created by Mike on 9/14/2016.
 */
public class VariabelenOefenen extends Applet {


    Color achtergrond;
    Color tekst;
    int getal;
    int getal2;


    @Override
    public void init() {
        super.init();
        achtergrond = new Color(102, 255, 102);
        tekst = Color.RED;
        getal = 55;
        getal2 = 155;
        //
        setBackground(achtergrond);

    }

        @Override
        public void paint(Graphics g) {

            Font myFont = new Font("TimesRoman", Font.BOLD, 33);
            g.setFont(myFont);

            super.paint(g);
            g.setColor(tekst);
            int x = 60;
            int y = 80;
          //  int som = getal + getal2;
            g.drawString("Het getal is :" + (getal + getal2), x, y);
            y = y + 300;
            g.drawString("" + achtergrond, x, y);

    }
}
