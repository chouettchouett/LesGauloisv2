package Structure;

import personnage.Chef;
import personnage.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
	private int nbVillageois = 0;
	private int nbVillageoismax = 10;
	
	public Village(String nom, int nbVillageoismax) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoismax];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterhabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois ;
		nbVillageois += 1 ;
	}
	
	public Gaulois trouverHabitant(int indice) {
		return villageois[indice];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " habitent :");
		for(int i =0; i < nbVillageois; ++i) {
			System.out.println(" -" + villageois[i].getNom() + ",");
		}
	
	}
	
}

