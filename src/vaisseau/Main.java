package vaisseau;

import planetes.*;

import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static Scanner sc = new Scanner(System.in);
    public static Planete[] tabPlanetes = new Planete[5];
    public static Vaisseau nostromo = new Vaisseau(100, 100);
    public static Vaisseau undo = new Vaisseau(0,0);
    public static boolean gameOver = false;

    public static void main(String[] args) {

        tabPlanetes[0] = new Terre();
        tabPlanetes[1] = new Jupiter();
        tabPlanetes[2] = new Mars();
        tabPlanetes[3] = new Neptune();
        tabPlanetes[4] = new Venus();


        int action = 0;

        System.out.println("Bienvenu dans Space Explorer!");

        while (gameOver == false){

            action = menu();
            switch (action){
                case 1 : nostromo.afficherEtat(); break;
                case 2 : explorerPlanete();break;
                case 3 : utiliserObjet();break;
                case 4 :
                    if (nostromo.trajet.size()==1){
                        System.out.println();
                        System.out.println("Impossible de revenir en arrière!");
                        System.out.println("Entrez une autre action!");
                    }else {
                        annuler();
                    }

                    break;

            }
        }

        Stack<String> finPartie = new Stack<>();
        for (String p: nostromo.trajet){
            finPartie.push(p);
        }

        System.out.println();
        System.out.println("FIN DE LA PARTIE");
        System.out.println();
        System.out.println("Trajet parcouru :");

        for (int i = 0; i< finPartie.size(); i++){
            if (i == (finPartie.size()-1))
            {
                System.out.print(finPartie.get(i));
            }
            else {
                System.out.print(finPartie.get(i) + " -> ");
            }
        }
    }

    public static int menu(){
        System.out.println();
        System.out.println();

        int reponse = 0;
        System.out.println("Que désirez-vous faire ? ");
        System.out.println("    1. Examiner le vaisseau");
        System.out.println("    2. Explorer une planète");
        System.out.println("    3. Utiliser un objet dans l'inventaire");
        System.out.println("    4. Revenir en arrière");
        System.out.print("Votre choix : "  );
        reponse = sc.nextInt();
        return reponse;
    }

    public static void explorerPlanete(){

        int nombre = (int) (Math.random()*4);
        nostromo.trajet.push(tabPlanetes[nombre].getNom());
        tabPlanetes[nombre].explorer(nostromo, undo);


    }

    public static void utiliserObjet(){

        System.out.println();

        int rep = 0;
        if (nostromo.inventaire.isEmpty()){
            System.out.println("Vous n'avez présentement aucun objet à utiliser");
        }
        else{
            System.out.println("Objets disponibles");
            for(int i = 0; i<nostromo.inventaire.size(); i++){
                System.out.println("     " + (i+1) + ". " + nostromo.inventaire.get(i).getNom());
            }
            System.out.print("Quel objet voulez-vous utiliser?   Entrez son numéro : ");
            rep = ((sc.nextInt())-1);
            nostromo.inventaire.get(rep).utiliser(nostromo);
            nostromo.inventaire.remove(rep);
            System.out.println();

        }


    }

    public static void annuler(){
        nostromo.setCarburant(nostromo.getCarburant()+undo.getCarburant());
        if (undo.attaque==true){
            nostromo.setVie(nostromo.getVie()+25);
            undo.setAttaque(false);
        }

        if (nostromo.inventaire.isEmpty()){

        }else {
            nostromo.inventaire.remove((nostromo.inventaire.size()-1));
        }

        nostromo.trajet.pop();
        System.out.println("Dernier voyage annulé");
        System.out.println("Retour sur la planète " + nostromo.trajet.peek());

    }

}
