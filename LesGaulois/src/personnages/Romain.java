package personnages;

public class Romain {
    private  String nom;
    private int force;
    private String texte;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement=0;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public  String getNom() {
        return nom;
    }
    
    

    public int getForce() {
		return force;
	}

	public void parler(String texte) {
        System.out.println(prendreParole() + "<<" + texte + ">>");

    }

    private String prendreParole() {
        return "Le romain " + nom + " : "; 
    }

//    public void recevoirCoup(int forceCoup) {
//        force -= forceCoup;
//        if (force>0) {
//            parler("Aie");
//        } else {
//            parler("Jabandonne ...");
//        }
//
//        }
//    
    
    public Equipement[] recevoirCoup(int forceCoup) {
    	Equipement[] equipementEjecte = null;
    	// précondition
    	assert force > 0;
    	int oldForce = force;
    	forceCoup = CalculResistanceEquipement(forceCoup);
    	force -= forceCoup;
    	
    	// if (force > 0) {
    	// parler("Aïe");
    	// } else {
    	// equipementEjecte = ejecterEquipement();
    	// parler("J'abandonne...");
    	// }
    	
    	
    	switch (force) {
    	case 0:
    	parler("Aïe");
    	
    	default:
    		equipementEjecte = ejecterEquipement();
    		parler("J'abandonne...");
    		break;
    		}
    		// post condition la force a diminuée
    		assert force < oldForce;
    		return equipementEjecte;
    		}
    
    
    
    private int CalculResistanceEquipement(int forceCoup) {
    	texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
    	int resistanceEquipement = 0;
    	
    	if (!(nbEquipement == 0)) {
    		texte += "\nMais heureusement, grace a mon equipement sa force est diminue de ";
    	
    		for (int i = 0; i < nbEquipement;) {
    			if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) == true) {
    				resistanceEquipement += 8;
    	} 		else {
    				System.out.println("Equipement casque");
    				resistanceEquipement += 5;
    	}
    			i++;
    	}
    		texte += resistanceEquipement + "!";
    	}
    	parler(texte);
    	forceCoup -= resistanceEquipement;
    	return forceCoup;
    	}
    
    
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'equipement de " + nom.toString() + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		
		for (int i = 0; i < nbEquipement; i++) {
			
			if (equipements[i] == null) {
				continue;
				} else {
					equipementEjecte[nbEquipementEjecte] = equipements[i];
					nbEquipementEjecte++;
					equipements[i] = null;
					}
				}
		return equipementEjecte;
				}
		
	
    	
    	
    public void sEquiper(Equipement eq) {
    	
    	switch(nbEquipement) {
    	
	    	case 2 : System.out.println("Le soldat " + getNom() + " est deja bien protege");
	    	break;
	    	
	    	case 1 :
	    		if(eq == equipements[0]) {
	    			System.out.println("Le soldat " + getNom()  + " possede deja un " + eq);
	    		}
	    		else {
	    			equipements[1] = eq;
	    			this.nbEquipement++;
	    			System.out.println("Le soldat " + getNom() + " s'equipe avec un " + eq);
	    		}
	    	break;
	    	
	    	case 0 :
	    		System.out.println("Le soldat " + getNom() + " s'equipe avec un " + eq);
	    		this.equipements[0] = eq;
	    		this.nbEquipement++;
	    	break;
    	}
    	
		
	}
    
    public static void main(String[] args) {
    	Equipement one = Equipement.CASQUE;
    	Equipement two = Equipement.BOUCLIER;
    	Romain roman = new Romain("Minus", 5);
		
		roman.sEquiper(one);
		roman.sEquiper(one);
		roman.sEquiper(two);
		roman.sEquiper(one);
		}
    
    
    
    
	}




