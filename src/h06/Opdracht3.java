package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    int bedrag2, bedrag;
    double uitkomst;

    public void init() {
        bedrag2 = 2147483646;
        bedrag = 2;
        uitkomst = bedrag + bedrag2;

    }

    @Override
    public void paint(Graphics g) {

        g.drawString("het negatieve getal is:  " + uitkomst, 20, 20);

    }




}
