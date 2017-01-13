package h10beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 10/11/2016.
 * Deze applet pakt getallen uit het tekstveld, laat zien of ze voldoende of onvoldoende zijn en berekent daarbij ook
 * het gemiddelde en of de user geslaagd is of niet.
 */
public class Opdr10dot5VoldoendeChecker extends Applet {

    private boolean berekenGemiddeldeBoolean;
    //Deze boolean is alleen om het gemiddelde te laten zien
    private boolean gemiddeldeTotaalBoolean;

    private int gemiddeldeCounter;
    private double gemiddeldeDouble;
    private double gemiddeldeOpgetelt;

    private TextField tekstvak = new TextField("", 7);
    private String vorigeCijferString = "";

    @Override
    public void init() {
        super.init();

        Label label = new Label("Voer hier uw cijfers in");
        add(label);

        add(tekstvak);
        tekstvak.addActionListener(new BerekenActionListener());

        Button berekenKnop = new Button("Ok");
        add(berekenKnop);
        berekenKnop.addActionListener(new BerekenActionListener());

        Button gemiddeldeKnop = new Button("Bereken Gemiddelde");
        add(gemiddeldeKnop);
        gemiddeldeKnop.addActionListener(new GemiddeldeKnopActionListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //laat het vorige ingevoerde cijfer met voldoende of onvoldoende zien
        if (berekenGemiddeldeBoolean) {
            g.drawString("Uw vorige ingevoerde cijfer was een " + vorigeCijferString, 50, 60);
        }

        //laat zien wat het gemiddelde is
        if (gemiddeldeTotaalBoolean) {
            g.drawString("Uw gemiddelde cijfer is een: " + gemiddeldeDouble, 50, 60);
            //if statement om te laten zien of de user geslaagd of gezakt is
            if(gemiddeldeDouble >= 6) {
                g.drawString("U bent geslaagd!", 50, 80);
            } else {
                g.drawString("U bent gezakt!", 50, 80);
            }
        }
    }

    private class BerekenActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            double huidigGetal = Double.parseDouble(tekstvak.getText());
            if (huidigGetal >=6) {
                vorigeCijferString = "Voldoende";
            } else {
                vorigeCijferString = "Onvoldoende";
            }
            //schakelt naar ingevulde cijfer te laten zien
            berekenGemiddeldeBoolean = true;
            gemiddeldeTotaalBoolean = false;

            //counter gaat omhoog voor het totaal aantal getallen
            gemiddeldeCounter++;
            //het ingevoerde getal wordt toegevoegd in het opgetelde totaal getal voor alle cijfers
            gemiddeldeOpgetelt = gemiddeldeOpgetelt + huidigGetal;
            //daarna wordt het gemiddelde uitgerekend
            gemiddeldeDouble = gemiddeldeOpgetelt / gemiddeldeCounter;
            repaint();

        }
    }

    private class GemiddeldeKnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        //schakelt naar het gemiddelde te laten zien
        berekenGemiddeldeBoolean = false;
        gemiddeldeTotaalBoolean = true;
        repaint();

        }
    }
}
