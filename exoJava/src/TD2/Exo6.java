package TD2;

import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une hauteur pour la pyramide");
		int hauteur = clavier.nextInt();
		clavier.close();
		String etoile = "";
		//i est le numero de la ligne
		for(int i = 0; i<hauteur; i++) {
			etoile ="";
			/*
			 * Le nombre d'espace avant l'étoile est égale à hauteur - i -1
			 * Le -1 est essentiel pour qu'il n'y ait pas d'espace devant
			 * la dernière ligne d'étoile
			 */
			for(int j = 0; j<hauteur-i-1; j++) {
				etoile +=" ";
			}
			etoile+="*";
			for(int j = 0 ; j<i; j++) {
				etoile += "**";
			}
			System.out.println(etoile);
		}
		for(int i = 0 ; i<hauteur-1;i++) {
			etoile ="";
			for(int j =0; j<=i; j++) {
				etoile +=" ";
			}
			
			for(int j = 0; j<hauteur -i-2; j++) {
				etoile+="**";
			}
			etoile += "*";
			System.out.println(etoile);
		}
	}

}
