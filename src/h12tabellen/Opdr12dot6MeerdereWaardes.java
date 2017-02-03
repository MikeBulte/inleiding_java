package h12tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 2/3/2017.
 * De user kan een Integer getal invoeren in de Textfield om vervolgens met een foreach loop door de hele Array te gaan.
 * Bij iedere getal in de array die overeenkomt met de zoekopdracht gaat er een losse teller met 1 omhoog.
 * <p>
 * Dit zou misschien efficienter kunnen door de array te sorteren en dan alle getallen af te gaan tot het opgezochte getal gevonden
 * wordt, en dan als het een ander getal daarna vind de zoek opdracht afbreekt.
 */
public class Opdr12dot6MeerdereWaardes extends Applet {

    private TextField textField = new TextField("", 5);

    private boolean verbergBoolean;

    private int resultaatRepetitieInt;
    private int zoekWaardeInt;
    private int[] meerdereWaardesArray = {
            3, 2, 86, 2, 86, 62, 7772,
            66, 3, 5, 7772, 125, 6745,
            231, 3, 6745, 3, 3, 66,
            86, 2, 86, 753, 90
    };

    @Override
    public void init() {
        super.init();

        add(textField);
        textField.addActionListener(new TextFieldActionListener());

        Button button = new Button("Zoek op");
        add(button);
        button.addActionListener(new TextFieldActionListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (verbergBoolean) {
            g.drawString("Het opgezochte getal was: " + zoekWaardeInt, 50, 60);
            g.drawString("Dit getal is " + resultaatRepetitieInt + " keer voorgekomen uit de Array", 50, 80);
        }
    }


    private class TextFieldActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            zoekWaardeInt = Integer.parseInt(textField.getText());
            verbergBoolean = true;
            resultaatRepetitieInt = 0;

            //De for loop kon vervangen worden met een For-Each Loop, beide veranderen de functie van het programma niet.
            for (int aMeerdereWaardesArray : meerdereWaardesArray) {
                if (aMeerdereWaardesArray == zoekWaardeInt) {
                    resultaatRepetitieInt++;
                }
            }
            /* De for loop
             for (int i = 0; i < meerdereWaardesArray.length; i++) {
                if (meerdereWaardesArray[i] == zoekWaardeInt) {
                    resultaatRepetitieInt++;
                }
            } */
            repaint();
        }
    }
}
