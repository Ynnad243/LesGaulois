package personnages;

public class Village {
	private String nom;
	private Chef chef;
	Gaulois [] villageois;
	int nbVillageois = 0;
	
	
	
	public Village(String nom, int nbVillageoisMax) {
		super();
		this.nom = nom;
		Gaulois villageois[] = new Gaulois[nbVillageoisMax];
	}

	public Village(String nom) {
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaul, int nbVillageois) {
		villageois[nbVillageois] = gaul;
		nbVillageois += 1;
				
	}
	public Gaulois trouverHabitant(int i) {
		return villageois[i];
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles, 30");
		//Gaulois gaulois = village.trouverHabitant(30);
	}
	

}
