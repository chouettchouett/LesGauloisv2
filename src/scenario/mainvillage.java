package scenario;

import Structure.Village;
import personnage.Chef;
import personnage.Gaulois;

public class mainvillage {

	public static void main(String[] args) {
		Village vdi = new Village ("Village des Irr�ductibles",30);
		//Gaulois gaulois = vdi.trouverHabitant(30);
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30
//		at Structure.Village.trouverHabitant(Village.java:32)
//		at scenario.mainvillage.main(mainvillage.java:10)
		// la taille demand� est trop grande
		Chef abra = new Chef("Abraracourcix",6,vdi);
		vdi.setChef(abra);
		
		Gaulois asterix = new Gaulois("Asterix",8);
		vdi.ajouterhabitant(asterix);
		
		Gaulois gaulois = vdi.trouverHabitant(1);
		System.out.println(gaulois);
// null 
	// car il n'y a personne � l'emplacement 1 car il n'y a que asterix � la place 0
		vdi.afficherVillageois();
		Gaulois Obelix = new Gaulois("Obelix", 25);
		vdi.ajouterhabitant(Obelix);
		vdi.afficherVillageois();
	}

}
