package progetti.biblioteca;

public class BibliotecaTester {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		System.out.println(data);
		
		data.setDay(1);
		data.setMonth(1);
		data.setYear(2017);
		
		System.out.println(data);
		data.nextDay();
		System.out.println(data);
		
		data.setDay(30);
		data.setMonth(1);
		data.setYear(2017);
		data.nextDay();
		System.out.println(data);
		
		data.setDay(30);
		data.setMonth(12);
		data.setYear(2017);
		data.nextDay();
		System.out.println(data);
		
		Archivio archivio = new Archivio();
		
		
		archivio.nuovoLibro("Harry Potter");
		archivio.nuovoLibro("Harry Potter 2");
		archivio.nuovoLibro("Harry Potter 3");
		archivio.stampaElencoLibri();
		
		archivio.nuovoUtente("Rossi","Pippo");
		archivio.nuovoUtente("Verde","Pluto");
		archivio.stampaElencoUtenti();
		
		
		archivio.trovaUtente("Rossi", "Pippo");
		archivio.trovaUtente("Verde","Pluto");
		archivio.trovaUtente("Neri","Pluto");
	
		System.out.println("******************");
		
		//libri in prestito
		Abbonato utente01 = new Abbonato("Rossi", "Mario");
		Abbonato utente02 = new Abbonato("Rossi", "Antonio");
		archivio.nuovoUtente(utente01);
		archivio.stampaElencoUtenti();
		try {
			archivio.presta("Harry Potter", utente01);
			archivio.presta("Harry Potter 2", utente01);
			archivio.presta("Harry Potter 3", utente02);
		} catch (ErrUtenteInesistente e) {
			
			e.printStackTrace();
			System.out.println("no");
		}
		
		archivio.elencoLibriPrestati();
		
		archivio.numLibri(utente01);
		
		
		
		

	}

}
