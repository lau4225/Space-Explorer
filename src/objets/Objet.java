package objets;

import vaisseau.Vaisseau;

public class Objet {

    //protected int ajoutGaz;                          ENLEVER LES AJOUT GAZ
    protected int ajoutVie;
    protected String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /*
      public int getAjoutGaz() { return ajoutGaz; }

    public void setAjoutGaz(int ajoutGaz) { this.ajoutGaz = ajoutGaz; }
     */


    public int getAjoutVie() {
        return ajoutVie;
    }

    public void setAjoutVie(int ajoutVie) {
        this.ajoutVie = ajoutVie;
    }

    public void utiliser(Vaisseau v){

        System.out.println();
        System.out.println("Vous utilisez " + this.nom + " pour réparer votre vaissau");
                                                                                               //enlever objet a partir du main
        System.out.println("Votre vaisseau regagne " + this.ajoutVie + " points de vie");
        v.setVie(v.getVie() + this.ajoutVie);

    }


}
