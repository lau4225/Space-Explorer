package objets;

import vaisseau.Vaisseau;

public class Drill extends Objet {

    public Drill(){
        this.nom = "une Drill";
        //this.ajoutGaz = 8;
        this.ajoutVie = 23;
    }

    public void utiliser (Vaisseau v){ super.utiliser(v); }

}
