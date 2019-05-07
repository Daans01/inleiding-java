package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    @Override
    public void paint(Graphics g) {

        g.drawRoundRect(20,20,200,200,10,10);


        g.setColor(Color.black);
        g.fillArc(30, 30, 75, 75, 90, 360);

        g.setColor(Color.black);
        g.fillArc(130, 130, 75, 75, 90, 360);

        g.setColor(Color.black);
        g.fillArc(130, 30, 75, 75, 90, 360);

        g.setColor(Color.black);
        g.fillArc(30, 130, 75, 75, 90, 360);
    }

}