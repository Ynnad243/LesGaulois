package personnages;

import java.util.*;

public class Druide {
	private static String nom;
	private static int effetPotionMin;
	private static int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		intro("Bonjour, je suis le Druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + "à" + effetPotionMax + ".");
	}
	
	public static int preparerPotion() {
		Random i = new Random();
		return i.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		
	}
	
	public void intro(String texte) {
		System.out.println(texte);
		
	}

	public String getNom() {
		return nom;
	}

	public static void parler(int i) {
		if (i>=7) {
			System.out.println(prendreParole() + "J'ai préparé une super potion de force " + i);
			
		} else {
			System.out.println(prendreParole() + "Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + i);

		}
		
		
	}
	
	private static String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Druide pano = new Druide("Panoramix", 5, 10);
		int potion = preparerPotion();
		parler(potion);
		
	}

}
