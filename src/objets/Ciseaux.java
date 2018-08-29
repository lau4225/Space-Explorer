package objets;

import vaisseau.Vaisseau;

public class Ciseaux extends Objet {

    public Ciseaux(){
        this.nom = "des Ciseaux";
        //this.ajoutGaz = 9;
        this.ajoutVie = 27;
    }

    public void utiliser (Vaisseau v){ super.utiliser(v); }

}
