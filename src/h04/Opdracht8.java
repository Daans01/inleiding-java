package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet {

    @Override
    public void paint(Graphics g) {



        g.drawString("Taartpunt met ovaal eromheen", 840, 240);
        g.drawString("Cirkel", 890, 425);
        g.drawArc(830,255, 150, 150, 200, 360);

        g.drawString("Gevulde ovaal", 525, 425);
        g.drawString("Gevulde rechthoek met ovaal", 475, 235);


        g.drawString("Afgeronde rechthoek", 145, 430);
        g.drawRoundRect(50,260,300,150,30,30);

        g.drawString("Rechthoek", 175, 240);
        g.drawLine(50,220,350,220);
        g.drawLine(350,70,350,220);
        g.drawLine(50,70,50,220);
        g.drawLine(50,70,350,70);


        g.drawString("Lijn", 185, 50);
        g.drawLine(50,30,350,30);


        g.setColor(Color.magenta);
        g.fillArc(400, 250, 320, 150, 200, 360);

        g.setColor(Color.magenta);
        g.fillRect(400, 70, 320, 150);

        g.setColor(Color.black);
        g.drawArc(400, 70, 320, 150, 200, 360);

        g.setColor(Color.black);
        g.drawArc(750, 70, 320, 150, 200, 360);
        g.setColor(Color.magenta);
        g.fillArc(750, 70, 320, 150, 0, 45);

    }

}   