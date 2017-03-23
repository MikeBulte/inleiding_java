package h14multimedia;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

/**
 * Created by Mike on 17-03-17.
 * Deze applet deelt een aantal kaarten via de random functie uit, maar de deckArray springt een ArrayIndexOutOfBoundsException
 * na de eerste keer.
 */
public class Opdr14dot2KaartVerdelen extends Applet {

    private boolean checkBoolean = false;
    private int arraysLengthCombined;

    private AudioClip sound;

    private String deckArray[];

    private String kaartKleurArray[] = {
            "Harten", "Klaver", "Ruiten", "Schoppen"
    };

    private String kaartNummerArray[] = {
            "Een", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven",
            "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"
    };

    private String player1Array[];
    private String player2Array[];
    private String player3Array[];
    private String player4Array[];

    @Override
    public void init() {
        super.init();

        setSize(500, 400);
        URL path = Opdr14dot2KaartVerdelen.class.getResource("/sound/");
        sound = getAudioClip(path, "carddrawing.wav");

        Button deelKnop = new Button("Deel Kaarten");
        add(deelKnop);
        deelKnop.addActionListener(new DeelKnopActionListener());

        player1Array = new String[13];
        player2Array = new String[player1Array.length];
        player3Array = new String[player1Array.length];
        player4Array = new String[player1Array.length];
        arraysLengthCombined = player1Array.length + player2Array.length + player3Array.length + player4Array.length;
        deckArray = new String[arraysLengthCombined];
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int player1X = 50, player2X = 150, player3X = 250, player4X = 350, playerY = 50;

        if (checkBoolean) {
            for (int i = 0; i < player1Array.length; i++) {
                if (i == 0) {
                    g.drawString("Player 1 heeft ", player1X, playerY);
                    g.drawString("Player 2 heeft ", player2X, playerY);
                    g.drawString("Player 3 heeft ", player3X, playerY);
                    g.drawString("Player 4 heeft ", player4X, playerY);
                    playerY += 20;
                } // Einde if- condition
                g.drawString("" + player1Array[i], player1X, playerY);
                g.drawString("" + player2Array[i], player2X, playerY);
                g.drawString("" + player3Array[i], player3X, playerY);
                g.drawString("" + player4Array[i], player4X, playerY);
                playerY += 20;
            }
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deckArray.length);
        String kaart = deckArray[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deckArray.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deckArray.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deckArray[i];
                hulpindex++;
            }
        }
        deckArray = hulpLijst;
        return kaart;
    }

    private class DeelKnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            checkBoolean = true;
            int teller1 = 0, teller2 = 0;

            for (int i = 0; i < arraysLengthCombined; i++) {
                if (teller1 == kaartKleurArray.length) {
                    teller1 = 0;
                    teller2++;
                }
                deckArray[i] = (kaartKleurArray[teller1] + " " + kaartNummerArray[teller2]);
                teller1++;
            }

            for (int i = 0; i < player1Array.length; i++) {
                player1Array[i] = deelKaart();
                player2Array[i] = deelKaart();
                player3Array[i] = deelKaart();
                player4Array[i] = deelKaart();
            }
            sound.play();
            repaint();
        }
    }
}
