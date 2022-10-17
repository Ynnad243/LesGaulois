package personnages;

public class Gaulois {
	private static String nom;
	private int force;
	private static int effetPotion = 1;

	public Gaulois(String nom, int force, int effetPotion) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}

	public String getNom() {
		return nom;
	}
	
	
	
	public void setForce(int force) {
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	
	}
	
	private static String prendreParole() {
		return "Le gaulois " + nom + " : "; 
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom() );
		romain.recevoirCoup(force/3*effetPotion);
		
	}
	
	public static void boirePotion(int i) {
		effetPotion = i;
		if(i==3) {
			System.out.println(prendreParole() + "Merci Druide, je sens que ma force est 3 fois dupliquée.");
		}
		
	}


//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8, 1);
		System.out.println(asterix.nom);
		boirePotion(3);
		
	
	}
	
	

}


