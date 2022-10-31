package personnages;

public class Ronain extends Humain{
	private int honneur;
	
	public Ronain(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	
	public void don(Commercant c) {
		c.setArgent(c.argent + (getArgent()*10)/100);
		parler(c.getNom() + ", prend ces " + (getArgent()*10)/100 + " sous");
		c.recevoirArgent((getArgent()*10)/100);
	}

	
	

	public static void main(String[] args) {
		Commercant c1 = new Commercant("Marco", "undefined", 15);
		Ronain ron = new Ronain("Roro", "shoshu", 60);
		
		ron.don(c1);

	}

}
