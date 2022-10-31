package personnages;

import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.setBoisson("the");
	
	}
	
	public void seFaireExtorquer() {
		this.setArgent(0);
		this.parler("J'ai tout perdu, le monde est trop injuste");
	}
	
	public void recevoirArgent(int i ) {
		this.setArgent(i);
		this.parler(i + " sous ! Je te remercie, genereux donateur !");
	}
		
	}


