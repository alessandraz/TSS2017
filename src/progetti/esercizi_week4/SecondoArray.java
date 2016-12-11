/*Es 5.3: Scrivere un programma SecondoArray 
 * che chiede all’utente di inserire 10 numeri interi 
 * e li memorizza in un array. 
 * Successivamente, crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall’utente.
 *  Copia tutti i valori maggiori o uguali a zero nel nuovo array 
 *  e ne stampa i valori in ordine inverso.
 
 */
package progetti.esercizi_week4;

import java.util.Scanner;

public class SecondoArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int [] interi = new int[10];
		int contaPositivi = 0;
		
		
		System.out.println("Inserisci 10 numeri");
			
		for(int i = 0; i < 10; i++){
			interi [i] = sc.nextInt();	
			if(interi[i] >= 0){
				contaPositivi++;
			}
		}
		System.out.println("i positivi sono " + contaPositivi);
		
		int [] interi2 = new int[contaPositivi];
		int j = 0;
		for (int x : interi) {
			if (x >= 0){
				interi2[j] = x;
				j++;
			}
		}
		
		for(int i = interi2.length-1; i>= 0; i--){
			System.out.println(interi2[i]);
		}
	
	
	
			
		
}
	
		
}
