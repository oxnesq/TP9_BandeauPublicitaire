import bandeau.Bandeau;

import java.awt.*;

public class Effet3 extends Effet{
    @Override
    public void actionner(Bandeau monBandeau) {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Effet3");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Arial",Font.BOLD,i+5));
            monBandeau.sleep(100);
        }
    }
}
