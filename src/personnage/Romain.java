package personnage;

import personnage.matos.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[] = new Equipement[2];
	private int nbEquipement = 0;
	

	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0;
		int forcedebut = force;
		force -= forceCoup;
		assert forcedebut >= force;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	private void donner(Equipement equipement,int position) {
		equipements[position] = equipement;
		nbEquipement ++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + equipement + " .");
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2 :
			System.out.println("Le soldat " + nom + " est deja bien protege !");
			break;
		case 1 :
			if ((equipements[0] == equipement) || (equipements[1] == equipement)) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement + " !");
			}
			else {
				if (equipements[0] == null) donner(equipement,0);
				else donner(equipement,1);
			}
			break;
		case 0 :
			donner(equipement,0);
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Romain",6);
		romain.parler("Je m'apelle ROMAIN");
		romain.recevoirCoup(1);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.BOUCLIER);
		romain.sEquiper(Equipement.CASQUE);
	}
}
