package esempi.week4;
/* Es. 2: Scrivere un programma "TuttiUguali" 
 * che chiede all’utente di inserire tre numeri e 
 * stampa"Tutti uguali!" se i tre numeri sono tutti uguali,
 altrimenti stampa"Almeno uno e’ diverso". 
 Il controllo che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario, 
 mentre il messaggio dovrà essere stampato dal metodo main. 
 Il nome del metodo ausiliario può essere scelto a piacere.
 */

public class TuttiUguali {

	int num01;
	int num02;
	int num03; 
	
	public void controllaNumeri(){
		
		if((num01 & num02) == num03){
			
			System.out.println("I tre numeri sono tutti uguali!");
			
		} else {
			
			System.out.println("Almeno un numero è diverso!");
		}
	}
}
