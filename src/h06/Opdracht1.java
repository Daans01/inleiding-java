package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    int kinderen;
    double bedrag, uitkomst;

    public void init() {
        kinderen = 4;
        bedrag = 113;
        uitkomst = bedrag / kinderen;

    }

    @Override
    public void paint(Graphics g) {

        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Jan krijgt " + uitkomst, 20, 30);
        g.drawString("Ali krijgt €28", 20, 40);
        g.drawString("Jeannette krijgt €28", 20, 50);
        g.drawString("Ik krijgt €28", 20, 60);
    }




    }
