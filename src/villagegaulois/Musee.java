package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;

public class Musee {
    private Trophee[] trophees; 
    private int nbTrophee; 

    
    public Musee() {
        this.trophees = new Trophee[200]; // Initialisation du tableau de trophées pouvant contenir 200 trophées
        this.nbTrophee = 0; // Initialisation du nombre de trophées à 0
    }

   
    public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
        if (nbTrophee < 200) { // Vérifier si le musée peut encore contenir des trophées
            Trophee nouveauTrophee = new Trophee(gaulois, equipement); // Créer un nouveau trophée
            trophees[nbTrophee] = nouveauTrophee; // Ajouter le nouveau trophée au tableau
            nbTrophee++; 
        } else {
            System.out.println("Le musée est plein, impossible d'ajouter de nouveaux trophées.");
        }
    }
}
