package TD2;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir un entier");
		int nombre = clavier.nextInt();
		clavier.close();
		if(nombre ==0) {
			System.out.println("0 est divisible par tout les nombres ");
		} else if(nombre == 1) {
			System.out.println("1 n'est pas premier");
		} else {
			int i =2;
			boolean pasDiviseur= true;
			int diviseur = 0 ;
			while(i<nombre && pasDiviseur) {
				if(nombre % i == 0) {
					pasDiviseur = false;
					diviseur = i;
				} else {
					i++;
				}		
			}
			if(pasDiviseur) {
				System.out.println("Le nombre " + nombre + " est premier");
			} else {
				System.out.println("Le nombre " + nombre + " n'est pas premier, son premier diviseur est " + diviseur);
			}
		}
	}

}
