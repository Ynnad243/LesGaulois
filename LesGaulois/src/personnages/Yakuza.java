package personnages;

public class Yakuza extends Humain{
	
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	
	public void extorquer(Commercant c) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(c.getNom() + " si tu tiens a la vie, donne moi ta bourse !");
		argent += c.getArgent();
		parler("J'ai pique les " + c.getArgent() + " sous de " + c.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi Hi !");
		c.seFaireExtorquer();
		reputation += 1;
	}
	
	

	public int getReputation() {
		return reputation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
