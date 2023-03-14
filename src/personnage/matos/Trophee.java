package personnage.matos;

import personnage.matos.Equipement;
import personnage.Gaulois;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipements;
	
	public Gaulois getGaulois() {
		return gaulois;
	}
	public Equipement getEquipements() {
		return equipements;
	}
	
	public Trophee(Gaulois gaulois, Equipement equipements) {
		this.gaulois = gaulois;
		this.equipements = equipements;
	}

	public String donnerNom() {
		return gaulois.getNom();
	}
	
}
