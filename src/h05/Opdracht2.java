package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    int y1;
    int y2;
    int y3;
    int y4;
    int y5;
    int y6;

    public void init() {


    y1 =30;
    y2 =130;
    y3 =230;
    y4 =330;
    y5 =430;
    y6 =530;
}
    @Override
    public void paint(Graphics g) {


        g.drawString("0", 50, 535);

        g.drawString("20", 50, 435);

        g.drawString("40", 50, 335);

        g.drawString("60", 50, 235);

        g.drawString("80", 50, 135);

        g.drawString("100", 50, 35);

        g.drawString("Hans", 410, 550);

        g.drawString("Jeroen", 280, 550);

        g.drawString("Valerie", 150, 550);

        g.setColor(Color.green);
        g.fillRect(360, y2, 130, 400);

        g.setColor(Color.blue);
        g.fillRect(230, y1, 130, 500);

        g.setColor(Color.red);
        g.fillRect(100, y3, 130, 300);

        g.setColor(Color.black);
        g.drawLine(100, 430, 100, 430);
        g.drawLine(100, 530, 490, 530);

        g.setColor(Color.black);
        g.drawLine(100, 430, 80, 430);

        g.setColor(Color.black);
        g.drawLine(100, 530, 80, 530);

        g.setColor(Color.black);
        g.drawLine(100, 530, 80, 530);

        g.setColor(Color.black);
        g.drawLine(100, 330, 80, 330);

        g.drawLine(100, 30, 80, 30);

        g.setColor(Color.black);
        g.drawLine(100, 30, 100, 430);
        g.drawLine(100, 30, 100, 530);


    }
}