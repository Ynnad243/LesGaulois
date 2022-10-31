package histoire;

import personnages.Humain;

public class HistoireTP4 {
	 public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kambucha", 54);
		
		prof.direBonjour();
		prof.parler("J'ai 54 sous en poche. Je vais pouvoir m'offrir une boisson a 12 sous");
		prof.boire();
		prof.parler("J'ai 42 sous en poche. Je vais pouvoir m'offrir un jeu a 2 sous");
		prof.parler("Je n'ai plus que 40 sous en poche. Je ne peux même pas m'offrir un kimono a 50 sous.");
	}

}
