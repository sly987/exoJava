package TD2;

import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une chaine");
		String chaine = clavier.next();
		clavier.close();
		String inverse ="";
		for(int i = 1; i<= chaine.length(); i++) {
			inverse += chaine.charAt(chaine.length() - i);
		}
		System.out.println("l'inverse de " + chaine + " est " + inverse);
		
	}
}
