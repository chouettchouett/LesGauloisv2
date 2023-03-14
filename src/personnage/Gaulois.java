package personnage;

import personnage.matos.Equipement;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100];

	

	public Gaulois(String nom, int force) {
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
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}
	/*
	 * private String prendreParole() { return "Le gaulois " + nom + " : "; }
	 */

	/*
	 * public void frapper(Romain romain) { System.out.println(nom +
	 * " envoie un grand coup dans la mâchoire de " + romain.getNom());
	 * romain.recevoirCoup(force / 3); }
	 */
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
				Equipement trophees[] = romain.recevoirCoup((force / 3) *
						effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
				nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}


	@Override
	 public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
//TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix = new Gaulois ("Asterix",8);
		System.out.println(asterix);
		// System.out.println(asterix.getNom());
		asterix.parler("blabla");
		Romain John = new Romain("John",1);
		asterix.frapper(John);
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + String.valueOf(forcePotion) + " fois decuplee");
	}
}
