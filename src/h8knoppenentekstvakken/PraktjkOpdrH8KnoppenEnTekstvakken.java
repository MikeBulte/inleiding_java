package h8knoppenentekstvakken;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 9/28/2016.
 * Een simpele en nogal onpraktische rekenmachine maar het doet het, alle knoppen pakken tekstvak 1 en 2 en doen hun
 * respective ding daarna en laten het resultaat achter in het eerste tekstvak.
 */
public class PraktjkOpdrH8KnoppenEnTekstvakken extends Applet {

    private TextField input1;
    private TextField input2;

    private double number1;
    private double number2;

    public void init() {

        setSize(700, 300);

        input1 = new TextField("", 25);
        add(input1);

        input2 = new TextField("", 25);
        add(input2);

        Button multiplyButton = new Button("*");
        add(multiplyButton);
        multiplyButton.addActionListener(new multiplyButtonListener());

        Button devideButton = new Button("/");
        add(devideButton);
        devideButton.addActionListener(new devideButtonListener());

        Button plusButton = new Button("+");
        add(plusButton);
        plusButton.addActionListener(new plusButtonListener());

        Button minusButton = new Button("-");
        add(minusButton);
        minusButton.addActionListener(new minusButtonListener());

    }

    private class multiplyButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Double.parseDouble(input1.getText());
            number2 = Double.parseDouble(input2.getText());
            double result = (number1 * number2);
            input1.setText("" + result);
            input2.setText("");

        }
    }

    private class devideButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Double.parseDouble(input1.getText());
            number2 = Double.parseDouble(input2.getText());
            double result = (number1 / number2);
            input1.setText("" + result);
            input2.setText("");

        }
    }

    private class plusButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Double.parseDouble(input1.getText());
            number2 = Double.parseDouble(input2.getText());
            double result = (number1 + number2);
            input1.setText("" + result);
            input2.setText("");

        }
    }

    private class minusButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Double.parseDouble(input1.getText());
            number2 = Double.parseDouble(input2.getText());
            double result = (number1 - number2);
            input1.setText("" + result);
            input2.setText("");

        }
    }
}