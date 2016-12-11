package esempi.week2;

import java.util.Scanner;

public class SimpleCalcolatrice {

	public static void main(String[] args) {
		
		//domanda all'utente
		double numeroUno = getInput("Inserisci il primo numero");
				
		double numeroDue = getInput("Inserisci il secondo numero");
		
		double somma = numeroUno + numeroDue;
		
		//concatena le due stringhe perchè interpreta il + come concatenatore
		System.out.println("la somma di " + numeroUno + " " + numeroDue + " è " + somma);	
	}
	
	//creo un metodo (funzione) per snellire codice e non ripetermi
	//input.next(); --> cattura la stringa dell'input
	
	/**
	 * Mio metodo per catturare l'input dell'utente
	 * @param domanda Stringa contenente la domanda da inoltrare all'utente
	 * @return un double che rappresenta l'input utente
	 */
	private static double getInput(String domanda) {
		//creo un oggetto per fare richiesta all'utente
		Scanner input = new Scanner(System.in);
		
		int i = domanda.length();
		
		
		System.out.println();
		System.out.println(domanda);
		System.out.println();
		
		for (int j = 0; j < i; j++){
			System.out.print("-");
		}
		
		System.out.println();
		
		/*
		String miaStringa = input.next();
		//trasforma la stringa numerica in numero
		double mioDouble = Double.parseDouble(miaStringa);
		*/
		//prende la stringa e la trasforma in num
		double mioDouble = input.nextDouble();
		return mioDouble;
		
	}
	
	
}
