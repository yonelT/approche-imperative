package fr.tableaux;

public class Exercice2 {

	public static void main(String[] args) {
		int[][] tab_multi = {{1,2,3} , {4,5,6,7,8}};
		/* OU on aurait pu faire:
		 * int[][] nombres = new int[2][];
		 * nombres[0] = new int[] {1,2,3};
		 * nombres[1] = new int[] {4,5,6,7,8};
		 */
		
		int dernierIndexLigne = 0;
		int dernierIndexColonne = 0;
		
		System.out.println("Longueur du tableau en utilisant la propriété .length: " + tab_multi.length);
		System.out.println("Taille de la première ligne en utilisant la propriété .length: " + tab_multi[0].length);
		System.out.println("Taille de la seconde ligne en utilisant la propriété .length: " + tab_multi[1].length);
		System.out.println("Le premier élément du tableau: " + tab_multi[0][0]);
		dernierIndexLigne = (tab_multi[0].length - 1);
		dernierIndexColonne = (tab_multi[1].length - 1);
		System.out.println("Le dernier élément de la 1ère ligne du tableau:" + tab_multi[0][dernierIndexLigne]);
		System.out.println("Le dernier élément de la 2ème ligne du tableau:" + tab_multi[1][dernierIndexColonne]);
	}

}
