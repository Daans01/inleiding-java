package h02;

import java.awt.*;
import java.applet.*;

public class h022 extends Applet {


    public void init() {
        setBackground(Color.white);

    }


    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Daan", 50, 60 );
        g.setColor(Color.red);
        g.drawString("van der Sman", 50, 70 );

    }


}