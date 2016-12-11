/* Es 5.6: Scrivere un programma DueSequenze 
 * che chiede all’utente di inserire due sequenze di stringhe, ciascuna di 5 elementi, 
 * e poi stampa il messaggio "OK" se almeno una stringa della prima sequenza compare anche nella seconda, 
 * altrimenti stampa il messaggio "NO". 
 * Nel caso in cui le due sequenza abbiano almeno una stringa in comune, 
 * i confronti tra le sequenze si devono interrompere non appena una coppia di stringhe uguali viene trovata.
 */

package progetti.esercizi_week4;

import java.util.Scanner;

public class DueSequenze {

	public static void main(String[] args) {
		
		String [] input1 = new String[5];
		String [] input2 = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci prima sequenza strighe");
		for (int i = 0; i<5; i++){
			input1[i] = sc.nextLine();	
		}
		
		System.out.println("inserisci seconda sequenzastringhe");
		for (int x = 0; x<5; x++){
			input2[x] = sc.nextLine();
		
		}
		
		int i = 0;
		boolean controllo = false;
		
		while(i < 5 && ! controllo) {
			int j = 0;
			while (j < 5 && !controllo){
				if(input1[i].equals(input2[j])){
					controllo = true;
				}
				j++;
				i++;
			}
		}
		
		if(controllo){
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		
	}
}