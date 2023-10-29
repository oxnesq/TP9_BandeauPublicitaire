import bandeau.Bandeau;

import java.awt.*;

public class Effet4 extends Effet{
    @Override
    public void actionner(Bandeau monBandeau) {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Effet4");


    }
}
