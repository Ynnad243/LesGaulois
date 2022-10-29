package histoire;


import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obl = new Gaulois("Obelix", 5);
		Romain minus = new Romain("Minus", 6);
		int effetPotionMin = 5;
		int effetPotiionMax = 10;
		Druide pano = new Druide("Panoramix", effetPotionMin, effetPotiionMax);
		
		
		
		
		pano.intro("Je vais aller prepare une petite potion ...");
		pano.preparerPotion();
		pano.booster(obl);
		obl.parler("Par Benelos, ce n'est pas juste ! ");
		asterix.boirePotion(6);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

		
	}

}
