package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet {

    @Override
    public void paint(Graphics g) {




        g.fillArc(400, 300, 350, 150, 200, 360);

        g.drawString("Afgeronde rechthoek", 145, 430);
        g.drawRoundRect(50,260,300,150,30,30);

        g.drawString("Rechthoek", 175, 240);
        g.drawLine(50,220,350,220);
        g.drawLine(350,70,350,220);
        g.drawLine(50,70,50,220);
        g.drawLine(50,70,350,70);


        g.drawString("Lijn", 185, 50);
        g.drawLine(50,30,350,30);
    }

}