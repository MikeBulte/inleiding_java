package h14multimedia;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by Mike on 3/23/2017.
 */
public class Opdr14PraktijkOpdrLucifers extends Applet {

    private int luciferAantal;
    private int playerAantal;
    private boolean turnBoolean;

    private String statusString;

    private TextField tekstVeld = new TextField("", 4);

    private Image luciferImage;

    @Override
    public void init() {
        super.init();

        URL luciferURL = Opdr14PraktijkOpdrLucifers.class.getResource("/images/");
        luciferImage = getImage(luciferURL, "lucifer.jpg");
        luciferAantal = 23;

        statusString = "Er zijn " + luciferAantal + " lucifers over.";

        add(tekstVeld);
        tekstVeld.addActionListener(new TekstVeldActionListener());

        setSize(600, 400);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int x = 0,
                y = 50;

        g.drawString("" + statusString, 100, 25);
        for (int i = 0; i < luciferAantal; i++) {
            g.drawImage(luciferImage, x, y, this);
            x += luciferImage.getWidth(this);
            if (x >= 500) {
                x = 0;
                y += luciferImage.getHeight(this);
            }
        }

    }

    private class TekstVeldActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            //Haal dit later uit de actionlistener en naar een losse methode
            if (turnBoolean) {
                playerAantal = Integer.parseInt(tekstVeld.getText());
                if (playerAantal >= 1 && playerAantal <= 3) {
                    luciferAantal = luciferAantal - playerAantal;
                    statusString = "Er zijn " + luciferAantal + " lucifers over.";
                } else {
                    statusString = "Dit is geen geldige invoer!";
                }
                turnBoolean = false;
                repaint();
            }
        }
    }
}
