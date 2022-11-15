package Classe;

public class Point {
	
	private String nom;
	private double abscisse, ordonnee;
	
	public Point(String nom, double abscisse, double ordonnee) {
		this.nom = nom;
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	
	public void affiche() {
		System.out.println("Le nom est " + nom + " et l'abscisse est " + abscisse + " et l'ordonnee est " + ordonnee);
	}
	
	public void translate(double deplacementX, double deplacementY) {
		abscisse += deplacementX;
		ordonnee += deplacementY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a = new Point("a", 2, 4);
		a.affiche();
		a.translate(3,6);
		a.affiche();
	}

}
