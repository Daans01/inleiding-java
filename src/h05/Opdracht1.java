package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    Color achtergrond;
    Color lijnen;
    int y;
    int x;

public void init () {
    achtergrond = Color.magenta;
    lijnen = Color.black;
    y = 150;
    x = 200;

}


    @Override
    public void paint(Graphics g) {

        g.drawString("Taartpunt met ovaal eromheen", 840, 240);
        g.drawString("Cirkel", 890, 425);
        g.drawArc(830,255, x, y, 200, 360);

        g.drawString("Gevulde ovaal", 525, 425);
        g.drawString("Gevulde rechthoek met ovaal", 475, 235);


        g.drawString("Afgeronde rechthoek", 145, 430);
        g.drawRoundRect(50,260,x,y,30,30);

        g.drawString("Rechthoek", 175, 240);
        g.drawLine(50,220,350,220);
        g.drawLine(350,70,350,220);
        g.drawLine(50,70,50,220);
        g.drawLine(50,70,350,70);


        g.drawString("Lijn", 185, 50);
        g.drawLine(50,30,350,30);


        g.setColor(achtergrond);
        g.fillArc(400, 250, x, y, 200, 360);

        g.setColor(achtergrond);
        g.fillRect(400, 70, x, y);

        g.setColor(lijnen);
        g.drawArc(400, 70, x, y, 200, 360);

        g.setColor(lijnen);
        g.drawArc(750, 70, x, y, 200, 360);
        g.setColor(achtergrond);
        g.fillArc(750, 70, x, y, 0, 45);
    }
}