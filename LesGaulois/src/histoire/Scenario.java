package histoire;


import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8, 1);
		Romain minus = new Romain("Minus", 6);
		Druide pano = new Druide("Panoramix", 5, 10);
		
		
		int i = preparerPotion();
		pano.parler(i);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
