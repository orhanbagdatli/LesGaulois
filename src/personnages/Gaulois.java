package personnages;

import villagegaulois.Musee;
import villagegaulois.Trophee;

public class Gaulois {

	private String nom;
	private int force;
	private int  effetPotion = 1;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private Trophee[] trophee; 
	

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "' "+ texte + "'" );
		
	}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//		
//	}
	
	private String prendreParole() {
		 
		return "Le gaulois " + nom + " : ";
		}

	
//	public void frapper(Romain romain) {
//		
//		    int forceDuCoup = (force * effetPotion) / 3;
//		    System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		    romain.recevoirCoup(forceDuCoup);
//		
//
//
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbTrophees++) {
		this.trophees[nbTrophees] = trophees[i];
		}
		
		}

	public void boirPotion(int forcePotion) {
		this.effetPotion= forcePotion;
		
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
		

		

	}
	 public void faireUneDonnation(Musee musee) {
	        if (trophees.length > 0) { // Vérifier si le Gaulois possède des trophées
	            System.out.print("Le gaulois " + nom + " : \"Je donne au musée tous mes trophées :\n");
	            for (Trophee trophee : trophee) {
	                if (trophee != null) { // Vérifier si le trophée n'est pas null
	                    System.out.println("- " + trophee.getEquipement().getNom());
	                }
	            }
	            System.out.println("\"");
	            // Ajouter tous les trophées au musée
	            for (Trophee trophee : trophee) {
	                if (trophee != null) { // Vérifier si le trophée n'est pas null
	                    musee.donnerTrophee(trophee.getGaulois(), trophee.getEquipement());
	                }
	            }
	            
	            trophee = new Trophee[10];
	        }
	    }
	

	@Override
	public String toString() {
		
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		
		
	}

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 6);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		
		System.out.println(asterix.prendreParole());
		asterix.parler("metti");
		asterix.frapper(minus);
		asterix.boirPotion(5);
		
		
		

		}

}


