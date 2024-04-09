package personnages;

public class Romain {

	private String nom;
	private int force; 
	private Equipement[] equipements;
	private int nbEquipement;
	private String texte;
	
	
	
	public Romain(String nom, int force) {
		this.nom = nom; 
		assert(force>0): "force doit etre positif";
		this.force = force;
		this.equipements = new Equipement[2];
		this.nbEquipement = 0;
			
		
		} 
	public String getNom() { 
		return nom; 
		} 
	public void parler(String texte) { 
		System.out.println(prendreParole() + "'" + texte + "'"); 
		} 
	private String prendreParole() {
		return "Le romain " + nom + " :"; 
		}
//	public void recevoirCoup(int forceCoup) {
//		assert (force >= 0) : "force doit etre positif";
//		int ancienneForce = force;
//		
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie"); } 
//		else { 
//			parler("J'abandonne...");
//			} 
//		assert force < ancienneForce : "La force n'a pas diminue";
//		}
//	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if(force == 0) {
			parler("Aïe");
		}
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");

			}
			// post condition la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
			}
	private int calculResistanceEquipement(int forceCoup) {
  
		texte = "Ma force est de " + this.force + ",et la force du coup est de" + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
		texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
		for (int i = 0; i < nbEquipement; i++) {
		if ((equipements[i] != null &&
		equipements[i].equals(Equipement.BOUCLIER))) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
		
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				
				equipementEjecte[nbEquipementEjecte] =
				equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
				}
				return equipementEjecte;
				}

		
		
	 public void sEquiper(Equipement equipement) {
	        switch (nbEquipement) {
	            case 0:
	                ajouterEquipement(equipement);
	                break;
	            case 1:
	                if (equipements[0] == equipement) {
	                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement.getNom() + " !");
	                } else {
	                    ajouterEquipement(equipement);
	                }
	                break;
	            case 2:
	                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
	                break;
	            default:
	                System.out.println("Erreur : nombre d'équipements invalide !");
	        }
	    }

	    private void ajouterEquipement(Equipement equipement) {
	        equipements[nbEquipement] = equipement;
	        nbEquipement++;
	        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement.getNom() + ".");
	    }

	
	public static void main(String[] args) {
		Equipement monEquipement = Equipement.CASQUE;
        System.out.println("Equipement : " + monEquipement);

        monEquipement = Equipement.BOUCLIER;
        System.out.println("Equipement : " + monEquipement);
		
        Romain minus = new Romain("Minus", 6);
		minus.recevoirCoup(6);
		minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
		
		
	}
	public int getForce() {
		return force;
	}

}
