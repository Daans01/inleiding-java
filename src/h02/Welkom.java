package h02;

import java.awt.*;
import java.applet.*;

public class Welkom extends Applet {


    public void init() {
        setBackground(Color.blue);

    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Daan van der Sman", 50, 60 );
    }


}
