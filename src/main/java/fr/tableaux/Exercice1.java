package fr.tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Premier élément du tableau: " + tab[0]);
		System.out.println("Dernier élément du tableau: " + tab[9]);
		System.out.println("Longueur du tableau: " + tab.length + " cases");
		//l'entier 5 est situé à l'index 4
		//System.out.println("Index 10 du tableau: " + tab[10]); crée une erreur car l'index 10 n'existe pas. Le tableau s'arrete à l'index 9.
		tab[4] = 8;
	}

}
