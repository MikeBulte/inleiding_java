package h10beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 1/13/2017.
 * Deze applet gebruikt meerdere cases per antwoord om veel minder code te schrijven. Misschien ook niet de beste manier
 * om een switch statement te gebruiken op te string maar waard uit te proberen.
 */
public class Opdr10PraktijkOpdr extends Applet {

    private String ingevuldeResultaatString = "";
    private TextField checkTextField = new TextField("", 3);

    private boolean ingevuldeCijferBoolean;
    private int ingevuldeCijferInt;

    @Override
    public void init() {
        super.init();

        this.setSize(500, 300);
        add(checkTextField);
        checkTextField.addActionListener(new CheckTextFieldActionListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (ingevuldeCijferBoolean) {
            g.drawString("Uw cijfer is een " + ingevuldeCijferInt + ". Dit is " + ingevuldeResultaatString, 50, 60);
        } else {
            g.drawString("Dit is niet een geldig getal! Getallen van 1-10 zijn alleen mogelijk!", 50, 60);
        }
    }

    private class CheckTextFieldActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            ingevuldeCijferBoolean = true;
            ingevuldeCijferInt = Integer.parseInt(checkTextField.getText());
            switch (ingevuldeCijferInt) {
                case 1:
                case 2:
                case 3:
                    ingevuldeResultaatString = "slecht.";
                    break;
                case 4:
                    ingevuldeResultaatString = "onvoldoende.";
                    break;
                case 5:
                    ingevuldeResultaatString = "matig.";
                    break;
                case 6:
                case 7:
                    ingevuldeResultaatString = "voldoende.";
                    break;
                case 8:
                case 9:
                case 10:
                    ingevuldeResultaatString = "goed.";
                    break;
                default:
                    ingevuldeCijferBoolean = false;
                    break;
            }
            repaint();
        }
    }
}
