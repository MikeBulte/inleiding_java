package h13methodes;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 15-02-17.
 * Deze applet maakt vijf buttons die allemaal een andere kleur hebben, als er op een van de buttons geklikt wordt dan
 * verandert de achtergrond naar die kleur en komt er de naam van de kleur in String formaat op het scherm.
 * <p>
 * Dit is zo geschreven door uitleg van Beuningen. Deze code kan veel efficienter en netter, maar dat ging tegen alle uitleg van het hoofdstuk tegen.
 */
public class Opdr13dot1AchtergrondKleur extends Applet {

    private Button[] buttonArray = new Button[5];
    private String resultString;
    private boolean checkBoolean = false;

    @Override
    public void init() {
        super.init();

        colorButtons();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (checkBoolean)
            g.drawString("" + resultString, 50, 60);
    }

    private void colorButtons() {

        for (int i = 0; i < buttonArray.length; i++) {
            switch (i) {
                case 0: {
                    buttonArray[i] = new Button("Blauw");
                    buttonArray[i].setBackground(Color.blue);
                    buttonArray[i].addActionListener(new BlueButtonArrayActionListener());
                    break;
                }
                case 1: {
                    buttonArray[i] = new Button("Rood");
                    buttonArray[i].setBackground(Color.red);
                    buttonArray[i].addActionListener(new RedButtonArrayActionListener());
                    break;
                }
                case 2: {
                    buttonArray[i] = new Button("Groen");
                    buttonArray[i].setBackground(Color.green);
                    buttonArray[i].addActionListener(new GreenButtonArrayActionListener());
                    break;
                }
                case 3: {
                    buttonArray[i] = new Button("Geel");
                    buttonArray[i].setBackground(Color.yellow);
                    buttonArray[i].addActionListener(new YellowButtonArrayActionListener());
                    break;
                }
                case 4: {
                    buttonArray[i] = new Button("Roze");
                    buttonArray[i].setBackground(Color.pink);
                    buttonArray[i].addActionListener(new PinkButtonArrayActionListener());
                    break;
                }
                default: {
                    break;
                }
            }
            add(buttonArray[i]);
        }
    }

    private class BlueButtonArrayActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkBoolean = true;
            setBackground(Color.blue);
            resultString = "Blauw";
            repaint();
        }
    }

    private class RedButtonArrayActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkBoolean = true;
            setBackground(Color.red);
            resultString = "Rood";
            repaint();
        }
    }

    private class GreenButtonArrayActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkBoolean = true;
            setBackground(Color.green);
            resultString = "Groen";
            repaint();
        }
    }

    private class YellowButtonArrayActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkBoolean = true;
            setBackground(Color.yellow);
            resultString = "Geel";
            repaint();
        }
    }

    private class PinkButtonArrayActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkBoolean = true;
            setBackground(Color.pink);
            resultString = "Roze";
            repaint();
        }
    }
}
