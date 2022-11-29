package heritage;

import java.util.Iterator;

public class Pays {
	private String nom;
	private Ville[] listeVille;
	private Capital capital;
	private int nbHabitant;
	
	public Pays(String nom) {
		this.nom = nom;
	}
	public void ajouterVille(Ville ville) {
		if(ville instanceof Capital) {
			if(this.capital == null) {
				this.capital = (Capital) ville;
			} else {
				System.out.println("il y a déjà une capital");
				return;
			}
		}
		int taille = 0;
		if(listeVille != null) {
			taille = listeVille.length;
		}
		Ville[] temp = listeVille;
		listeVille = new Ville[listeVille.length+1];
		for(int i = 0; i<taille; i++ ) {
			listeVille[i] = temp[i];
		}
		listeVille[taille] = ville;
		nbHabitant += ville.nbHabitant;
	}
		
	
	private void ajouterCapital(Capital capital) {
		if(this.capital == null) {
			this.capital = capital;
		} else {
			System.out.println("il y a déjà une capital");
		}	
	}
	
	public void getNbHabitant() {
		System.out.println(this.nbHabitant);
	}
	
	public void afficherListeVille() {
		for(Ville ville : listeVille) {
			ville.afficher();
		}
	}
	
}
