package esempi.week4;
/*
 Es. 3: Scrivere un programma MezziCasuali 
 che stampa un numero frazionario ottenuto come risultato della chiamata di un metodo ausiliario 
 che al suo interno richiama il metodo di libreria Math.random(). 
 Se il risultato di Math.random() `e minore di 0.5 il metodo lo restituisce così com’`e. 
 Se invece il risultato di Math.random() `e maggiore o uguale a 0.5 il metodo lo restituisce diminuito di 0.5. 
 Il nome del metodo ausiliario pu`o essere scelto a piacere.
 */

public class MezziCasuali {

	double randomNumber;
	double VALORE_DA_SOTTRARRE = 0.5;
	double risultato;
	
	public static void main(String[] args) {
		
		MezziCasuali random01 = new MezziCasuali();
		random01.generaNumero();
		
	
	}
	
	public double generaNumero(){
		
		randomNumber = Math.random();
		
		if(randomNumber < 0.5){
			System.out.println("Il numero generato è minore di 0.5");
			return(randomNumber);
			
			
		} else {
			System.out.println("Il numero generato è maggiore o uguale a 0.5");
			System.out.println("Il numero generato è " + randomNumber);
			System.out.println("Il risultato è " + (randomNumber - 0.5));
			
			return(risultato);
					
		}
			
	}
		
}	
	
		

