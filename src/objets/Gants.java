package objets;

import vaisseau.Vaisseau;

public class Gants extends Objet {

    public Gants(){
        this.nom = "une paire de Gants";
        //this.ajoutGaz = 7;
        this.ajoutVie = 30;
    }

    public void utiliser (Vaisseau v){ super.utiliser(v); }

}
