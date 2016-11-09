package esempi.week4;
/*
 Es. 4: Scrivere un programma Concatena 
 che chiede all’utente di inserire tre singole parole 
 e le ristampa interponendovi un asterisco. 
 Per esempio, se l’utente inserisce "gatto", "cane" e "topo" 
 il programma stamperà gatto*cane*topo. 
 La concatenazione delle tre parole 
 dovrà essere fatta utilizzando un metodo ausiliario 
 che prende due stringhe e restituisce la stringa ottenuta concatenando 
 la prima parola ricevuta, un asterisco e la seconda parola ricevuta.
 */
public class Concatena {

	String parola1;
	String parola2;
	String parola3;
	
	
	
	
	final char SYMBOL  = '*';
	
	public String concatena(){
		
		String parola4 = parola1 + "*" + parola2 + "*" + parola3;
		
		return(parola4);
		
		
	}

	
}
