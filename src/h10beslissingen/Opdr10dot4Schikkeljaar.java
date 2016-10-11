package h10beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 10/11/2016.
 * Deze applet is identiek aan Opdr10dot3Maanden, maar houdt deze ook bij of het een schikkeljaar is en verandert de 28
 * van februari naar 29.
 */
public class Opdr10dot4Schikkeljaar extends Applet {

    private TextField tekstveld;
    private TextField schikkelTekstveld;
    private String maandString = "";
    private String jaarTekst = "";
    private int schikkeljaar = 28;

    @Override
    public void init() {
        super.init();

        setSize(750, 300);

        Label label = new Label("Voer hier het maandnummer in");
        add(label);
        tekstveld = new TextField("", 5);
        tekstveld.addActionListener(new TekstveldListener());
        add(tekstveld);
        Button knop = new Button("Check de maand");
        knop.addActionListener(new TekstveldListener());
        add(knop);

        Label schikkeljaarlabel = new Label("Voer hier het jaartal in");
        add(schikkeljaarlabel);
        schikkelTekstveld = new TextField("", 6);
        schikkelTekstveld.addActionListener(new SchikkeljaarTekstveldListener());
        add(schikkelTekstveld);
        Button schikkeljaarKnop = new Button("Check voor een schikkeljaar");
        schikkeljaarKnop.addActionListener(new SchikkeljaarTekstveldListener());
        add(schikkeljaarKnop);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("" + maandString, 50, 100);
        g.drawString("" + jaarTekst, 50, 150);
    }

    private class SchikkeljaarTekstveldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            int jaartal = Integer.parseInt(schikkelTekstveld.getText());

            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                jaarTekst = "" + jaartal + " is een schrikkeljaar";
                schikkeljaar = 29;
            } else {
                jaarTekst = "" + jaartal + " is geen schrikkeljaar";
                schikkeljaar = 28;
            }
            repaint();
        }
    }

    private class TekstveldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int maand = Integer.parseInt(tekstveld.getText());

            switch (maand) {
                case 1:
                    maandString = "Er zijn 31 dagen in januari.";
                    repaint();
                    break;
                case 2:
                    maandString = "Er zijn " + schikkeljaar + " dagen in februari.";
                    repaint();
                    break;
                case 3:
                    maandString = "Er zijn 31 dagen in maart.";
                    repaint();
                    break;
                case 4:
                    maandString = "Er zijn 30 dagen in april.";
                    repaint();
                    break;
                case 5:
                    maandString = "Er zijn 31 dagen in mei.";
                    repaint();
                    break;
                case 6:
                    maandString = "Er zijn 30 dagen in juni.";
                    repaint();
                    break;
                case 7:
                    maandString = "Er zijn 31 dagen in juli.";
                    repaint();
                    break;
                case 8:
                    maandString = "Er zijn 31 dagen in augustus.";
                    repaint();
                    break;
                case 9:
                    maandString = "Er zijn 30 dagen in september.";
                    repaint();
                    break;
                case 10:
                    maandString = "Er zijn 31 dagen in oktober.";
                    repaint();
                    break;
                case 11:
                    maandString = "Er zijn 30 dagen in november.";
                    repaint();
                    break;
                case 12:
                    maandString = "Er zijn 31 dagen in december.";
                    repaint();
                    break;
                default:
                    maandString = "Dit is niet een maandnummer, probeer een ander van 1 tot 12.";
                    repaint();
                    break;
            }
        }
    }
}
