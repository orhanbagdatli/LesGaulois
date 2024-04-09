package villagegaulois;

import personnages.Equipement;
import personnages.Gaulois;

public class Trophee {
    private Gaulois gaulois;
    private Equipement equipement;

    // Constructeur initialisant les 2 attributs
    public Trophee(Gaulois gaulois, Equipement equipement) {
        this.gaulois = gaulois;
        this.equipement = equipement;
    }

    // Getteurs
    public Gaulois getGaulois() {
        return gaulois;
    }

    public Equipement getEquipement() {
        return equipement;
    }

    // Méthode donnerNom qui retourne le nom du gaulois
    public String donnerNom() {
        return gaulois.getNom();
    }
}
