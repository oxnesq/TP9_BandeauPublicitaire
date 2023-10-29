import bandeau.Bandeau;
import exemple.ExempleDUtilisation;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        ArrayList<Effet> lesEffets = new ArrayList<Effet>();
        Effet1 e1= new Effet1();
        Effet2 e2= new Effet2();
        Effet3 e3= new Effet3();
        Effet4 e4= new Effet4();
        lesEffets.add(e1);
        lesEffets.add(e2);
        lesEffets.add(e3);
        lesEffets.add(e4);


        Scenario scena = new Scenario(lesEffets, monBandeau);
        scena.actionnerLesEffets();

    }
}
