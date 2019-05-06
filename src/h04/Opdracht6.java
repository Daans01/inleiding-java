package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    @Override
    public void paint(Graphics g) {





        g.setColor(Color.black);
        g.fillRect(130, 30,140 ,320);


        g.setColor(Color.green);
        g.fillArc(150, 230, 100, 100, 90, 360);

        g.setColor(Color.orange);
        g.fillArc(150, 130, 100, 100, 90, 360);
//
//        g.setColor(Color.black);
//        g.drawLine(130, 30, 130, 530);

        g.setColor(Color.red);
        g.fillArc(150, 30, 100, 100, 90, 360);

    }

}