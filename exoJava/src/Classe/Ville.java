package Classe;

public class Ville {

	private String nom;
	private String pays;
	private int nbHabitant;
	
	public Ville(int nbHabitant) {
		if(nbHabitant<=10) {
			this.nbHabitant =0;
			System.out.println("une erreur");
		} else {
			this.nbHabitant = nbHabitant;
		}	
	}
	public void afficher() {
		System.out.println("La ville est " + nom + " le nb d'habitant est " + nbHabitant + " le pays est " + pays);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville paris = new Ville(15_000_000);
		paris.afficher();
		Ville inconnu = new Ville(0);
		inconnu.afficher();
	}

}
