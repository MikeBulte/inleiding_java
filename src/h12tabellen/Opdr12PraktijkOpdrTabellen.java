package h12tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 2/3/2017.
 * De User kan 2 Strings van tekst of nummers invoeren in de tekstvakken, die worden vervolgens als waarde in een van
 * 2 Array's geplaatst.
 */
public class Opdr12PraktijkOpdrTabellen extends Applet {

    private String[] namenStringArray;
    private String[] telefoonnummersStringArray;

    private TextField namenTextField = new TextField("", 8);
    private TextField telefoonnummersTextField = new TextField("", 12);

    private boolean checkBoolean = false;
    private int teller = 0;

    @Override
    public void init() {
        super.init();

        this.setSize(500, 400);

        namenStringArray = new String[10];
        telefoonnummersStringArray = new String[10];

        add(namenTextField);
        namenTextField.addActionListener(new NaamEnTelefoonActionListener());

        add(telefoonnummersTextField);
        telefoonnummersTextField.addActionListener(new NaamEnTelefoonActionListener());

        Button button = new Button("Ok");
        add(button);
        button.addActionListener(new NaamEnTelefoonActionListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int yCord = 60;

        if (checkBoolean) {
            for (int i = 0; i < 10; i++) {
                g.drawString("Naam " + i + " is " + namenStringArray[i], 50, yCord);
                g.drawString("Telefoon nummer " + i + " is " + telefoonnummersStringArray[i], 200, yCord);
                yCord += 20;
            }
        } else {
            g.drawString("De teller staat nu op " + teller, 50, 60);
        }
    }

    private class NaamEnTelefoonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String naamInvoerString = namenTextField.getText();
            String telefoonInvoerString = telefoonnummersTextField.getText();

            namenStringArray[teller] = naamInvoerString;
            telefoonnummersStringArray[teller] = telefoonInvoerString;

            if (teller < 10)
                teller++;

            if (teller == 10) {
                checkBoolean = true;
                repaint();
            }
            repaint();
        }
    }
}
