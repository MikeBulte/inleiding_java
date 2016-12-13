package h11herhaling;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 11/8/2016.
 * De code werkt, maar ontevreden over het aantal loops in elkaar.
 */
public class Opdr11dot9Schaakbord extends Applet {

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 50, y = 50;
        int breedte = 20, hoogte = 20;
        int kolom;
        setBackground(Color.gray);

        for (int lijn = 0; lijn < 8; lijn++) {

            if (lijn == 0 || lijn == 2 || lijn == 4 || lijn == 6) {

                for (kolom = 0; kolom < 8; kolom++) {

                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
            } else {
                for (kolom = 0; kolom < 8; kolom++) {

                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.white);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x += breedte;
                }
            }
            x = 50;
            y += 20;
        }
    }
}


