package h011;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        for (teller = 20; teller > 9; teller--) {
            y += 20;

            g.drawString("" + teller, 30, y);
        }

    }
}
