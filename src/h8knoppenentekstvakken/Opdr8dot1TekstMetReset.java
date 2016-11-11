package h8knoppenentekstvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 9/20/2016.
 * Dit is tekstvak met 2 knoppen, een tekstvak en een string. De Ok knop print de tekst op de string eronder terwijl de Reset knop de string en het
 * tekstvak reset.
 */
public class Opdr8dot1TekstMetReset extends Applet {

    private TextField textField;
    private String stri;

    public void init() {
        //Hier liggen alle knoppen en tekstvelden met hun locale variabelen
        Button knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        Button reset = new Button("Reset");
        reset.addActionListener(new ResetListener());
        Label lab = new Label("Voer in het tekstvak wat in");
        textField = new TextField("", 20);
        add(lab);
        add(textField);
        add(knop);
        add(reset);
        stri = "Klik op OK of op Reset om deze tekst te veranderen";
    }

    public void paint(Graphics g) {
        setSize(440, 300);
        g.drawString(stri, 15, 60);

    }

    private class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
            repaint();
            stri = "";
        }
    }

    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stri = textField.getText();
            repaint();
        }
    }
}