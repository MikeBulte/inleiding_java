package h14multimedia;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 16-03-17.
 * Deze applet gebruikt Math.Random op 2 arrays om een kaart te maken.
 */
public class Opdr14dot1KaartDelen extends Applet {

    private String kaartKleurArray[] = {
            "Harten", "Klaver", "Ruiten", "Schoppen"
    };

    private String kaartNummerArray[] = {
            "Een", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven",
            "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"
    };

    private String kaartKleurString = "", kaartNummerString = "";

    @Override
    public void init() {
        super.init();

        Button knop = new Button("Deel kaart");
        add(knop);
        knop.addActionListener(new KnopActionListener());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString(kaartKleurString + " " + kaartNummerString, 50, 60);

    }

    private class KnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            kaartKleurString = kaartKleurArray[(int) (Math.random() * (kaartKleurArray.length + 1))];
            kaartNummerString = kaartNummerArray[(int) (Math.random() * (kaartNummerArray.length + 1))];
            repaint();
        }
    }
}
