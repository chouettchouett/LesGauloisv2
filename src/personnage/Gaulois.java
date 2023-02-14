package personnage;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

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
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {   
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
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
