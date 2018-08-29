package planetes;

import objets.*;
import vaisseau.Vaisseau;

import java.util.ArrayList;

public class Terre extends Planete {

    public Terre() {
        this.nom = "Terre";
        this.consommation = 5;
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
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

        if (nb<5){ v.inventaire.add(new Ciseaux()); }
        else {
            v.inventaire.add(new Scie());
        }

        /*
 try {
            if (this.objetsDispo.get(nb).getNom().equals("des Ciseaux")){ v.inventaire.add(new Ciseaux()); }
            else if (this.objetsDispo.get(nb).getNom().equals("une Scie")){ v.inventaire.add(new Scie()); }
        }catch (NullPointerException e){
            System.out.println("Exception lancée");
        }



        objetsDispo.remove(nb);*/
    }


}
