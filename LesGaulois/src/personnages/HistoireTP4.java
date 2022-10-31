package personnages;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		
		Commercant c1 = new Commercant("Marco", "undefined", 15);
//		c1.direBonjour();
//		c1.seFaireExtorquer();
//		c1.recevoirArgent(15);
//		c1.boire();
		
		
		Yakuza yak = new Yakuza("Yaku Le Noir", "Whysky", 30, "Warsong" );
		yak.direBonjour();
		yak.extorquer(c1);
	
	}

}
