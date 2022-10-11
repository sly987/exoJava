package TDTableau;

import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] tab = {'a', 'b', 'c' , 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		Scanner clavier = new Scanner(System.in);
		char choix;
		do {
			System.out.println("saisir une lettre en minuscule");
			char lettre = clavier.next().charAt(0);
			boolean estTrouve = false;
			for(int indice =0 ; indice<tab.length ; indice++) {
				if(lettre == tab[indice]) {
					System.out.println("trouvé, c'est d'indice " + indice);
					estTrouve = true;
					break;
				}
					
			}
			if(!estTrouve) {
				System.out.println("pas trouvé");	
			}
			System.out.println("Ressayer? o/n");
			choix = clavier.next().charAt(0);
		}while(choix == 'o');
		clavier.close();
	}

}
