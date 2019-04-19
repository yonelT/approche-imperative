package fr.algorithmie;



public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int[array.length];
		int i;
		
		System.out.println("Affichage de l’ensemble des éléments du tableau:");
		for (i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		System.out.println("\nAffichage inversé de l’ensemble des éléments du tableau:");
		for (i = (array.length - 1); i >= 0; i--){
			System.out.println(array[i]);
		}
		
		System.out.println("\nVoici maintenant les valeurs du tableau arrayCopy:");		
		for (i = (array.length - 1); i >= 0; i--){
			arrayCopy[i] = array[i];
			
			System.out.println(arrayCopy[i]);
			//!scanner.close();
		}

	}

}
