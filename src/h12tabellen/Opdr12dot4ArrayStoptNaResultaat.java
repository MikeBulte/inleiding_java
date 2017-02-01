package h12tabellen;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Mike on 1/10/2017.
 * Deze applet gebruikt een while loop om door alle waardes in een tabel te gaan met een if statement.
 * Als de waarde gevonden is gebruikt het een break statement om uit de while loop te gaan.
 */
public class Opdr12dot4ArrayStoptNaResultaat extends Applet {

    private int teller = 0;

    private boolean gevonden;
    private double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    private double gezocht;

    public void init() {
        gezocht = 400;
        gevonden = false;
        while(teller < salaris.length) {
            if(salaris[teller] == gezocht) {
                gevonden = true;
                break;
            }
            teller ++;
        }
    }

    public void paint(Graphics g) {

        if(gevonden) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
        g.drawString("De gezochte waarde was: " + gezocht, 20, 70);
        g.drawString("De teller stond op: " + teller, 20, 90);
    }
}