package personnages;

public class Gaulois {
    private  String nom;
    private  int force, effetPotion = 1;
    private int nb_trophees;
    private Equipement[] trophees = new Equipement[100];

    public Gaulois(String nom, int force) {
        super();
        this.nom = nom;
        this.force = force;

    }

    public String getNom() {
        return nom;
    }





    public void parler(String texte) {
        System.out.println(prendreParole() + "<<" + texte + ">>");

    }

//    private  String prendreParole() {
//        return "Le gaulois " + nom + " : "; 
//    }
    
    private String prendreParole() {
    	return "Le gaulois " + nom + " : ";
    	}

//    public void frapper(Romain romain) {
//        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom() );
//        romain.recevoirCoup(force/3*effetPotion);
//
//    }
    
    public void frapper(Romain romain) {
    	System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
    	Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
    	
    	for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
    		this.trophees[nb_trophees] = trophees[i];
    	}
   
    	}
    
    

    public void boirePotion(int effetPotion) { 
    	
    	this.effetPotion = effetPotion;
        System.out.println(prendreParole() + "Merci Druide, je sens que ma force est " + effetPotion + " fois dupliquee.");
    }


//    @Override
//    public String toString() {
//        return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//    }
    
    
    public void faireUneDonation(Musee musee) {
    	
		if(!(trophees[0]== null)) {
			for(int i = 0; i < this.nb_trophees; i++) {
				musee.donnerTrophees(this, this.trophees[i]);
				this.nb_trophees++;
				System.out.println("- " + this.trophees[i]);
			}
		}
	}

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Asterix", 8);
        
        asterix.trophees[0] = Equipement.BOUCLIER;
        asterix.trophees[1] = Equipement.BOUCLIER;
        asterix.trophees[2] = Equipement.BOUCLIER;
//        
//        Musee musee = new Musee();
//        asterix.faireUneDonation(musee);
    	


    }



}


