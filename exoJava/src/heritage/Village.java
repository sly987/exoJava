package heritage;

public class Village extends Ville {

	public Village(String nom, String pays, int nbHabitant) {
		super(nom, pays, nbHabitant);
	}
	
	@Override
	public void setNbHabitant(int nbHabitant) {
		super.setNbHabitant(nbHabitant);
		if(nbHabitant>20_000) {
			this.nbHabitant = 0;
			System.out.println("erreur pas assez d'habitant");
			
		}
	}
	
	@Override
	public void afficher() {
		System.out.println("Le village " + nom + " a " + nbHabitant + " habitants");
	}
	
	
}
