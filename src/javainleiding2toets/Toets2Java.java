package javainleiding2toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by Mike on 4/19/2017.
 */
public class Toets2Java extends Applet {

    private int creditPlayer = 10;
    private String creditString;

    private boolean playBoolean;

    private URL url;
    private Image slotImage1, slotImage2, slotImage3;
    private String slotString;

    @Override
    public void init() {
        super.init();

        Button playButton = new Button("Play");
        add(playButton);
        playButton.addActionListener(new PlayButtonActionListener());

        Button creditBuyButton = new Button("Buy Credit");
        add(creditBuyButton);
        creditBuyButton.addActionListener(new CreditBuyButtonActionListener());

        url = Toets2Java.class.getResource("/images/");

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (!playBoolean) {
            slotImage1 = getImage(url, "fruit_" + (Math.random() * 20));
        } else {

        }

    }

    private class PlayButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class CreditBuyButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
