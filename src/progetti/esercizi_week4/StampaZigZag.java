package progetti.esercizi_week4;
/* 
Es 5.1: Scrivere un programma StampaZigZag che prevede un array di 10 numeri interi
 contenente valori a piacere (senza bisogno di chiederli all’utente) 
 e ne stampa gli elementi secondo il seguente ordine: 
 il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc... 
 Il nome dell’array pu`o essere scelto a piacere. 
 (Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)

 */


public class StampaZigZag {

	public static void main(String[] args) {
		
		int [] numInteri = {23, 14, 7, 93, 49, 2, 28, 4, 83, 13};
		
		for(int i = 0, a = 9; i< 5 && a > 0; i++,a--){
			System.out.println(numInteri[i]);
			System.out.println(numInteri[a]);
		}
		

	}

}
