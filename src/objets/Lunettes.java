package objets;

import vaisseau.Vaisseau;

public class Lunettes extends Objet {

    public Lunettes () {
        this.nom = "des Lunettes";
        //this.ajoutGaz = 6;
        this.ajoutVie = 25;
    }

    public void utiliser (Vaisseau v){ super.utiliser(v); }
}
