package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[] ;
	private int nbVillageois;
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageois=0;
		this.villageois = new Gaulois[nbVillageoisMax];
		}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom; 
		}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++ ;
		
		

	}
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero]; 
		
		
	}
	public void afficherVillageois() {
		System.out.println("Dans village du chef"+ chef.getNom()+ "vivent les legendaires gaulois :");
		for(int i = 0; i<nbVillageois; i++) {
			System.out.println("-"+villageois[i].getNom());
		}
		
	}
	
	
	
	
	
	

public static void main(String[] args) {
	Village village = new Village("Village des Irréductibles", 30);
	
	Chef abraracourcix = new Chef("Abraracourcix", 6, village);
	village.setChef(abraracourcix);
	Gaulois asterix = new Gaulois("Astérix", 8);
	village.ajouterHabitant(asterix);
//	Gaulois gaulois = village.trouverHabitant(0);
//    System.out.println(gaulois);
	Gaulois obelix = new Gaulois("Obélix", 25);
	village.ajouterHabitant(obelix);
	village.afficherVillageois();


	
	
	
	
	
}
}

