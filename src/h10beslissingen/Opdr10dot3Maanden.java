package h10beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 10/4/2016.
 */
public class Opdr10dot3Maanden extends Applet {

    private TextField tekstveld;
    private Button knop;
    private String maandString = "";


    @Override
    public void init() {
        super.init();

        Label label = new Label("Voer hier het maandnummer in");
        add(label);
        tekstveld = new TextField("", 5);
        tekstveld.addActionListener(new TekstveldListener());
        add(tekstveld);
        knop = new Button("Ok");
        knop.addActionListener(new TekstveldListener());
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("" + maandString, 50, 60);
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
                    maandString = "Er zijn 28 dagen in februari.";
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
