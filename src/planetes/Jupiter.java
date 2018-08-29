package planetes;

import objets.*;
import vaisseau.Vaisseau;

public class Jupiter extends Planete {

    public Jupiter() {
        this.nom = "Jupiter";
        this.consommation = 12;
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Gants());
        objetsDispo.add(new Gants());
        objetsDispo.add(new Gants());
        objetsDispo.add(new Gants());
        objetsDispo.add(new Gants());
    }

    public void explorer(Vaisseau v, Vaisseau undo){

        super.explorer(v, undo);
/*
        int nb = (int) (Math.random()*9);
        System.out.println("Vous découvrez " + objetsDispo.get(nb).getNom());

        if (nb<5){ v.inventaire.add(new Lunettes()); }
        else { v.inventaire.add(new Gants());}


          try {
            if (this.objetsDispo.get(nb).getNom().equals("une paire de Gants")){ v.inventaire.add(new Gants()); }
            else if (this.objetsDispo.get(nb).getNom().equals("des Lunettes")){ v.inventaire.add(new Lunettes()); }
        }catch (NullPointerException e){
            System.out.println("Exception lancée");
        }



        objetsDispo.remove(nb);*/

    }

}
