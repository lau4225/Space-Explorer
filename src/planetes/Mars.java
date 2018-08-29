package planetes;

import objets.*;
import vaisseau.Vaisseau;

public class Mars extends Planete {

    public Mars() {
        this.nom = "Mars";
        this.consommation = 8;
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Ciseaux());
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
    }

    public void explorer(Vaisseau v, Vaisseau undo){
        super.explorer(v, undo);
/*
        int nb = (int) (Math.random()*9);
        System.out.println("Vous découvrez " + objetsDispo.get(nb).getNom());

        if (nb<5){ v.inventaire.add(new Ciseaux()); }
        else { v.inventaire.add(new Drill());}

        /*
        try {
            if (this.objetsDispo.get(nb).getNom().equals("des Ciseaux")){ v.inventaire.add(new Ciseaux()); }
            else if (this.objetsDispo.get(nb).getNom().equals("une Drill")){ v.inventaire.add(new Drill()); }
        }catch (NullPointerException e){
            System.out.println("Exception lancée");
        }



        objetsDispo.remove(nb);*/
    }

}
