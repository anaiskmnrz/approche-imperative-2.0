package fr.boucles;

// Exercices sur les boucles combin�es avec des tests en java 
public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4}; 
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("\n***Affichage des entiers sup�rieurs � 3***");
		
		// Affichage des entiers sup�rieurs � 3
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("\n***Affichage des entiers pairs***");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("\n****Affichage des valeurs des index pairs***");
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("\n***Affichage des entiers impairs***");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 != 0) {
				System.out.println(array[i]);
			}
		}
	}

}
