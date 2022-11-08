package TDTableau;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {9,4,6,8,2,3};
		for(int i = 0 ; i < tab.length ; i++) {
			System.out.print(tab[i] + " ");
		}
		int intermédiaire;
		boolean permut = true;
		for(int i = (tab.length -1) ; i >= 1 ; i-- ) {
			for(int j = 0 ; j<= (i -1); j++) {
				if(tab[j+1] < tab[j]) {
					intermédiaire = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = intermédiaire;
				}
			}
		}
		System.out.println("");
		for(int i = 0 ; i < tab.length ; i++) {
			System.out.print(tab[i] + " ");
		}
	}

}
