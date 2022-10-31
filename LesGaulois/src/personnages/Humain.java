package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	


	public String getNom() {
		return nom;
	}
	

	public String getBoisson() {
		return boisson;
	}


	public int getArgent() {
		return argent;
	}
	
	
	
    public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}


	public void parler(String texte) {
    	System.out.println(prendreParole() + texte);

    }

    private String prendreParole() {
        return "(" + nom + ")- ";
    }
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson());
	}
	
	public void boire() {
		System.out.println(prendreParole() + "Mmmm, un bon verre de " + getBoisson() + " GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		
	}
	
	public void gagnerArgent(int gain) {
		this.argent = gain;
	}
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}




	public static void main(String[] args) {
		Humain h1 = new Humain("Ali", "Orangina", 56);
		h1.perdreArgent(6);
		System.out.println(h1.argent);

	}

}
