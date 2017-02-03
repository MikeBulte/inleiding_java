package h12tabellen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 2/3/2017.
 */
public class Opdr12PraktijkOpdrTabellen extends Applet {

    private int[] telefoonnummersIntArray;

    private String[] namenStringArray;

    private TextField namenTextField = new TextField("", 5);
    private TextField telefoonnummersTextField = new TextField("", 5);


    @Override
    public void init() {
        super.init();

        add(namenTextField);
        namenTextField.addActionListener(new NaamEnTelefoonActionListener());

        add(telefoonnummersTextField);
        telefoonnummersTextField.addActionListener(new NaamEnTelefoonActionListener());

        Button button = new Button("Ok");
        add(button);
        button.addActionListener(new NaamEnTelefoonActionListener());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);


    }

    private class NaamEnTelefoonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
