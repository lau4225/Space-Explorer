package vaisseau;

import objets.Objet;
import planetes.Planete;

import java.util.ArrayList;
import java.util.Stack;

public class Vaisseau {

    public int carburant;
    public int vie;
    public ArrayList<Objet> inventaire = new ArrayList<Objet>();
    public Stack<String> trajet = new Stack<String>();
    public boolean attaque;



    public Vaisseau(int carburant, int vie) {
        this.carburant = carburant;
        this.vie = vie;
        trajet.push("Terre");
        this.attaque = false;
    }
    public boolean isAttaque() {
        return attaque;
    }

    public void setAttaque(boolean attaque) {
        this.attaque = attaque;
    }
    public int getCarburant() {
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public ArrayList<Objet> getInventaire() {
        return inventaire;
    }

    public void setInventaire(ArrayList<Objet> inventaire) {
        this.inventaire = inventaire;
    }

    public Stack<String> getTrajet() {
        return trajet;
    }

    public void setTrajet(Stack<String> trajet) {
        this.trajet = trajet;
    }


    public void afficherEtat(){
        System.out.println();
        System.out.println("État du vaisseau : ");
        System.out.println("   Planète courante : " + this.trajet.peek());                                             // tab.peak
        System.out.println("   Quantité carburant : " + this.carburant);
        System.out.println("   Points de vie : " + this.vie);
        System.out.println("   Inventaire : ");

        try {
            for(int i = 0; i<inventaire.size(); i++){
                System.out.println("               " + (i+1) + ". " + inventaire.get(i).getNom());
            }
        }catch (NullPointerException e){
            System.out.println("               L'inventaire est vide");
        }


       /*
       System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        */

    }





}
