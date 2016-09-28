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



    public String manGastenString;
    public String manGastenPotentString;
    public String vrouwGastenString;
    public String vrouwGastenPotentString;

    int manGastenInt = 0;
    int manGasten = 0;

    public void init() {


        int manGastenPotentInt = 0;
        int vrouwGastenInt = 0;
        int vrouwGastenPotentInt = 0;

        Button manGastenKnop = new Button("Voeg toe");
        add(manGastenKnop);
        manGastenKnop.addActionListener(new manGastenKnopListener());

        Button manGastenPotentKnop = new Button("Voeg toe");


        Button vrouwGastenKnop = new Button("Voeg toe");


        Button vrouwGastenPotentKnop = new Button("Voeg toe");



        manGastenString = "Mannen die er zijn: " + manGasten;
        manGastenPotentString = "Mannen die er zijn: " + manGastenPotentInt;
        vrouwGastenString = "Mannen die er zijn: " + vrouwGastenInt;
        vrouwGastenPotentString = "Mannen die er zijn: " + vrouwGastenPotentInt;






    }



    public void paint(Graphics g) {

    g.drawString(manGastenString,50,60);
    }

    private class manGastenKnopListener implements ActionListener {
        @Override
        public void actionPerformed( ActionEvent e ) {



            repaint();



        }
    }
}