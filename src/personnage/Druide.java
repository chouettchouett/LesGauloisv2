package personnage;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + 
			" et ma potion peut aller d'une force " + effetPotionMin + " à "
		+ effetPotionMax + ".");
		}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if ("Obelix".equals(nomGaulois)) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique ! ");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public int preparerPotion() {
		Random rand = new Random();
		int puissance = rand.nextInt(effetPotionMax-effetPotionMin) + effetPotionMin;
		if (puissance > 7) {
			parler("J'ai prepare une super potion de force " + puissance);
		} else {
			parler("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force " + puissance);
		}
		forcePotion = puissance;
		return puissance;
	}
}
