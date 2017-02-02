package h12tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 2/2/2017.
 * De user kan een getal invoeren, als dit getal in de array staat dan maakt het een break statement en print op het
 * scherm waar de index lag toen het getal gevonden werd.
 */
public class Opdr12dot5ZoekopdrachtArray extends Applet {

    private boolean resultaatBoolean;
    private boolean verbergBoolean;
    private int zoekGetalInt;
    private int indexTeller;

    private int[] voorgevuldeArray = {
            11, 20, 30, 35,
            63, 214, 772,
            6, 23, 1111
    };

    private TextField textField;

    @Override
    public void init() {
        super.init();

        textField = new TextField("", 5);
        add(textField);
        textField.addActionListener(new OpzoekListener());

        Button button = new Button("Zoek op");
        add(button);
        button.addActionListener(new OpzoekListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (verbergBoolean) {
            if (resultaatBoolean) {
                g.drawString("Het opgezochte getal kon gevonden worden, het is " + zoekGetalInt, 50, 60);
            } else {
                g.drawString("Het opgezochte getal kon niet gevonden worden!", 50, 60);
            }
            g.drawString("De array index staat op " + indexTeller, 50, 80);
        }
    }

    private class OpzoekListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            zoekGetalInt = Integer.parseInt(textField.getText());
            resultaatBoolean = false;
            //Laat tekst op het scherm komen
            verbergBoolean = true;
            int teller = 0;
            while (teller < voorgevuldeArray.length) {
                if (voorgevuldeArray[teller] == zoekGetalInt) {
                    resultaatBoolean = true;
                    break;
                }
                teller++;
            }
            //Teller waarde wordt pas na de while loop op indexTeller gekopieerd
            indexTeller = teller;
            repaint();
        }
    }
}
