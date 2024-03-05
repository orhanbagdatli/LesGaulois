package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	public int effetPotionMin;
	public int effetPotionMax;
	public int forcePotion = 1;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + ".");
		}
	public String getNom() {
		return nom;
		}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
		} 
	private String prendreParole() {
		return "Le druide " + nom + " : ";
		}
	public void preparerPotion() {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		forcePotion=rnd.nextInt(effetPotionMin,effetPotionMax +1);
		if (forcePotion > 7) {
			parler("J'ai pr�par� une super potion de force" + forcePotion);
		}
		else {
			parler(" Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion);
		}
		

		}
	public void booster(Gaulois gaulois) {
		// TODO Auto-generated method stub
		if (gaulois.getNom() == "Obélix"){
			parler(" Non, Obélix !... Tu n'auras pas de potion magique ! ");
			
		}else {
			preparerPotion();
			gaulois.boirPotion(forcePotion);
		}

	}
	
public static void main(String[] args) {
	Random rnd = new Random();

	Druide panoramix = new Druide("Panoramix", 5, 10);
	panoramix.preparerPotion();
	
	
}
	
	
	


}
