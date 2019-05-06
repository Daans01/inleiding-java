package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {




        g.drawString("0",50,535);

        g.drawString("20",50,435);

        g.drawString("40",50,335);

        g.drawString("60",50,235);

        g.drawString("80",50,135);

        g.drawString("100",50,35);

        g.drawString("Hans",410,550);

        g.drawString("Jeroen",280,550);

        g.drawString("Valerie",150,550);

        g.setColor(Color.green);
        g.fillRect(360, 130,130 , 400);

        g.setColor(Color.blue);
        g.fillRect(230, 30,130 , 500);

        g.setColor(Color.red);
        g.fillRect(100, 230,130 , 300);

//        g.setColor(Color.black);
//        g.drawLine(390, 130, 490, 130);
//
//        g.setColor(Color.black);
//        g.drawLine(490, 130, 490, 430);
//
//        g.setColor(Color.black);
//        g.drawLine(390, 430, 390, 130);
//
//        g.setColor(Color.black);
//        g.drawLine(360, 30, 260, 30);
//
//        g.setColor(Color.black);
//        g.drawLine(360, 30, 360, 430);
//
//        g.setColor(Color.black);
//        g.drawLine(260, 430, 260, 30);
//
//        g.setColor(Color.black);
//        g.drawLine(230, 230, 130, 230);
//
//        g.setColor(Color.black);
//        g.drawLine(230, 430, 230, 230);
//
//        g.setColor(Color.black);
//        g.drawLine(130, 430, 130, 230);
//
//        g.setColor(Color.black);
//        g.drawLine(100, 430, 100, 450);
//
        g.setColor(Color.black);
        g.drawLine(100, 530, 490, 530);

        g.setColor(Color.black);
        g.drawLine(100, 430, 80, 430);

        g.setColor(Color.black);
        g.drawLine(100, 530, 80, 530);

        g.setColor(Color.black);
        g.drawLine(100, 530, 80, 530);

        g.setColor(Color.black);
        g.drawLine(100, 330, 80, 330);

        g.setColor(Color.black);
        g.drawLine(100, 230, 80, 230);

        g.setColor(Color.black);
        g.drawLine(100, 130, 80,130);

        g.setColor(Color.black);
        g.drawLine(100, 30, 80, 30);

        g.setColor(Color.black);
        g.drawLine(100, 30, 100, 530);


    }

}