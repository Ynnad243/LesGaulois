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
        intro("Bonjour, je suis le Druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ".");
    }

    public int preparerPotion() {
        Random i = new Random();
        return i.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;

    }

    public void intro(String texte) {
        System.out.println(prendreParole() + "<<" + texte + ">>");

    }

    public String getNom() {
        return nom;
    }

    public void parler(int i) {
        if (i>=7) {
            System.out.println(prendreParole() + "J'ai préparé une super potion de force " + i);

        } else {
            System.out.println(prendreParole() + "Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + i);

        }


    }

    private String prendreParole() {
        return "Le druide " + nom + " : ";
    }

    public void booster(Gaulois gaul) {
        if (gaul.getNom()== "Obelix") {
            System.out.println(prendreParole()  + "Non Obelix !... Tu n'auras pas de potion magique !");

        } else {
            gaul.boirePotion(forcePotion);
        }



    }

    public static void main(String[] args) {
        Druide pano = new Druide("Panoramix", 5, 10);
        int potion = pano.preparerPotion();
        pano.parler(potion);

    }

}
