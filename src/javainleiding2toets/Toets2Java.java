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
    private String winString;

    private boolean firstPlayBoolean = false;
    private boolean winBoolean = false;

    private Button playButton;
    private Button creditBuyButton;

    private URL url;
    private Image slotImage[] = new Image[3];

    @Override
    public void init() {
        super.init();

        playButton = new Button("Play");
        add(playButton);
        playButton.addActionListener(new PlayButtonActionListener());

        creditBuyButton = new Button("Buy Credit");
        add(creditBuyButton);
        creditBuyButton.addActionListener(new CreditBuyButtonActionListener());

        url = Toets2Java.class.getResource("/images/");
        setSize(500, 400);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String fruitString;
        int fruitSlotX = 130; //Controleert ook de plaats van de tekst onder de slots.
        g.drawString("Credit over: " + creditPlayer, fruitSlotX, 280);

        if (firstPlayBoolean) {
            if (winBoolean) {
                g.drawString("" + winString, fruitSlotX, 300);
            }
        }

        for (int i = 0; i < 3; i++) {
            fruitString = randomFruitSlot();
            slotImage[i] = getImage(url, "" + fruitString);
            g.drawImage(slotImage[i], fruitSlotX, 100, 70, 165, this);
            fruitSlotX += 70;
        }

        if (creditPlayer != 0) {
            playButton.setEnabled(true);
            creditBuyButton.setEnabled(false);
        } else {
            playButton.setEnabled(false);
            creditBuyButton.setEnabled(true);
        }
    }

    private String randomFruitSlot() {
        Random randomNumber = new Random();
        return "fruit_" + (randomNumber.nextInt(20) + 1) + ".jpg";
    }

    private class PlayButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            firstPlayBoolean = true;
            creditPlayer--;
            if (slotImage[0] == slotImage[1] && slotImage[1] == slotImage[2]) {
                creditPlayer += 20;
                winBoolean = true;
                winString = "Je hebt 3 dezelfde, je 20 credit gewonnen";
            } else if (slotImage[0] == slotImage[1] || slotImage[0] == slotImage[2] || slotImage[1] == slotImage[2]) {
                creditPlayer += 4;
                winBoolean = true;
                winString = "Je hebt 2 dezelfde, je 4 credit gewonnen";
            } else {
                winBoolean = false;
            }
            repaint();
        }
    }

    private class CreditBuyButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            creditPlayer += 10;
            winBoolean = true;
            winString = "Je hebt 10 credit gekocht, veel speelplezier!";
        }
    }
}
