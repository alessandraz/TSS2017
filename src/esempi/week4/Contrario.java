package esempi.week4;

import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
		
		System.out.println("Inserisci una stringa");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
					
		for(int i = input.length()-1; i > 0; i--){
			System.out.print(input.charAt(i));
		}
		
		
		
		

	}

}
