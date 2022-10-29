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

    public void parler(String texte) {
        System.out.println(prendreParole() + "<<" + texte + ">>");

    }

    private String prendreParole() {
        return "Le romain " + nom + " : "; 
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force>0) {
            parler("Aie");
        } else {
            parler("Jabandonne ...");
        }

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




