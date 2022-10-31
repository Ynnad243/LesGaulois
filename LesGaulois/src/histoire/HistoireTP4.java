package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		
		Commercant c1 = new Commercant("Marco", "undefined", 0);
		c1.direBonjour();
		c1.seFaireExtorquer();
		c1.recevoirArgent(15);
		c1.boire();
	}

}
