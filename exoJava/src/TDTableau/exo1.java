package TDTableau;

import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] tab = {'a', 'b', 'c' , 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		Scanner clavier = new Scanner(System.in);
		char choix;
		char caractere;
		String car;
		do {
			do {
				System.out.println("Saisir un caractere alphabetique");
				car = clavier.next();
			} while(car.length()!= 1 || ((caractere = car.toLowerCase().charAt(0)) < 'a' || caractere > 'z'));
					
			boolean estTrouve = false;
			int indice;
			for(indice =0 ; indice<tab.length && !estTrouve ; indice++) {
				estTrouve = (tab[indice] == caractere);
				}
	
			if(estTrouve) {
				System.out.println("trouvé, c'est de position " + indice);	
			} else {
				System.out.println(" non trouvé");
			}
			System.out.println("Ressayer? o/n");
			choix = clavier.next().charAt(0);
		}while(choix == 'o');
		clavier.close();
	}
	
}
