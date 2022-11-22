package heritage;

public class Ville {

	protected String nom;
	protected String pays;
	protected int nbHabitant;
	protected char categorie;
	protected static int compteur;
	

	
	public Ville(int nbHabitant) {
		setNbHabitant(nbHabitant);
	}
	
	public Ville(String nom, String pays, int nbHabitant) {
		this.nom = nom;
		this.pays = pays;
		setNbHabitant(nbHabitant);
		Ville.compteur++;

	}
	public Ville(String nom) {
		this(nom, "inconnu", 1000);
	}
	
	public void setNbHabitant(int nbHabitant) {
		if(nbHabitant<=10) {
			this.nbHabitant =0;
			System.out.println("une erreur");
		} else {
			this.nbHabitant = nbHabitant;
		}
		setCategorie();
	}
	private void setCategorie() {
		if(this.nbHabitant<1_000) {
			categorie = 'A';
		} else if(this.nbHabitant<10_000) {
			categorie = 'B';
		} else if(this.nbHabitant<100_000) {
			categorie = 'C';
		} else if(this.nbHabitant<500_000) {
			categorie = 'D';
		} else if(this.nbHabitant<1_000_000) {
			categorie = 'E';
		} else if(this.nbHabitant<5_000_000) {
			categorie = 'F';
		} else if(this.nbHabitant<10_000_000) {
			categorie = 'G';
		} else {
			categorie = 'H';
		}
	}
	
	public int getNbHabitant() {
		return this.nbHabitant;
	}
	
	public void afficher() {
		System.out.println("La ville est " + nom + " le nb d'habitant est " + nbHabitant + " le pays est " + pays + " sa categorie est " + categorie);
	}
	
	public void comparer(Ville v) {
		if(this.getNbHabitant()> v.getNbHabitant()) {
			System.out.println(this.nom + " est plus peuplé que " + v.nom);
		} else {
			System.out.println(v.nom + " est plus peuplé que " + this.nom);
		}
	}
	public static int getCompteur() {
		return compteur;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Ville inconnu = new Ville(1500000);
		inconnu.afficher();
		Ville town = new Ville("town");
		town.afficher();
		town = new Ville("town", "pays",999 );
		town.afficher();
		town = new Ville("town", "pays",9999 );
		town.afficher();
		town = new Ville("town", "pays",99999 );
		town.afficher();
		inconnu.comparer(town);
		System.out.println(Ville.getCompteur());
	}
	

}
