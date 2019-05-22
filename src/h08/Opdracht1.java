package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    Button knop;
    Label label;
    TextField tekstvak;


    public void init(){

        tekstvak = new TextField ("tekst", 5);
        label = new Label ("typ iets");
        add(label);
        add(tekstvak);

        knop = new Button();
        knop.setLabel("ok");
        add(knop);


        knop = new Button();
        knop.setLabel("Reset");
        add(knop);


    }


    public void paint(Graphics g){

        g.drawString("Doet deze knop wel iets", 50, 60);
    }





}