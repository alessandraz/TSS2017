package esempi.week4;

import java.util.Scanner;

public class TuttiUgualiTester {

	public static void main(String[] args) {
		
		TuttiUguali utente01 = new TuttiUguali();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimmi il primo numero");
		utente01.num01 = sc.nextInt();
		
		System.out.println("Dimmi il secondo numero");
		utente01.num02 = sc.nextInt();
		
		System.out.println("Dimmi il terzo numero");
		utente01.num03 = sc.nextInt();
		
		utente01.controllaNumeri();
		
		

	}

}
