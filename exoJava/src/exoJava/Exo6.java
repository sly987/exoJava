package exoJava;

import java.util.Scanner;

public class Exo6 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir un nombre :");
		double nombre = clavier.nextDouble();
		clavier.close();
		String diviseur = "";
		if (nombre % 2 == 0 && nombre % 3 == 0) {
			diviseur += "2, 3";
			if (nombre % 5 == 0) {
				diviseur += ", 5";
				if (nombre % 10 == 0) {
					diviseur += " et 10";
				}
			}
			System.out.println("il est divisible par " + diviseur);
		} else {
			System.out.println("il n'est divisible par 2 et par 3 a la fois" );
			}
		
	}
}
