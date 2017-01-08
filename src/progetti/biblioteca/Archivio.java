package progetti.biblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Archivio {

	private ArrayList<Abbonato> elencoAbbonati;
	private ArrayList<Libro> elencoLibri;
	private Data dataDiOggi;
	
	//private LocalDateTime dataDiOggi = LocalDateTime.now();
	
	public Archivio() {
		this.elencoAbbonati = new ArrayList<Abbonato>();
		this.elencoLibri = new ArrayList<Libro>();
		this.dataDiOggi = dataDiOggi;
	}
	
	//libri
	//aggiunge libro nell'array
	public void nuovoLibro(String unTitolo){
		elencoLibri.add(new Libro (unTitolo));
	}
	
	//stampa elenco libri
	public void stampaElencoLibri(){
		for (Libro libro : elencoLibri) {
			System.out.println(libro.getTitolo());
		}
	}
	
	//utenti
	//aggiunge utente nell'array
	public void nuovoUtente(String unCognome, String unNome){
		elencoAbbonati.add(new Abbonato( unCognome, unNome));
	}
	
	//overload per test
	public void nuovoUtente(Abbonato utente){
		elencoAbbonati.add(utente);
	}
	
	//stampa elenco utenti
	public void stampaElencoUtenti(){
		for (Abbonato abbonato : elencoAbbonati) {
			System.out.println(abbonato.getCognome() + " "+ abbonato.getNome() );
		}
	}
	
	//trova utente
	public int trovaUtente(String unCognome, String unNome){
		int numeroUtente = 0;
		
		for (int i = 0; i < elencoAbbonati.size(); i++) {

			if ( (elencoAbbonati.get(i).getCognome().equals(unCognome)) && (elencoAbbonati.get(i).getNome().equals(unNome))) {
				System.out.println("utente trovato");
				numeroUtente = i;
				System.out.println("utente numero: " + numeroUtente);
				
			} else if ((elencoAbbonati.get(i).getCognome().equals(unCognome)) !=  (elencoAbbonati.get(i).getNome().equals(unNome))) {
				
				System.out.println("utente non trovato");
			}
		}
		return numeroUtente;
	}
	
	//data di scadenza
//	public Data scadenza(Data date) {
//		
//		Data dataInizio = date;
//		Data dataScadenza = new Data();
//		final int GIORNI_MAX = 90;
//		int giornoInizio = date.getDay();
//		
//		dataScadenza.setDay(giornoInizio + GIORNI_MAX));
//		
//		System.out.println(dataScadenza);
//		return dataScadenza;
//	}
	
	//presta libro
	public void presta(String unLibro, Abbonato unUtente) throws ErrUtenteInesistente {
		
		for (Libro libro : elencoLibri) {
			
			if(elencoAbbonati.contains(unUtente)) {
				if ( (libro.getTitolo().equals(unLibro)) && (libro.getUtente() == null)) {
					libro.setUtente(unUtente);
				} 
				
				if (unUtente == null) {
					throw new ErrUtenteInesistente();
				}
			}
			
		}
	}
	
	//elenco libri prestati
	public void elencoLibriPrestati(){
		for (Libro libro : elencoLibri) {
			
			if (libro.getUtente() != null) {
				System.out.println("Titolo: " + libro.getTitolo() + " Utente: " + libro.getUtente());
			}
		}
	}


	//quanti libri ha in prestito un utente
	public int numLibri(Abbonato anAbb){
		int numLibriPrestati = 0;
		
		for (Libro libro : elencoLibri) {
			if (libro.getUtente() != null) {
				if ( (libro.getUtente().getCognome().equals(anAbb.getCognome())) && (libro.getUtente().getNome().equals(anAbb.getNome()))) {
					numLibriPrestati++;
				}
			}
		}
		
		System.out.println(anAbb.getCognome() + " " + anAbb.getNome() +" ha in prestito: " + numLibriPrestati + " libri");

		return numLibriPrestati;
	}
	
}
	
	

	
	
	

