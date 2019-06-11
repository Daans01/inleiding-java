package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    int minuten, uren, dagen, uitkomst, uitkomst2, uitkomst3;


    public void init() {
        minuten = 60;
        uren = 3600;
        dagen = 86400;
        uitkomst = minuten * 60;
        uitkomst2 = uren * 24;
        uitkomst3 = dagen * 365;

    }

    @Override
    public void paint(Graphics g) {

        g.drawString("De uitkomst van hoeveel seconden in een uur: " + uitkomst, 20, 20);
        g.drawString("De uitkomst van hoeveel seconden in een dag: " + uitkomst2, 20, 30);
        g.drawString("De uitkomst van hoeveel seconden in een jaar:" + uitkomst3, 20, 40);

    }




}
