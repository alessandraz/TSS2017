package progetti.esercizi_week4;
/* Es 5.5: Scrivere un programma DoppioUnoDellaltro 
 * che he prevede un array di 10 numeri interi contenente valori a piacere (senza bisogno di chiederli all’utente) 
 * e stampa "Doppio uno dell’altro" se nell’array sono presenti due valori che sono l’uno il doppio dell’altro, 
 * oppure stampa "NO" altrimenti. 
 * (Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell’array)
 
 */
public class DoppioUnoDellaltro {

	public static void main(String[] args) {
		
		int [] numInteri = {5, 10, 5, 3, 6, 12, 20, 30, 86, 10};
		boolean controllo = false;
	
		for(int i = 0; i < 9; i++){
			for(int j = i+1; j < 10; j++){
				if(numInteri[i] == 2 * numInteri[j] || 2 * numInteri[j] == numInteri[i]){
					System.out.println("Doppio uno dell’altro");
					controllo = true;
				}
			}
		}
		if(controllo) {
			System.out.println("Doppio uno dell’altro");
		} else {
			System.out.println("no");
		}
	}
}
