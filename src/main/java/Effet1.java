import bandeau.Bandeau;

import java.awt.*;
import java.util.Random;

public class Effet1 extends Effet{

    public Effet1() {
    }

    public void actionner(Bandeau monBandeau) {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Effet1");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setForeground(Color.WHITE);
            monBandeau.sleep(100);
            monBandeau.setForeground(Color.BLACK);
            monBandeau.sleep(100);
        }

    }
}
