package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Opdracht2 extends Applet {
    int Man, Vrouw, Potentieleman, Potentielevrouw, Totaal;
    Button man, vrouw, man2, vrouw2;
    TextField tekstvak;
    String s;


    public void init() {
        Man = 0;
        Vrouw = 0;
        Potentieleman = 0;
        Potentielevrouw = 0;
        Totaal = 0;


        man = new Button("man");
        manListener ml = new manListener();
        man.addActionListener( ml );
        add (man);

        vrouw = new Button("vrouw");
        vrouwListener vl = new vrouwListener();
        vrouw.addActionListener( vl );
        add (vrouw);

        man2 = new Button("potentieleman");
        man2Listener m2l = new man2Listener();
        man2.addActionListener( m2l );
        add (man2);

        vrouw2 = new Button("potentielevrouw");
        vrouw2Listener v21 = new vrouw2Listener();
        vrouw2.addActionListener( v21 );
        add (vrouw2);


    }


    public void paint (Graphics g){
        g.drawString("Aantal mannen:"+ Man, 20, 50);
        g.drawString("Aantal vrouwen:"+ Vrouw, 20, 80);
        g.drawString("Aantal potentiele vrouwen:"+ Potentielevrouw, 20, 140);
        g.drawString("Aantal potentiele mannen:"+ Potentieleman, 20, 110);
        Totaal = Man + Vrouw + Potentielevrouw + Potentieleman;
        g.drawString("Tottal aantal mensen aanwzig:" + Totaal, 20, 170);
    }


    class manListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Man++ ;
            repaint();
        }
    }

    class vrouwListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Vrouw++ ;
            repaint();
        }
    }

    class man2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Potentieleman++ ;
            repaint();
        }
    }

    class vrouw2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Potentielevrouw++ ;
            repaint();
        }
    }

}