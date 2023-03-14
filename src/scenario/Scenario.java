package scenario;

import personnage.Druide;
import personnage.Gaulois;
import personnage.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix",8);
		Gaulois obelix = new Gaulois ("Obelix",8);
		Romain Minus = new Romain("Minus",6);
		Druide panoramix = new Druide("panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		asterix.parler("Bonjour à tous");
		Minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		
	}
}
