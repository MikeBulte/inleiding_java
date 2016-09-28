package h8knoppenentekstvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 9/28/2016.
 */
public class Opdr8UitbreidingStaafDiagram extends Applet {


    //Voor iedere 10 KG haal je 25 van het totaal getal AF.
    int nulKG = 350;
    int twintigKG = 300;
    int veertigKG = 250;
    int zestigKG = 200;
    int tachigKG = 150;
    int honderdKG = 100;


    @Override
    public void init() {
        super.init();

        setSize(700, 400);

        Label jeroenLabel = new Label("Jeroen");
        add(jeroenLabel);
        TextField jeroenTextField = new TextField("" + veertigKG);
        add(jeroenTextField);
        jeroenTextField.addActionListener(new jeroenTextFieldListener());

        Label valerieLabel = new Label("Valerie");
        add(valerieLabel);
        TextField valerieTextField = new TextField("" + veertigKG);
        add(valerieTextField);
        valerieTextField.addActionListener(new valerieTextFieldListener());

        Label hansLabel = new Label("Hans");
        add(hansLabel);
        TextField hansTextField = new TextField("" + veertigKG);
        add(hansTextField);
        hansTextField.addActionListener(new hansTextFieldListener());

        Button waardesButton = new Button("Wijzig Waardes");
        add(waardesButton);
        waardesButton.addActionListener(new waardesButtonListener());

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);



        //diagram opbouw
        g.setColor(Color.black);
        g.drawLine(200, 100, 200, 350);
        g.drawLine(200, 350, 500, 350);

        //diagram namen
        g.drawString("Valerie", 225, 370);
        g.drawString("Jeroen", 285, 370);
        g.drawString("Hans", 345, 370);

        //diagram kg cijfers
        g.drawString("100 KG", 150, 100);
        g.drawString("80 KG", 150, 150);
        g.drawString("60 KG", 150, 200);
        g.drawString("40 KG", 150, 250);
        g.drawString("20 KG", 150, 300);
        g.drawString("0 KG", 150, 350);

        //diagram grijze lijnen
        g.setColor(Color.lightGray);
        g.drawLine(200, 100, 500, 100);
        g.drawLine(200, 150, 500, 150);
        g.drawLine(200, 200, 500, 200);
        g.drawLine(200, 250, 500, 250);
        g.drawLine(200, 300, 500, 300);
    }


    private class jeroenTextFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class valerieTextFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class hansTextFieldListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class waardesButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}


