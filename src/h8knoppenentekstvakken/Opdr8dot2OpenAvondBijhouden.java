package h8knoppenentekstvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 9/22/2016.
 * Een java applet die 4 verschillende getallen kan bijhouden en op laten tellen. Er is een knop voor potentiele gasten
 * en gasten die er daadwerkelijk zijn.
 */
public class Opdr8dot2OpenAvondBijhouden extends Applet {

    private int manGasten = 0;
    private int manGastenPotent = 0;
    private int vrouwGasten = 0;
    private int vrouwGastenPotent = 0;

    public void init() {

        setSize(500, 250);

        Button manGastenKnop = new Button("Voeg een mannelijke gast toe");
        add(manGastenKnop);
        manGastenKnop.addActionListener(new manGastenKnopListener());

        Button manGastenPotentKnop = new Button("Voeg een potentiele mannelijke gast toe");
        add(manGastenPotentKnop);
        manGastenPotentKnop.addActionListener(new manGastenPotentKnopListener());

        Button vrouwGastenKnop = new Button("Voeg een vrouwelijke gast toe");
        add(vrouwGastenKnop);
        vrouwGastenKnop.addActionListener(new vrouwGastenKnopListener());

        Button vrouwGastenPotentKnop = new Button("Voeg een potentiele vrouwelijke gast toe");
        add(vrouwGastenPotentKnop);
        vrouwGastenPotentKnop.addActionListener(new vrouwGastenPotentKnopListener());

    }


    public void paint(Graphics g) {

        g.setColor(new Color(218, 165, 32));
        g.fillRect(40, 80, 350, 50);
        g.fillRect(40, 150, 250, 70);
        g.setColor(Color.black);

        String manGastenString = "Mannen die er zijn: " + manGasten;
        String manGastenPotentString = "Potentieel aantal mannen: " + manGastenPotent;
        String vrouwGastenString = "Vrouwen die er zijn: " + vrouwGasten;
        String vrouwGastenPotentString = "Mannen die er zijn: " + vrouwGastenPotent;
        String totaalGastenString = "Totaal aantal gasten: " + (manGasten + vrouwGasten);
        String totaalGastenPotentString = "Totaal aantal potentiële gasten: " + (manGastenPotent + vrouwGastenPotent);
        String totaalGastenCombineerdString = "Alle gasten en potentiële gasten samen: " + (manGasten + manGastenPotent + vrouwGasten + vrouwGastenPotent);

        g.drawString(manGastenString, 50, 100);
        g.drawString(manGastenPotentString, 50, 120);
        g.drawString(vrouwGastenString, 250, 100);
        g.drawString(vrouwGastenPotentString, 230, 120);
        g.drawString(totaalGastenString, 50, 170);
        g.drawString(totaalGastenPotentString, 50, 190);
        g.drawString(totaalGastenCombineerdString, 50, 210);

        g.drawRect(40, 80, 350, 50);
        g.drawRect(40, 150, 250, 70);

    }

    private class manGastenKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            manGasten = manGasten + 1;
            repaint();

        }
    }

    private class manGastenPotentKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            manGastenPotent = manGastenPotent + 1;
            repaint();

        }
    }

    private class vrouwGastenKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            vrouwGasten = vrouwGasten + 1;
            repaint();

        }
    }

    private class vrouwGastenPotentKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            vrouwGastenPotent = vrouwGastenPotent + 1;
            repaint();

        }
    }
}