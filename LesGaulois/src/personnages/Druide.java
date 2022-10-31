package personnages;

import java.util.*;
import personnages.Gaulois;

public class Druide {
    private String nom;
    private int effetPotionMin;
    private int effetPotionMax;
    private int forcePotion = 1;

    public Druide(String nom, int effetPotionMin, int effetPotionMax) {
        super();
        this.nom = nom;
        this.effetPotionMin = effetPotionMin;
        this.effetPotionMax = effetPotionMax;
        parler("Bonjour, je suis le Druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ".");
    }

    public int preparerPotion() {
        Random i = new Random();
        int forcePotion = i.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
        
        if (forcePotion>=7) {
            System.out.println(prendreParole() + "J'ai prepare une super potion de force " + forcePotion);

        } else {
            System.out.println(prendreParole() + "Je n'ai pas trouve tous les ingredients, ma potion est seulement de force " + forcePotion);

        }
        
        return forcePotion;

    }


    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
    	System.out.println(prendreParole() + "<<" + texte + ">>");

    }

    private String prendreParole() {
        return "Le druide " + nom + " : ";
    }

    public void booster(Gaulois gaul) {
        if (gaul.getNom().equals("Obelix")) {
            System.out.println(prendreParole()  + "Non Obelix !... Tu n'auras pas de potion magique !");

        } else {
            gaul.boirePotion(preparerPotion());
        }



    }

    public static void main(String[] args) {
        Druide pano = new Druide("Panoramix", 5, 10);
        int i = pano.preparerPotion();
        Gaulois as = new Gaulois("Ast", 5);
        as.boirePotion(i);

    }

}
