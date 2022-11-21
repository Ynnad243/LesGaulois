package personnages;
//
//public class Musee {
//	
//	private Equipement[] trophee = new Equipement[200];
//	private int nbTrophee;
//	
//	public void donnerTrophees(Gaulois gaulois, Equipement equip) {
//		trophee[nbTrophee] = equip;
//		nbTrophee++;
//	}
//	
//	public String extraireInstructionsCaml() {
//		String texte = "let musee = [\n";
//		for (int i = 0; i < nbTrophees; i++) {
//			String nom = trophees[i].donnerNom();
//			Equipement equipement = trophees[i].getEquipement();
//			if (nbTrophees - 1 != i) {
//				texte += "\"" + nom + "\"," + "\"" + equipement + "\";\n";
//			} else {
//				texte += "\"" + nom + "\"," + "\"" + equipement + "\"\n";
//			}
//		}
//		texte += "]";
//		return texte;
//	}
//
//
//
//}


public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophees = 0;
	

	public Musee(Trophee[] trophees, int nbTrophees) {
		super();
		this.trophees = trophees;
		this.nbTrophees = nbTrophees;
	}

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {

		this.trophees[nbTrophees] = new Trophee(gaulois, equipement);
		nbTrophees += 1;
	}

	public String extraireInstructionsCaml() {
		String texte = "let musee = [\n";
		for (int i = 0; i < nbTrophees; i++) {
			String nom = trophees[i].donnerNom();
			Equipement equipement = trophees[i].getEquipement();
			if (nbTrophees - 1 != i) {
				texte += "\"" + nom + "\"," + "\"" + equipement + "\";\n";
			} else {
				texte += "\"" + nom + "\"," + "\"" + equipement + "\"\n";
			}
		}
		texte += "]";
		return texte;
	}
	
}


