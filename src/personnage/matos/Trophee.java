package personnage.matos;
import personnage.Gaulois;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipements[] = new Equipement[2];
	
	public Gaulois getGaulois() {
		return gaulois;
	}
	public Equipement[] getEquipements() {
		return equipements;
	}
	
	public Trophee(Gaulois gaulois, Equipement[] equipements) {
		super();
		this.gaulois = gaulois;
		this.equipements = equipements;
	}

	
	
}
