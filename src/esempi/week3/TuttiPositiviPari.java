package esempi.week3;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		// scrivere un programma che chiede all'utente di inserire
		//una sequenza di interi (chiedendo prima quanti numeri voglia inserire)
		//e poi, al termine dell'inserimento dell'intera sequenza,
		// stampa 
		// tutti positivi e pari se i numeri sono tutti positivi e pari
		// altrimenti stampa "non sono tutti i positivi e pari"
		// risolvere esercizio senza usare array
		
		//chiedo all'utente quanti num vuole inserire
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?");
		int numeri = input.nextInt();
		
		int numInseriti = 0;
		
		//chiedo all'utente di inserire num interi
		boolean positiviPari = true; //sentinella
		
		for (int i = 0; i < numeri; i++ ){
			System.out.println("Inserisci il num");
			int n = input.nextInt();
			
			if(n < 0 || n % 2 !=0) positiviPari = false;
			System.out.println(positiviPari);
			
		}
		
		if (positiviPari) {
			System.out.println("tutti i numeri sono pari");
		}
		else {
			System.out.println("non tutti i numeri sono pari");
		}
		
		
	}

}
