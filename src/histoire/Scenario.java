package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Romain minus = new Romain("Minus", 6);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller preparer une petite potion..");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos c'est pas juste!");
		asterix.boirPotion(panoramix.forcePotion);
		asterix.parler("Bonjour");
		minus.parler(" UN GAU... UN GAUGAU... ");
		asterix.frapper(minus);
		
		
	}

}
