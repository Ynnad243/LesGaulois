package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
	private int nbVillageois;
	
	
	public Village(String nom, int nbVillageoisMax) {
		super();
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public Village(String nom) {
		this.nom = nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	

	public Chef getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaul, int nbVillageois) {
		villageois[nbVillageois] = gaul;
		this.nbVillageois++;
				
	}
	public Gaulois trouverHabitant(int i) {
		return villageois[i];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + ", vivent les legendaires gaulois : "  );
		
		for(int i=0; i < nbVillageois; i++) {
			System.out.println(" - " + villageois[i].getNom());
		}
		}
		

	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//On obtient cette exception car il n'existe pas de 30e element...
		
		Chef ab = new Chef("Abraracourix", 6, 1);
		village.setChef(ab);
		Gaulois as = new Gaulois("Asterix", 8);
		Gaulois ob = new Gaulois("Obelix", 25);
		
		village.ajouterHabitant(as, village.nbVillageois);
		village.ajouterHabitant(ob, village.nbVillageois);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		//La valeur retournée est "null" car il n'y a pas d'élément d'indoice 1 dans le tableau.
		
		village.afficherVillageois();
		
		
		
	}
	

	

}
