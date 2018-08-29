package objets;

import vaisseau.Vaisseau;

public class Scie extends Objet{

    public Scie () {

        this.nom = ("une Scie");
        //this.ajoutGaz = 5;
        this.ajoutVie = 20;

    }

    public void utiliser (Vaisseau v){ super.utiliser(v); }


}

