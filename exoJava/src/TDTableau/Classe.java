package TDTableau;

import java.util.Scanner;

public class Classe {
	Scanner clavier = new Scanner(System.in);
	boolean estSaisie =false;
	//tableau
	int[] notes = new int[3];
	public void menu() {
		
		boolean sortir = false;
		String choix ="";
		do {
			System.out.println("Menu");
			System.out.println("-------");
			System.out.println("Voulez-vous :");
			System.out.println("a. saisir les notes des élèves");
			System.out.println("b. afficher la moyenne, la note max et min");
			System.out.println("c. sortir");
			choix = clavier.next();
			switch(choix) {
			case "a" : 
				saisirNotes();
				break;
			case "b" : 
				afficherCalculs();
				break;
			case "c" :
				sortir = true;
				break;
			default :
				System.out.println("choix incorrect");
			
			}
		}while(!sortir);
	}
	public void saisirNotes() {
		
		for(int i = 0; i<notes.length; i++) {
			
			System.out.println("Saisir la note de l'élève n°" + (i+1));
			notes[i] = clavier.nextInt();
		}
		System.out.println("Les " + notes.length + " notes ont été saisie");
	}
	
	public void afficherCalculs() {
		if(estSaisie) {
			System.out.println("Saisir les notes");
			return;
		}
		int max = 0;
		int min = 20;
		double somme = 0;
		for(int i =0; i< notes.length ; i++) {
			somme += notes[i];
			if(max<notes[i]) {
				max = notes[i];
			}
			if(min>notes[i]) {
				min = notes[i];
			}
		}
		System.out.println("La moyenne est " + somme/notes.length 
				+ ", la note maximal est " + max 
				+ ", la note minimal est " + min);
	}
		
		
	

}
