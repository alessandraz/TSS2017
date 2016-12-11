package progetti.esercizi_week4;

import java.util.Scanner;

public class ConcatenaTester {

	public static void main(String[] args) {
		
		Concatena utente01 = new Concatena();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci la prima parola");
		utente01.parola1 = sc.nextLine();
		
 		System.out.println("Inserisci la seconda parola");
 		utente01.parola2 = sc.nextLine();
 		
		System.out.println("Inserisci la terza parola");
		utente01.parola3 = sc.nextLine();
		
		//System.out.println(utente01.parola1 + utente01.parola2 + utente01.parola3);
		
		utente01.concatena();
		
		

	}

}
