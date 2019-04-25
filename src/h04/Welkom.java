package h04;

import java.awt.*;
import java.applet.*;

public class Welkom extends Applet {

    @Override
    public void init() {

    }
    @Override
    public void paint (Graphics g) {
        g.drawLine(250,150,250,300);
        g.drawLine(75,150,75,300);
        g.drawLine(75,150,250,150);
        g.drawLine(75,300,250,300);

        g.drawLine(75,150,160,60);
        g.drawLine(160,60,250,150);

        g.drawLine(100,180,100,220);
        g.drawLine(140,180,140,220);
        g.drawLine(100,180,140,180);
        g.drawLine(100,220,140,220);

        g.drawLine(150,300,150,240);
        g.drawLine(190,300,190,240);
        g.drawLine(150,240,190,240);


    }
}

