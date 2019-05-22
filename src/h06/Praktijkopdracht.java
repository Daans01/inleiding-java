package h06;

import java.applet.*;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double cijfer1, cijfer2, cijfer3, cijfer4, cijfer5, cijfer6, cijfer7, uitkomst;




    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        cijfer4 = cijfer1 + cijfer2 + cijfer3;
        uitkomst = cijfer4 / 3;
        cijfer5 = uitkomst * 10;
        cijfer6 = (int) cijfer5;
        cijfer7 = cijfer6 / 10;

    }



    public void paint (Graphics g) {
        g.drawString("Het gemiddelde is:" + cijfer7, 20,100);
    }


}
