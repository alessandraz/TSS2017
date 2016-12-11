package progetti.cuoriSolitari;

import java.util.Scanner;

public class CuoriSolitari {
	

	public void saluto(){
		System.out.println("Ciao, benvenuto su Cuori Solitari");
		
	}
	

	public static void main(String[] args) {
		
		CuoriSolitari cuoriSolitari = new CuoriSolitari();

		Scanner sc = new Scanner(System.in);
		

		Utente utente01;
		Utente utente02;
	
		
		cuoriSolitari.saluto();
		
	
		System.out.println("Inserisci uno pseudonimo");
		String pseudonimo = sc.nextLine();
		
		System.out.println("Inserisci uno pseudonimo");
		String pseudonimo2 = sc.nextLine();
		
		System.out.println("Inserisci il tuo sesso");
		String sesso = sc.nextLine();
		
		System.out.println("Inserisci il tuo sesso");
		String sesso2 = sc.nextLine();
		
		System.out.println("Inserisci la tua età");
		int eta = sc.nextInt();
		
		System.out.println("Inserisci la tua età");
		int eta2 = sc.nextInt();
		
		utente01 = new Utente(pseudonimo, sesso, eta);
		utente02 = new Utente(pseudonimo2, sesso2, eta2);

		System.out.println(utente01);
		System.out.println(utente02);
		
		utente01.affinita(utente02);
		
		
		
		

	}
}
