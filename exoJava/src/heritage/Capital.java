package heritage;

public class Capital extends Ville {

	private String monument;
	
	public Capital(String nom, String pays, int nbHabitant, String monument) {
		super(nom, pays, nbHabitant);
		this.monument = monument;
	}
	@Override
	public String toString() {
		return "La ville est " 
	+ nom 
	+ " le nb d'habitant est " 
	+ nbHabitant 
	+ " le pays est " 
	+ pays 
	+ " sa categorie est " 
	+ categorie
	+ " le monument est "
	+ monument;
	}
	
	@Override
	public void afficher() {
		System.out.println(
	);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capital newYork = new Capital("New-York", "USA", 20_000_000, "Empire State Building");
		System.out.println(newYork);
	}

}
