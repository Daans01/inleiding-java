package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    int seconden, minuten, uren, dagen;
    double uitkomst, uitkomst2, uitkomst3;

    public void init() {
        seconden = 60;
        minuten = 60;
        uren = 24;
        dagen = 364;
        uitkomst = seconden * minuten;
        uitkomst2 = seconden * minuten * uren;
        uitkomst3 = seconden * minuten * uren * dagen;

    }

    @Override
    public void paint(Graphics g) {

        g.drawString("De uitkomst van hoeveel seconden in een uur: " + uitkomst, 20, 20);
        g.drawString("De uitkomst van hoeveel seconden in een dag: " + uitkomst2, 20, 30);
        g.drawString("De uitkomst van hoeveel seconden in een jaar:" + uitkomst3, 20, 40);

    }




}
