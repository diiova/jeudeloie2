package giova.nni;

import java.util.Random;


public class App {
    
    public static void main(String[] args) {
        
        int caseObjectif = 20;
        int nbLancers = 5;
        Random generateur = new Random();

        boolean gagne = false;
        int compteursSimulations = 0;
    
        while (gagne) {
        compteursSimulations++;
        int caseCourant = 0;

        for (int i = 1; i <= nbLancers; i++) {
            int lancer = generateur.nextInt(6) + 1;
            caseCourant = caseCourant + lancer;
            System.out.println("Lancer dés : vous avez fait " +caseCourant);
    
        }
        if (caseCourant == caseObjectif) {
            System.out.println("Vous avez gagné !");
            System.out.println("il aura fallu "+ compteursSimulations + "simulations pour gagner");
            gagne = true;
            } else if (caseCourant > caseObjectif) {
            System.out.println("Vous dépassez, vous avez perdu !");
            } else {
            System.out.println("Il vous en manque pour arriver à " + caseObjectif + " !");
        }
    }
}
}
    