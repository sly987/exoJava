package exoJava;

import java.util.Scanner;

public class Exo2 {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une lettre");
		int nombre = clavier.next().charAt(0);
		clavier.close();
		System.out.println("le nombre ASCII est : " + nombre);
	}
}
