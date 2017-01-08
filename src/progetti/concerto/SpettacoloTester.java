package progetti.concerto;

import java.util.ArrayList;

public class SpettacoloTester {

	public static void main(String[] args) {
		
		Spettacolo spettacolo = new Spettacolo(3);
		
		//verifico prenotazioni
		System.out.println("c'è almeno un posto prenotato e una persona in attesa?");
		spettacolo.incompleto();
		System.out.println("********************");
		
		spettacolo.prenota("Pippo", "123456");
		spettacolo.prenota("Pluto", "245671");
		spettacolo.prenota("Topolino", "295029");
		spettacolo.prenota("Paperino", "285028");
		spettacolo.prenota("Paperina", "69248");
		
		spettacolo.stampaPrenotati();
		spettacolo.stampaListaAttesa();
		System.out.println("********************");
		
		//trova utente
		System.out.println("trova l'utente");
		spettacolo.trova("Pippo", "123456");
		spettacolo.trova("Paperino", "285028");
		spettacolo.trova("Paperino", "285028");
		spettacolo.trova("Paperino", "726276");
		System.out.println("********************");
		
		//annulla prenotazione
		System.out.println("dopo annullamento prenotazione");
		spettacolo.disdici("Pippo", "123456");
		spettacolo.stampaPrenotati();
		spettacolo.stampaListaAttesa();
		System.out.println("********************");
		
		//verifico prenotazioni
		System.out.println("c'è almeno un posto prenotato e una persona in attesa?");
		spettacolo.incompleto();
		
		
		
		

	}

}
