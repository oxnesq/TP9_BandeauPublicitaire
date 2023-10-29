import bandeau.Bandeau;

import java.awt.*;

public class Effet2 extends Effet{

    public Effet2() {
    }

    @Override
    public void actionner(Bandeau monBandeau) {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Effet2");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setRotation(Math.PI / 4.0f);
            monBandeau.sleep(100);
            monBandeau.setRotation(Math.PI *4.0f);
            monBandeau.sleep(100);
        }
        monBandeau.setRotation(Math.PI *2);
    }
}
