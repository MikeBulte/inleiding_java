package h8knoppenentekstvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 9/28/2016.
 * Na 1000 jaar werken de staafdiagrammen.
 */
public class Opdr8UitbreidingStaafDiagram extends Applet {

    private TextField valerieTekstveld = new TextField("40", 7);
    private TextField jeroenTekstveld = new TextField("100", 7);
    private TextField hansTekstveld = new TextField("80", 7);

    private int beginpuntValerie = 320;
    private int eindpuntValerie = 160;
    private int beginpuntJeroen = 80;
    private int eindpuntJeroen = 400;
    private int beginpuntHans = 160;
    private int eindpuntHans = 320;

    @Override
    public void init() {
        super.init();

        Label valerieLabel = new Label("Valerie:");
        add(valerieLabel);
        add(valerieTekstveld);

        Label jeroenLabel = new Label("Jeroen:");
        add(jeroenLabel);
        add(jeroenTekstveld);

        Label hansLabel = new Label("Hans:");
        add(hansLabel);
        add(hansTekstveld);

        Button knop = new Button("Bewerk");
        add(knop);
        knop.addActionListener(new KnopActionListener());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        setSize(1000, 800);

        int bodemTekstPos = 500;

        //Tabel Opbouw, kan later nog met variabelen verbeteren
        //Iedere 80 pixels omhoog is 20 kg op de tabel.
        //Dit kan door het beginpunt met 40 te verminderen en het eindpunt met 40 te verhogen.
        g.drawLine(100, 75, 100, 480);
        g.drawLine(100, 480, 600, 480);

        g.setColor(Color.gray);
        g.drawLine(100, 80, 550, 80);
        g.drawLine(100, 160, 550, 160);
        g.drawLine(100, 240, 550, 240);
        g.drawLine(100, 320, 550, 320);
        g.drawLine(100, 400, 550, 400);

        g.drawLine(560, 440, 560, 480);

        //Cijfers en tekst
        g.setColor(Color.black);
        g.drawString("100 KG", 55, 80);
        g.drawString("80 KG", 55, 160);
        g.drawString("60 KG", 55, 240);
        g.drawString("40 KG", 55, 320);
        g.drawString("20 KG", 55, 400);
        g.drawString("0 KG", 55, 480);

        g.drawString("Valerie", 155, bodemTekstPos);
        g.drawString("Jeroen", 245, bodemTekstPos);
        g.drawString("Hans", 340, bodemTekstPos);

        //Tabel balken

        g.setColor(Color.cyan);
        g.fillRect(160, beginpuntValerie, 30, eindpuntValerie);
        g.setColor(Color.orange);
        g.fillRect(250, beginpuntJeroen, 30, eindpuntJeroen);
        g.setColor(Color.magenta);
        g.fillRect(340, beginpuntHans, 30, eindpuntHans);

    }

    private class KnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            int valerieKG = Integer.parseInt(valerieTekstveld.getText());
            int jeroenKG = Integer.parseInt(jeroenTekstveld.getText());
            int hansKG = Integer.parseInt(hansTekstveld.getText());

            beginpuntValerie = 480 - (valerieKG * 4);
            eindpuntValerie = (valerieKG * 4);

            beginpuntJeroen = 480 - (jeroenKG * 4);
            eindpuntJeroen = (jeroenKG * 4);

            beginpuntHans = 480 - (hansKG * 4);
            eindpuntHans = (hansKG * 4);

            repaint();
        }
    }
}