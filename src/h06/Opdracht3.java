package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    int bedrag2, bedrag, bedrag3, bedrag4;
    double uitkomst;


    public void init() {
        bedrag2 = 59;
        bedrag = 63;
        bedrag3 = 69;
        bedrag4 = 30;
        uitkomst = (bedrag + bedrag2 + bedrag3) / bedrag4;


    }

    @Override
    public void paint(Graphics g) {

        g.drawString("het negatieve getal is:  " + uitkomst, 20, 20);

    }




}
