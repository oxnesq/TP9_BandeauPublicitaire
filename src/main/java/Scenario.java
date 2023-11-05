import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;

public class Scenario {
    private ArrayList<Effet> lesEffets = new ArrayList<>();
    private Bandeau monBandeau;

    public Scenario(ArrayList<Effet> lesEffets, Bandeau monBandeau) {
        this.lesEffets = lesEffets;
        this.monBandeau=monBandeau;
    }

    public void actionnerLesEffets(){
        for (Effet ef : lesEffets){
            ef.actionner(monBandeau);
        }
        monBandeau.setMessage("Terminé");
        monBandeau.sleep(3000);
        monBandeau.close();
    }

    public  void addEffet(Effet e){
        lesEffets.add(e);
    }

}
