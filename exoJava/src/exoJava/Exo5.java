package exoJava;

import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir un age");
		int age = clavier.nextInt();
		clavier.close();
		if (age < 0) {
			System.out.println("erreur l'age saisi est strictement inferieur a 0");
		} else if (age < 4) {
			System.out.println("bebe");
		} else if (age < 11) {
			System.out.println("enfant");
		} else if (age < 13) {
			System.out.println("adolescent");
		} else if (age < 18) {
			System.out.println("jeune");
		} else if (age < 65) {
			System.out.println("adulte");
		} else if (age < 75) {
			System.out.println("senior");
		} else {
			System.out.println("vieux");
		}

	}

}
