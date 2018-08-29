package planetes;

import objets.*;
import vaisseau.Vaisseau;

public class Venus extends Planete {

    public Venus() {
        this.nom = "Vénus";
        this.consommation = 10;
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
        objetsDispo.add(new Drill());
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

        if (nb<5){ v.inventaire.add(new Drill()); }
        else { v.inventaire.add(new Gants());}
        /*
try {
            if (this.objetsDispo.get(nb).getNom().equals("une Drill")){ v.inventaire.add(new Drill()); }
            else if (this.objetsDispo.get(nb).getNom().equals("une paire de Gants")){ v.inventaire.add(new Gants()); }

        }catch (NullPointerException e){
            System.out.println("Exception lancée");
        }



        objetsDispo.remove(nb);*/
    }

}
