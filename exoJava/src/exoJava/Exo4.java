package exoJava;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une annee entre 1900 et 3000 inclue");
		int annee = clavier.nextInt();
		clavier.close();
		if (annee < 1900 || annee > 3000) {
			System.out.println("erreur l'annee n'est pas comprise entre 1900 et 3000 inclue");
		} else if (annee % 4 != 0) {
			System.out.println("l'annee n'est pas bissextile");
		} else if (annee % 100 == 0 && annee % 400 != 0) {
			System.out.println("l'annee n'est pas bissextile");
		} else {
			System.out.println("l'annee est bissextile");
			}
	}

}
