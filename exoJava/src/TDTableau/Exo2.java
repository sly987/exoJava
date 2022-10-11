package TDTableau;

import java.util.Random;
import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		Random rand = new Random();
		int taille=0;
		
		do {
			System.out.println("saisir la taille de la matrice carré entre 2 et 10");
			taille = clavier.nextInt();
		}while(taille<2 || taille>10);
		
		int [][] matrice = new int[taille][taille];
		
		for(int i = 0; i<taille ;  i++) {
			for(int j = 0; j<taille; j++) {
				matrice[i][j]= rand.nextInt(100) + 1;
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println("");
		}
		int intermédiaire = 0;
		int middle = taille/2;

		for(int i = 0; i<middle ; i++) {
			if(i==middle && taille % 2 !=0) {
				for(int j = 0 ; j<middle; j++) {
					intermédiaire = matrice[i][j];
					matrice[i][j]= matrice[taille-1-i][taille-1-j];
					matrice[taille-1-i][taille-1-j] =intermédiaire;
					}
			} else {
				for(int j = 0 ; j<taille; j++) {
				intermédiaire = matrice[i][j];
				matrice[i][j]= matrice[taille-1-i][taille-1-j];
				matrice[taille-1-i][taille-1-j] =intermédiaire;
				}
			}
				
			
		}
		System.out.println("");
		for(int i = 0; i<taille ;  i++) {
			for(int j = 0; j<taille; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
