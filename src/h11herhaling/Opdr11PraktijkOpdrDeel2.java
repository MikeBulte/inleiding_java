package h11herhaling;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 1/10/2017.
 * Deze applet doet in principe hetzelfde als in het eerste deel van de praktijk opdracht. Maar het gebruikt een knop
 * die het tafel getal met 1 omhoog brengt. Als het tafel getal boven de 10 is dan wordt deze weer terug gezet
 * naar 1.
 */
public class Opdr11PraktijkOpdrDeel2 extends Applet {

    private int tafelGetal = 1;

    @Override
    public void init() {
        super.init();

        Button knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new KnopActionListener());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int yCord = 40;
        for (int teller = 1; teller <= 10; teller++) {

            int multiplyGetal = tafelGetal * teller;
            //De Y Coordinaat vergroting is verder in de code naar beneden gezet om een duplicate code warning te voorkomen. ¯\_(ツ)_/¯
            yCord += 20;
            String tabelString = tafelGetal + " x " + teller + " = " + multiplyGetal;
            g.drawString(tabelString, 50, yCord);
        }
    }

    private class KnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            tafelGetal++;
            repaint();
            if (tafelGetal > 10) {
                tafelGetal = 1;
            }
        }
    }
}
