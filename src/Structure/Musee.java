package Structure;

import personnage.Gaulois;
import personnage.matos.Equipement;
import personnage.matos.Trophee;

public class Musee {
	private int nbTrophee;
	private Trophee[] tabTrophee= new Trophee[200];
	
	public void donnerTrophee(Gaulois gaulois,Equipement equipement) {
		Trophee trophee = new Trophee(gaulois,equipement);
		tabTrophee[nbTrophee] = trophee;
		nbTrophee ++;
	} 
	public String extraireInstructionCaml() {
		String texte = "let musee = [\n";
		for (int i=0;i<nbTrophee;i++) {
			texte +="\"";
			texte += tabTrophee[i].donnerNom();
			texte += "\", \"";
			texte += tabTrophee[i].getEquipements().toString();
			texte += "\"";
			if (i==nbTrophee-1) texte += ";";
			texte += "\n";
		}
		texte += "]";
		return texte;
	}
}
