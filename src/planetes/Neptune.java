package planetes;

import objets.*;
import vaisseau.Vaisseau;

public class Neptune extends Planete {

    public Neptune() {
        this.nom = "Neptune";
        this.consommation = 15;
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Lunettes());
        objetsDispo.add(new Scie());
        objetsDispo.add(new Scie());
        objetsDispo.add(new Scie());
        objetsDispo.add(new Scie());
        objetsDispo.add(new Scie());
    }

    public void explorer(Vaisseau v, Vaisseau undo){
        super.explorer(v, undo);
/*
        int nb = (int) (Math.random()*9);
        System.out.println("Vous découvrez " + objetsDispo.get(nb).getNom());

        if (nb<5){ v.inventaire.add(new Lunettes()); }
        else { v.inventaire.add(new Scie());}

        /*
        try {
            if (this.objetsDispo.get(nb).getNom().equals("des Lunettes")){ v.inventaire.add(new Lunettes()); }
            else if (this.objetsDispo.get(nb).getNom().equals("une Scie")){ v.inventaire.add(new Scie()); }
        }catch (NullPointerException e){
            System.out.println("Exception lancée");
        }



        objetsDispo.remove(nb);*/
    }

}
