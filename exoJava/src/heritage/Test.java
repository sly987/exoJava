package heritage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville ville = new Ville("Ville", "Pays", 10000);
		Ville ville2 = new Ville("Ville2", "Pays", 40000);
		Village village = new Village("village", "pays",10000 );
		Village village2 = new Village("village", "pays",30000 );
		Capital capital = new Capital("Capital", "Pays", 1000, "monument");
		Capital capital2 = new Capital("Capital2", "Pays", 1000, "monument");
		Pays pays = new Pays("Pays");
		pays.ajouterVille(ville);
		pays.ajouterVille(ville2);
		pays.ajouterVille(village2);
		pays.ajouterVille(capital);
		pays.ajouterVille(capital2);
		pays.afficherListeVille();
		pays.getNbHabitant();

		
	}

}
