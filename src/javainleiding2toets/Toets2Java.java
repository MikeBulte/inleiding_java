package javainleiding2toets;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

/**
 * Created by Mike on 4/19/2017.
 * Deze applet maakt een speelbare slot machine.
 */
public class Toets2Java extends Applet {

    private int creditPlayer = 10;
    //Alle slots worden uitgekozen en vergeleken met deze Array.
    private int slotIntCurrentArray[] = new int[3];

    private AudioClip purchaseCreditSound, playSound, twoIdenticalSound, threeIdenticalSound;

    private Button playButton, creditBuyButton;

    private Image slotArray[] = new Image[20];
    private Image slotCurrentArray[] = new Image[3];

    private String winString = "";

    @Override
    public void init() {
        super.init();

        playButton = new Button("Play");
        add(playButton);
        playButton.addActionListener(new PlayButtonActionListener());

        creditBuyButton = new Button("Buy Credit");
        add(creditBuyButton);
        creditBuyButton.addActionListener(new CreditBuyButtonActionListener());

        URL imageURL = Toets2Java.class.getResource("/images/");
        URL audioURL = Toets2Java.class.getResource("/sound/");
        //Laad alle images in een array zodat het steeds niet van de schijf hoeft te laden bij iedere spin
        for (int i = 0; i < slotArray.length; i++) {
            slotArray[i] = getImage(imageURL, "fruit_" + i + ".jpg");
        }

        playSound = getAudioClip(audioURL, "playslots.wav");
        purchaseCreditSound = getAudioClip(audioURL, "creditpurchase.wav");
        twoIdenticalSound = getAudioClip(audioURL, "smallwin.wav");
        threeIdenticalSound = getAudioClip(audioURL, "bigwin.wav");

        setSize(475, 400);
        checkCredit();
        randomSlots();
    }

    @Override
    public void paint(Graphics g) {

        int fruitSlotX = 130; //Controleert ook de plaats van de tekst onder de slots.

        g.drawString("" + winString, fruitSlotX, 300);
        g.drawString("Credit over: " + creditPlayer, fruitSlotX, 280);

        for (int i = 0; i < 3; i++) {
            g.drawImage(slotCurrentArray[i], fruitSlotX, 100, 70, 165, this);
            fruitSlotX += 70;
        }
    }

    private void randomSlots() {
        for (int i = 0; i < slotIntCurrentArray.length; i++) {
            Random randomNumber = new Random();
            slotIntCurrentArray[i] = randomNumber.nextInt(19) + 1;
            slotCurrentArray[i] = slotArray[slotIntCurrentArray[i]];
        }
    }

    private void checkCredit() {
        if (creditPlayer > 0) {
            playButton.setEnabled(true);
            creditBuyButton.setEnabled(false);
        } else {
            playButton.setEnabled(false);
            creditBuyButton.setEnabled(true);
        }
    }

    private class PlayButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            creditPlayer--;

            randomSlots();
            repaint();

            if (slotIntCurrentArray[0] == slotIntCurrentArray[1] && slotIntCurrentArray[1] == slotIntCurrentArray[2]) {
                creditPlayer += 20;
                winString = "Je hebt 3 dezelfde, je hebt 20 credit gewonnen!";
                threeIdenticalSound.play();
            } else if (slotIntCurrentArray[0] == slotIntCurrentArray[1] || slotIntCurrentArray[1] == slotIntCurrentArray[2]) {
                creditPlayer += 4;
                winString = "Je hebt 2 dezelfde, je hebt 4 credit gewonnen!";
                twoIdenticalSound.play();
            } else {
                playSound.play();
                winString = "";
            }
            checkCredit();
        }
    }

    private class CreditBuyButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            creditPlayer += 10;
            winString = "Je hebt 10 credit gekocht, veel speelplezier!";
            purchaseCreditSound.play();
            checkCredit();
            repaint();
        }
    }
}
