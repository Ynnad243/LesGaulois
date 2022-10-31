package personnages;

public class Musee {
	
	private Equipement[] trophee = new Equipement[200];
	private int nbTrophee;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equip) {
		trophee[nbTrophee] = equip;
		nbTrophee++;
	}



}
