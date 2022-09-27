package exoJava;

import java.util.Scanner;

public class Cours {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int nombre = 0;
		do
		{
			System.out.println("saisir un nombre");
			nombre = clavier.nextInt();
		} while(nombre <1 || nombre>10);
		clavier.close();
	}

}
