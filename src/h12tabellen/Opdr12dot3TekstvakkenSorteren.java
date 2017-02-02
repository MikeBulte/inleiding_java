package h12tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by Mike on 2/1/2017.
 * De user kan waardes invoeren in een Textfield Array, als de ActionListener af gaat dan kopieerd deze de waardes
 * van de Tekstfield Array naar een losse Array. Deze Array word gesorteerd en dan in een String geplaatst.
 */
public class Opdr12dot3TekstvakkenSorteren extends Applet {

    private TextField tekstvakkenArray[] = new TextField[5];
    private double[] invoerArray = new double[5];
    private String sorteerString = "";

    @Override
    public void init() {
        super.init();

        for (int i = 0; i < tekstvakkenArray.length; i++) {
            tekstvakkenArray[i] = new TextField("", 5);
            add(tekstvakkenArray[i]);
            tekstvakkenArray[i].addActionListener(new SorteerArrayListener());
        }
        Button button = new Button("Sorteer");
        add(button);
        button.addActionListener(new SorteerArrayListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("" + sorteerString, 50, 60);

    }

    private class SorteerArrayListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvakkenArray.length; i++) {
                invoerArray[i] = Double.parseDouble(tekstvakkenArray[i].getText());
            }
            Arrays.sort(invoerArray);
            sorteerString = "" + Arrays.toString(invoerArray);
            repaint();
        }
    }
}
