package esempi.week8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import progetti.aula.v2.Studente;

public class EsempioMappe {
	
	private static Map<String, Studente> studenti= new HashMap<>();
	private static List<Studente>listaStudenti;

	public static void main(String[] args) {
		
		Studente s1= new Studente("Barbara","Ruggirello",'F');
		Studente s2= new Studente("Dario","Mennillo",'M');
		
		listaStudenti=new Vector<>();
		//System.out.println(s1.getMatricola());
		
		studenti.put(s1.getCognome(), s1);//aggiunge il valore nella mappa prendendo indicizzandolo per il cognome 
		studenti.put(s2.getCognome(), s2);//aggiunge il valore nella mappa prendendo indicizzandolo per il cognome 
		
		//values() ritorna la lista dei valori
		for (Studente stud : studenti.values()) {//stampa solo i nomi all'interno della mappa
			System.out.println("Nome:" + stud.getNome());
			
			if(stud.getGenere()=='F'){
				listaStudenti.add(stud);
				System.out.println("Aggiunto alla lista " + stud.getCognome());
			}
			}
		
		//keySet() ritona l'elenco delle chiavi
		for (String string : studenti.keySet()) {
			if(studenti.containsKey(string))
			System.out.println(string);
			Studente std=studenti.get(string);//ritorna l'indice
			System.out.println("Chiave: "+string+ " valore: " + std.getNome() + " " + std.getCognome());
		
		
		

	}

	}
}