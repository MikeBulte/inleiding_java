package h11herhaling;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 1/10/2017.
 * Deze applet gebruikt een tekstveld om vervolgens met een loop een tafel te schrijven. De applet begint pas met
 * painten als er een getal in het tekstveld staat. Daarna pakt het de ingevulde getal en berekent het de tafel in de
 * paint functie.
 */
public class Opdr11PraktijkOpdrDeel1 extends Applet {

    /* Het tafel getal, het tekstveld en de boolean worden allemaal globaal gedeclareert zodat ze allemaal vanuit de
    *  ActionListener kunnen bewerkt worden.
    */
    private boolean eersteInvoerBoolean;
    private int tafelGetal;
    private TextField tekstveld = new TextField("", 3);

    @Override
    public void init() {
        super.init();

        Label label = new Label("Voer hier de tafel in die u wilt zien");
        add(label);
        add(tekstveld);
        tekstveld.addActionListener(new OkKnopActionListener());
        Button okKnop = new Button("Ok");
        add(okKnop);
        okKnop.addActionListener(new OkKnopActionListener());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (eersteInvoerBoolean) {
            //Initializatie en resetten van de Y Coordinaat bij een actie in het tekstvak of op de knop.
            int yCord = 40;
            for (int teller = 1; teller <= 10; teller++) {
                yCord += 20;
                int multipliedGetal = tafelGetal * teller;
                String tafelString = tafelGetal + " x " + teller + " = " + multipliedGetal;
                g.drawString(tafelString, 50, yCord);
            }
        }
    }

    private class OkKnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            /*
             * De tekst van het tekstveld wordt overgezet naar een integer getal, de boolean die alle tekenopdrachten
             * tegenhoud wordt naar true gezet en er wordt een repaint opdracht uitgevoerd voor als er een nieuw getal
             * wordt ingevoerd.
             */
            tafelGetal = Integer.parseInt(tekstveld.getText());
            eersteInvoerBoolean = true;
            repaint();
        }
    }
}
