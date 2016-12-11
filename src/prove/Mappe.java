package prove;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;


public class Mappe {
	
	
	
	private static Map<String, Prodotto> prodotti = new HashMap<>();
	private static List<Prodotto> listaProdotti = new Vector<>();

	public static void main(String[] args) {
		
		//creo prodotti
		Prodotto p1 = new Prodotto("123456", "pasta barilla", 0.78);
		Prodotto p2 = new Prodotto("123457", "pasta dececco", 0.80);
		
		//aggiungo chiave e descrizione prodotto nell'hashmap
		//indicizzando per codice prodotto
		prodotti.put(p1.getCodiceProdotto(), p1);
		prodotti.put(p2.getCodiceProdotto(), p2);
		
		//keySet() ritorna la lista delle chiavi
		for (String string : prodotti.keySet()) {
			System.out.println("Codice prodotto: " + string);
		}
		
		//values() ritorna la lista dei valori
		for (Prodotto prod : prodotti.values()) {
			System.out.println("Descrizione prodotto: " + prod.getDescrizioneProdotto() + " " +
			"Prezzo prodotto: " +  prod.getPrezzoProdotto());
			
			//inserisco in una lista List
			listaProdotti.add(prod);
			System.out.println("Ho aggiunto alla lista: " + prod.getDescrizioneProdotto());
		}
		
		//stampo il valore che corrisponde a una certa chiave 

		for (String string : prodotti.keySet()) {
			
			Prodotto prd = prodotti.get(string);
			System.out.println("Chiave: " + string + " valore:" + prd.getDescrizioneProdotto() + " " + prd.getPrezzoProdotto());
			
		}
		
		//leggo la lista List
		for (Prodotto listaprodotti : listaProdotti) {
			System.out.println(listaprodotti.getCodiceProdotto() + " " + listaprodotti.getDescrizioneProdotto() + " " + listaprodotti.getPrezzoProdotto());
			
		}
		
		
		
		
		
	}
	

}