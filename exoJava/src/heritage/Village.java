package heritage;

public class Village extends Ville {

	public Village(String nom, String pays, int nbHabitant) {
		super(nom, pays, nbHabitant);
	}
	
	@Override
	public void setNbHabitant(int nbHabitant) {
		if(nbHabitant<20_000) {
			System.out.println("erreur pas assez d'habitant");
		}else {
			this.nbHabitant = nbHabitant;
		}
	}
	
	@Override
	public void afficher() {
		System.out.println("Le village " + nom + " a " + nbHabitant + " habitants");
	}
	
	
}
