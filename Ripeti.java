package esempi.week4;

import java.util.Scanner;

/*
 Es. 1: Scrivere un programma Ripeti che 
 chiede all’utente di inserire una stringa e un numero intero positivo. 
 Entrambe le cose dovranno essere passate a un metodo ausiliario che stamper`a tante copie della stringa 
 quante indicate nel numero inserito dall’utente. 
 Se il numero inserito dall’utente `e negativo il metodo ausiliario stamper`a "ERRORE: numero negativo". 
 Il nome del metodo ausiliario pu`o essere scelto a piacere.
 */
public class Ripeti {
	
	
	String inputStringa = new String();
	int inputInt;
				
	public void stampaStringa(){
		if(inputInt < 0){
			System.out.println("ERRORE: numero negativo!");
		} else {
			
		for(int i = 0, a=1; i <= inputInt -1; i++, a++){
			
			System.out.println(a + ") " + inputStringa);
		}
	}
}			
				
		
		
	
	
}

