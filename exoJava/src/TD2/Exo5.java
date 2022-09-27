package TD2;

import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une hauteur pour la pyramide");
		int hauteur = clavier.nextInt();
		clavier.close();
		
		for(int i = 0; i<hauteur; i++) {
			String etoile = "";
			for(int j = i; j<hauteur; j++) {
				etoile +=" ";
			}
			etoile+="*";
			for(int j = hauteur-i ; j<hauteur; j++) {
				etoile += "**";
			}
			System.out.println(etoile);
		}
	}

}
