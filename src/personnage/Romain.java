package personnage;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
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
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public static void main(String[] args) {
		Romain john = new Romain ("John",6);
		john.parler("Je suis un romain");
		john.recevoirCoup(8);
	}
}
