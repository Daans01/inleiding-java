package h011;

import java.applet.Applet;
import java.awt.*;


public class Opdracht7 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int width = 10;
        int height = 10;

        int x = 190;
        int y = 150;

        for (int i = 0; i < 100; i++) {

            g.drawOval(x, y, width, height);

            width += 10;
            height += 10;

            x -= 5;
            y -= 5;

        }
    }
}
