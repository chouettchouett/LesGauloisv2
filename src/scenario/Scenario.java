/*
 * package scenario;
 * 
 * import personnage.Druide; import personnage.Gaulois; import
 * personnage.Romain;
 * 
 * public class Scenario {
 * 
 * public static void main(String[] args) { Gaulois asterix = new Gaulois
 * ("Asterix",8); Gaulois obelix = new Gaulois ("Obelix",8); Romain Minus = new
 * Romain("Minus",6); Druide panoramix = new Druide("panoramix", 5, 10);
 * panoramix.parler("Je vais aller préparer une petite potion...");
 * panoramix.preparerPotion(); panoramix.booster(obelix);
 * asterix.parler("Bonjour à tous"); Minus.parler("UN GAU... UN GAUGAU...");
 * asterix.frapper(Minus); asterix.frapper(Minus); asterix.frapper(Minus);
 * 
 * } }
 */

package scenario;

import personnage.Druide;
import personnage.matos.Equipement;
import personnage.Gaulois;
import personnage.Romain;
import Structure.Village;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0);
		
//		Partie a decommenter
		
//		Musee musee = new Musee();
//		asterix.faireUneDonnation(musee);

	}

}