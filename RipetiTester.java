package esempi.week4;

import java.util.Scanner;

public class RipetiTester {

	public static void main(String[] args) {
		
		Ripeti utente01 = new Ripeti();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimmi una stringa");
		utente01.inputStringa = sc.nextLine();
		
		System.out.println("Dimmi un numero positivo");
		utente01.inputInt = sc.nextInt();
		
		utente01.stampaStringa();
		
		
		
		

	}

}
