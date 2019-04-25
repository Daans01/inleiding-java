package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    @Override
    public void init() {

    }
    @Override
    public void paint (Graphics g) {
//        g.drawLine(100,50,100,300);
//        g.drawLine(130,50,130,300);
//        g.drawLine(100,50,130,50);
//        g.drawLine(100,300,130,300);

//        g.drawLine(130,60,350,60);
//        g.drawLine(130,100,350,100);
//        g.drawLine(130,140,350,140);
//        g.drawLine(130,180,350,180);
//        g.drawLine(350,60,350,180);

        g.setColor(Color.red);
        g.fillRect(130, 60, 175, 60);

        g.setColor(Color.white);
        g.fillRect(130, 90, 175, 100);

        g.setColor(Color.blue);
        g.fillRect(130, 110, 175, 30);

        g.setColor(Color.black);
        g.fillRect(100, 50, 30, 200);





    }
}
