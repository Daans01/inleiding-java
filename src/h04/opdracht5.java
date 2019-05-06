package h04;

import java.awt.*;
import java.applet.*;

public class opdracht5 extends Applet {

    @Override
    public void paint(Graphics g) {




        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(100, 100, 250, 500, 90, 360);

    }

}