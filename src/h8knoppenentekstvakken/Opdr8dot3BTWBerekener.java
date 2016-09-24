package h8knoppenentekstvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 9/24/2016.
 * Deze java applet berekent een BTW getal door het ingevulde getal te pakken er het te vermenigvuldigen met 1.21 oftewel
 * 21%. De knop en enter voeren beide het command uit om te vermenigvuldigen.
 */
public class Opdr8dot3BTWBerekener extends Applet {

    private TextField tekstvak;
    private double btwGetal;

    public void init() {
        tekstvak = new TextField("", 10);
        Label flairlabel = new Label("Voer een getal in om de BTW te berekenen");
        Button knop = new Button("Bereken");
        tekstvak.addActionListener(new TekstvakListener());
        knop.addActionListener(new TekstvakListener());
        add(flairlabel);
        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {

        g.drawString("Uw totaal met BTW is:" + btwGetal, 60, 100);

    }

    private class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String rawvalue = tekstvak.getText();
            double getal = Double.parseDouble(rawvalue);
            btwGetal = getal * 1.21;
            repaint();

        }
    }
}