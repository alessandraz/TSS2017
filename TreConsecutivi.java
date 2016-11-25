/* 
Es 5.4: Scrivere un programma TreConsecutivi 
che prevede un array di 10 numeri interi contenentev alori a piacere(senzabisognodichiederliall’utente) e 
stampa"Tre valori consecuitivi uguali" se l’array contiene tre valori uguali in tre posizioni consecutive, 
oppure stampa "NO" altrimenti. 
(Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)
*/
package Esercizi;

public class TreConsecutivi {

	public static void main(String[] args) {
		
		int [] numInteri = {5, 5, 5, 3, 29, 11, 95, 30, 86};
		boolean controllo = false;
	
		for(int i = 0; i <= 7; i++){
			
			if(numInteri[i]==numInteri[i+1] && numInteri[i+1]==numInteri[i+2]){
				controllo = true;
				
			} 	
		}
		
		if(controllo){
			System.out.println("tre valori consecutivi uguali");
		} else {
			System.out.println("no");
		}

	}

}
