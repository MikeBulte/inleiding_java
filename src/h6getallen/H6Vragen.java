package h6getallen;

/**
 * Created by Mike on 9/18/2016 at 4:47 PM.
 */


/**
 * Ik weet eerlijk gezegt niet of deze vragen op de hoofdstukken ook ingeleverd moeten worden,
 * dus ik maak ze voor de zekerheid.
 */


/**
 * * 1. Waarom is initialiseren van vragen noodzakelijk?
 *
 * Initialiseren is noodzakelijk want als een variabel geen waarde heeft gekregen dan zal het de waarde van 0 krijgen.
 *
 * 2. Waarom is Typecasting noodzakelijk bij de conversie van een double naar een int?
 *
 * Als je een conversie van een double naar een int doet kan er vrij zeker informatie verloren gaan, de compiler ziet dit
 * en grijpt in door een error te maken. Als je toch hiermee wilt doorgaan kan je typecasting gebruiken om aan te geven
 * dat je hiermee alsnog wilt doorgaan.
 *
 * 3. Wat is de uitvoer van dit programma? (Zie hieronder voor het programma)
 *
 * De uitkomst van dit programma is (8 + 8) / 3, oftewel 16 / 3. Dit is 5.3333333 waarvoor een double nodig is om alle
 * cijfers na de nul erin te houden.
 *
 * 4/5. Wat is nu de uitvoer van dit programma?
 *
 * De uitkomst van dit programma is nu 8 + 8 / 3, dus eerst deelt het programma 8 / 3, wat 2 wordt omdat de int geen
 * komma's accepteert en daarna doet het de 8 erbij waardoor het 10 wordt.
 */


//Voorbeeld 6.4

import java.applet.Applet;
import java.awt.*;


public class H6Vragen extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = 3;
        //uitkomst = ( a + b / c);
        uitkomst = a + b / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}

