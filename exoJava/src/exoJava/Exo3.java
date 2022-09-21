package exoJava;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir un nombre strictement positif inferieur a 100");
		double nombre = clavier.nextDouble();
		clavier.close();
		if (nombre <= 0) {
			System.out.println("erreur nombre inferieur a 0");
		} else if (nombre > 100) {
			System.out.println("erreur nombre strictement superieur a 100");
		} else {
			System.out.println("le nombre saisie est correct");
		}
	}

}
