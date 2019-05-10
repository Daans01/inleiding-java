package challange;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht extends Applet {

    int y1;
    int y2;
    int y3;
    int y4;
    int y5;
    int y6;
    Button knop;
    String schermtekst;
    Label label;
    TextField tekstvak;

    public void init() {


        y1 =30;
        y2 =130;
        y3 =230;
        y4 =330;
        y5 =430;
        y6 =530;
        tekstvak = new TextField("60", 5);
        label = new Label("Valerie");
        add(label);
        add(tekstvak);

        tekstvak = new TextField("100", 5);
        label = new Label("Jeroen");
        add(label);
        add(tekstvak);

        tekstvak = new TextField("80", 5);
        label = new Label("Hans");
        add(label);
        add(tekstvak);

        knop = new Button();
        knop.setLabel( "Toon" );
        add(knop);
    }
    @Override
    public void paint(Graphics g) {




        g.drawString("0", 50, 535);

        g.drawString("20", 50, 435);

        g.drawString("40", 50, 335);

        g.drawString("60", 50, 235);

        g.drawString("80", 50, 135);

        g.drawString("100", 50, 35);

        g.drawString("Hans", 390, 550);

        g.drawString("Jeroen", 260, 550);

        g.drawString("Valerie", 130, 550);

        g.setColor(Color.red);
        g.fillRect(360, y2, 100, 400);

        g.setColor(Color.red);
        g.fillRect(230, y1, 100, 500);

        g.setColor(Color.red);
        g.fillRect(100, y3, 100, 300);

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

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "Ja, deze knop doet wel iets";
            repaint();
        }
    }
}

