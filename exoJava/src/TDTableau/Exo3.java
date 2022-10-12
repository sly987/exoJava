package TDTableau;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir la valeur recherchee strictement superieur a 1 pour Fibonacci ");
		int valeur = clavier.nextInt();
		char choix ='o';
		int[] tab = new int[valeur+1];
		int[] tab2;
		tab[0] = 0;
		tab[1] = 1;
		for(int i = 2; i<valeur+1; i++) {
				tab[i] = tab[i-1] + tab[i-2];
			}
		System.out.println("F(" + valeur + ")=" + tab[valeur]);
		System.out.println("Recommencer ? o/n");
		choix = clavier.next().charAt(0);	

		while(choix == 'o'){
			System.out.println("Saisir la valeur recherchee strictement superieur a 1 pour Fibonacci ");
			valeur = clavier.nextInt();
			if(tab.length < valeur+1) {
				tab2 = new int[tab.length];
				tab2 = tab;
				tab = new int[valeur+1];
				for(int i = 0; i < tab2.length ; i++) {
					tab[i] = tab2[i];
				}
				for(int i =tab2.length; i<tab.length ; i++) {	
					tab[i] = tab[i-1] + tab[i-2];
					
				}	
			}
			System.out.println("F(" + valeur + ")=" + tab[valeur]);
			System.out.println("Recommencer ? o/n");
			choix = clavier.next().charAt(0);	

		}
			
	}

}
