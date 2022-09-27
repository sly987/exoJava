package exoJava;

import java.util.Scanner;

public class Cours {
	public static void main(String[] args) {
		/*
		 * Scanner clavier = new Scanner(System.in); int nombre = 0; do {
		 * System.out.println("saisir un nombre entre 1 et 10"); nombre =
		 * clavier.nextInt(); } while(nombre <1 || nombre>10); clavier.close();
		 */
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("saisir un nombre");
		int n = clavier.nextInt();
		clavier.close();
		long fact = 1;
		for(int i = 2; i<=n;i++)
		{
			fact *=1;
		}
		System.out.println("Factorielle de " + n + " = " +fact);
	}

}
