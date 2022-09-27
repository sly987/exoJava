package TD2;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir un entier");
		int nombre = clavier.nextInt();
		int f0 = 0;
		int f1 = 1;
		int resultat = 0;
		if(nombre == 0) {
			System.out.println("F(0) = 0" );
		} else if(nombre == 1) {
			System.out.println("F(1) = 1");
		} else {
			
			for(int i = 2; i<=nombre; i++) {
				resultat = f1 + f0;
				f0 = f1;
				f1 = resultat;
			
			}
		}
		System.out.println("F(" + nombre +") = " + resultat);
	}

}
