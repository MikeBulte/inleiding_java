package javainleiding2toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

/**
 * Created by Mike on 4/19/2017.
 */
public class Toets2Java extends Applet {

    private int creditPlayer = 10;
    private String creditString;

    private boolean playBoolean = false;

    private URL url;
    private Image slotImage[] = new Image[3];

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
        setSize(500, 400);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String fruitString;
        int fruitSlotX = 130;

        for (int i = 0; i < 3; i++) {
            fruitString = randomFruitSlot();
            slotImage[i] = getImage(url, "" + fruitString);
            g.drawImage(slotImage[i], fruitSlotX, 100, 70, 165, this);
            fruitSlotX += 70;
        }
        if (slotImage[0] == slotImage[1] && slotImage[1] == slotImage[2]) {
            g.drawString("3 slots zijn gelijk", 100, 280);
        } else if (slotImage[0] == slotImage[1] || slotImage[0] == slotImage[2] || slotImage[1] == slotImage[2]) {
            g.drawString("2 slots zijn gelijk!", 100, 300);
        }
    }

    private String randomFruitSlot() {
        Random randomNumber = new Random();
        return "fruit_" + (randomNumber.nextInt(20) + 1) + ".jpg";
    }

    private class PlayButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            repaint();

        }
    }

    private class CreditBuyButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
