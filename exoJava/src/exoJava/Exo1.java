package exoJava;

import java.util.*;

public class Exo1 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir un nombre strictement positif");
		double nombre = clavier.nextDouble();
		clavier.close();
		if (nombre < 0) {
			System.out.println("erreur nombre inferieur a 0");
		} else if (nombre % 2 == 0) {
			System.out.println("nombre pair");
		} else {
			System.out.println("nombre impair");
		}

	}

}
