package h012;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    Button buttons[];

    public void init() {
        buttons = new Button[25];
        for (int teller = 0; teller < buttons.length; teller++) {
            buttons[teller] = new Button("" + teller);
            add(buttons[teller]);
        }

    }
}
