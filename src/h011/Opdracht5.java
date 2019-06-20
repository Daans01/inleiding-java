package h011;

import java.applet.Applet;
import java.awt.*;


public class Opdracht5 extends Applet{

    public void init() {

    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;

        for (int i = 0; i < 5; i++) {

            g.drawRect(x, y, 20, 20);

            x += 20;
            y += 20;
        }

    }
}
