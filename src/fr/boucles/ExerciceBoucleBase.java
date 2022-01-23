package fr.boucles;

// Exercices sur les boucles de base en java
public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		// Affichage des nombres de 1 à 10 
		for (int i=1 ; i<11; i++) {
			System.out.println(i);
		}

		// Affichage 20 fois de mon nom et prénom
		for (int i=0; i<20; i++) {
			System.out.println("KOMINIARZ Anaïs");
		}
		
		// Affichage des éléments pairs de 2 à 100
		for (int i=2; i<=100; i+=2) {
			System.out.println(i);
		}
		
		// Affichage des éléments impairs de 1 à 99
		for (int i=1; i<100; i+=2) {
			System.out.println(i);
		}
	}

}
