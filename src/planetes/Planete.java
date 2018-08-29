package planetes;

import objets.*;
import vaisseau.Main;
import vaisseau.Vaisseau;

import java.util.ArrayList;

public class Planete {


    protected String nom;
    protected int consommation;
    protected ArrayList<Objet> objetsDispo = new ArrayList<>();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getConsommation() {
        return consommation;
    }

    public void setConsommation(int consommation) {
        this.consommation = consommation;
    }

    public ArrayList<Objet> getObjetsDispo() {
        return objetsDispo;
    }

    public void setObjetsDispo(ArrayList<Objet> objetsDispo) {
        this.objetsDispo = objetsDispo;
    }

   public void attaque(Vaisseau v){

   }

    public void explorer(Vaisseau v, Vaisseau undo){
        System.out.println();
        System.out.println("Vous visitez la planète " + this.nom);


        int attaque = (int) (Math.random()*5);

        if (v.getCarburant()<this.consommation){
            System.out.println();
            System.out.println("Nostromo manque d'essence :( ");
            System.out.println();
            Main.gameOver = true;

        }
        else {
            System.out.println("Vous dépensez " + this.consommation + " litres d'essence");
            v.setCarburant(v.getCarburant()-this.consommation);
            undo.setCarburant(this.consommation);

            if (attaque == 3){
                System.out.println("Oh non! Votre vaisseau se fait attaquer par des pirates!");
                System.out.println("Vous perdez 25 points de vie!");
                undo.setAttaque(true);
                v.setVie(v.getVie()-25);
                if (v.getVie()<0){
                    v.setVie(0); }
            }

            int nb = (int) (Math.random()*objetsDispo.size());
            System.out.println("Vous découvrez " + objetsDispo.get(nb).getNom());

            try {
                if (this.objetsDispo.get(nb).getNom().equals("des Ciseaux")){ v.inventaire.add(new Ciseaux()); }
                else if (this.objetsDispo.get(nb).getNom().equals("une Drill")){ v.inventaire.add(new Drill()); }
                else if (this.objetsDispo.get(nb).getNom().equals("une paire de Gants")){ v.inventaire.add(new Gants()); }
                else if (this.objetsDispo.get(nb).getNom().equals("des Lunettes")){ v.inventaire.add(new Lunettes()); }
                else if (this.objetsDispo.get(nb).getNom().equals("une Scie")){ v.inventaire.add(new Scie()); }
            }catch (NullPointerException e){
                System.out.println("Exception lancée");
            }

            this.objetsDispo.remove(nb);
        }
    }





}
