package h13methodes;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 09-03-17.
 * Deze applet bouwt een muur van keuze met 2 loops, een die 10 stukken per regel maakt en een die naar de volgende regel gaat.
 *
 */
public class Opdr13dot4VerschillendeMuren extends Applet {

    private boolean baksteenBoolean, betonBlokBoolean, checkBoolean;
    private int x, y, width, height;

    @Override
    public void init() {
        super.init();

        setSize(400, 375);

        Button baksteenKnop = new Button("Maak Bakstenen Muur");
        add(baksteenKnop);
        baksteenKnop.addActionListener(new BaksteenKnopActionListener());

        Button betonblokKnop = new Button("Maak Betonnen Muur");
        add(betonblokKnop);
        betonblokKnop.addActionListener(new BetonBlokKnopActionListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (checkBoolean)
            tekenMuren(g, x, y, width, height);
    }

    private void tekenMuren(Graphics g, int x, int y, int width, int height) {

        if (baksteenBoolean) {
            //Regel loop
            for (int regel = 0; regel < 15; regel++) {
                //Aantal Bakstenen per regel
                for (int bakstenen = 0; bakstenen < 11; bakstenen++) {
                    g.setColor(Color.lightGray);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.red);
                    g.fill3DRect((x + 5), (y + 5), (width - 10), (height - 10), true);
                    x += width;
                } //Einde Bakstenen Loop
                y += height;
                if(regel == 0 || regel == 2 || regel == 4 || regel == 6 || regel == 8 || regel == 10 || regel == 12 || regel == 14) {
                    x = -20;
                } else {
                    x = 0;
                }
            } //Einde Regel Loop
        } else if (betonBlokBoolean) { //Einde If-Statement
            //Regel loop
            for (int regel = 0; regel < 15; regel++) {
                //Aantal Betonblokken per regel
                for (int betonblokken = 0; betonblokken < 10; betonblokken++) {
                    g.setColor(Color.lightGray);
                    g.fill3DRect(x, y, width, height, true);
                    g.setColor(Color.black);
                    g.drawRect(x, y, width, height);
                    x += width;
                } //Einde Betonblok per regel
                y+= height;
                if(regel == 0 || regel == 2 || regel == 4 || regel == 6 || regel == 8 || regel == 10 || regel == 12 || regel == 14) {
                    x = -30;
                } else {
                    x = 0;
                }
            }
        }
    }

    private class BaksteenKnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            baksteenBoolean = true;
            betonBlokBoolean = false;
            checkBoolean = true;
            width = 40;
            height = 25;
            x = 0;
            y = 0;
            repaint();
        }
    }

    private class BetonBlokKnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            baksteenBoolean = false;
            betonBlokBoolean = true;
            checkBoolean = true;
            width = 60;
            height = 40;
            x = 0;
            y = 0;
            repaint();
        }
    }
    /*
     g.setColor(Color.lightGray);
     g.fillRect(x, y, width, height);
     g.setColor(Color.red);
     g.fill3DRect((x + 5), (y + 5), (width - 10), (height - 10), true);
     */
}
