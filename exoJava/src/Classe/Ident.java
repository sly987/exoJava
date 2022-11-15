package Classe;

public class Ident {

	private int identifiant;
	private static int compteur;
	
	public Ident() {
		compteur++;
		identifiant = compteur;
		
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	
	public static int lastID() {
		return compteur;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ident a = new Ident();
		System.out.println("l'id est " + a.getIdentifiant());
		Ident b = new Ident();
		System.out.println("l'id est " + b.getIdentifiant());
		Ident c = new Ident();
		System.out.println("l'id est " + c.getIdentifiant());
		Ident d = new Ident();
		System.out.println("l'id est " + d.getIdentifiant());
		Ident e = new Ident();
		System.out.println("l'id est " + e.getIdentifiant());
		System.out.println("Le dernier id est " + Ident.lastID());
	}

}
