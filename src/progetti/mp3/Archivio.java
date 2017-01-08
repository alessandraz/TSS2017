package progetti.mp3;
import java.util.ArrayList;
import java.util.Collections;


public class Archivio {
	
	private ArrayList<Brano> elencoBrani;
	private ArrayList<Artista> elencoArtisti;
	private ArrayList<Genere> elencoGeneri;
	private ArrayList<CD> elencoCD;
	
	
	public Archivio() {
		this.elencoBrani = new ArrayList<Brano>();
		this.elencoArtisti = new ArrayList<Artista>();
		this.elencoGeneri = new ArrayList<Genere>();
		this.elencoCD = new ArrayList<CD>();

	}
	
	
	
	//verifico se il brano è già in archivio
	public boolean branoInArch(String titolo, String nomeArtista){
		boolean controllo = false;
		
		for (Brano brano : elencoBrani) {
			if ( (brano.getTitolo().equals(titolo)) && (brano.getArtista().equals(nomeArtista)) ) {
				controllo = true;
			} else {
				controllo = false;
			}
		}
		return controllo;
	}
	
	//verifico se l'artista esiste già
	public boolean artistaInArch(String nomeArtista){
		
		boolean controllo = false;
		
		for(Artista artista : elencoArtisti) {
			if ( (artista.getNomeArtista().equals(nomeArtista)) ) {
				controllo = true;
			} else {
				controllo = false;
			}
		}
		
		return controllo;	
	}
	
	//aggiungo artista
	public void aggiungiArtista(String nomeArtista) {
		
		if(artistaInArch(nomeArtista) != true) {
			elencoArtisti.add(new Artista(nomeArtista));
		}
	}
	
	//aggiungi brano 
	public boolean aggiungiBrano(String nomeArtista, String titolo, double durata) {

		if (branoInArch(titolo, nomeArtista) != true){
			elencoBrani.add(new Brano(nomeArtista, titolo, durata));
			aggiungiArtista(nomeArtista);
			return true;	
		} else {
			return false;
		}
	}
	
	//cerca artista e ritorna tutti i brani
	public void cercaArtista(String nomeArtista){
		
		for (Artista artista : elencoArtisti) {
			
			if (artista.getNomeArtista().equals(nomeArtista)) {
				System.out.println("-------------------");
				System.out.println(nomeArtista + " brani:");
				for (Brano brani : elencoBrani) {
					if (brani.getArtista().equals(nomeArtista)) {
						System.out.println(brani.getTitolo());
					}
				}
			}
		}
	}
	
//	//cerca genere e ritora brani con quel genere
//	public void cercaPerGenere(String genere) {
//		
//		for (Genere generi : elencoGeneri) {
//			
//			if ( (generi.getGenere().equals(genere) )) {
//				System.out.println("-------------------");
//				System.out.println("Risultati richera per genere: " + genere);
//				
//				for (Brano brani : elencoBrani) {
//					if (brani.getGenere().equals(genere)) {
//						System.out.println(brani);
//					}
//				}
//			}
//		}
//	}
	
	//cerca brano e ritorna brano + artista
	public void cercaBrano(String titolo){
		
		for(Brano brani : elencoBrani) {
			
			if(brani.getTitolo().equals(titolo)) {
				System.out.println("-------------------");
				System.out.println("Risultato ricerca:");
				System.out.println(brani);
			}
		}
	}
	
	//cerca cd
	public void cercaCD(String titolo) {
		
		if (elencoCD.isEmpty()) {
			System.out.println("Non è presente nessun CD");
			
		} 
		
		for (CD cd : elencoCD) {
			
			if (cd.getTitolo() != titolo) {
				System.out.println("Nessun risultato");
				
			} else if (cd.getTitolo().equals(titolo)) {
				System.out.println(cd);
			}
			

		}
	}
	
	//verifico se l'album è già in archivio
	public boolean cdInArch(String titoloCD, String artista){
		
		boolean controllo = false;
		
		for (CD cd : elencoCD){
			if (  (cd.getTitolo().equals(titoloCD)) &&  (cd.getArtista().equals(artista))  ) {
				controllo = true;
			}
		}

		return controllo;
	}
	
	
	//aggiungo cd nell'archivio
	public void aggiungiCD(String titoloCD, String artista) {
		
		if(cdInArch(titoloCD, artista) != true) {
			elencoCD.add(new CD(titoloCD, artista));
		}
	}
	
	//assegna un CD ad un brano
	public void setCD(String titoloBrano, String artista, String titoloCD){
		
		for (Brano brano : elencoBrani){
			if (  (brano.getTitolo().equals(titoloBrano)) && (brano.getArtista().equals(artista))  ) {
				brano.setCd(titoloCD);
				aggiungiCD(artista, titoloCD);
			}
		}
	}
	
	//verifica che genere esista gia
	public boolean genereInArch(String genere){
		boolean controllo = false;
		
		for (Genere generi : elencoGeneri){
			if (  generi.getGenere().equals(genere) ) {
				controllo = true;
			}
		}
		
		return controllo;
		
	}
	
	//aggiungi genere nell'elenco dei generi
	public void aggiungiGenere(String genere){
		
		if (genereInArch(genere) != true) {
			elencoGeneri.add(new Genere(genere));
		}
	}
	
	
	//assegna genere ad un brano
	public void setGenere(String titoloBrano, String artista, String genere){
		
		for (Brano brano : elencoBrani) {
			if (  (brano.getTitolo().equals(titoloBrano)) && (brano.getArtista().equals(artista))  ) {
				brano.setGenere(genere);
				aggiungiGenere(genere);
			}
		}
	}
	
	//elenco artisti
	public void elencoArtisti(){
		Collections.sort(elencoArtisti);
		System.out.println("-------------------");
		System.out.println("Elenco Artisti:");
		for (Artista artista : elencoArtisti) {
			System.out.println(artista);
		}
	}
	
	//elenco brani
	public void elencoBrani() {
		Collections.sort(elencoBrani);
		System.out.println("-------------------");
		System.out.println("Elenco brani:");
		for (Brano brano : elencoBrani) {
			System.out.println(brano);
			System.out.println("-------------------");
		}
	}
	
	//elenco CD
	public void elencoCD() {
		Collections.sort(elencoBrani);
		System.out.println("-------------------");
		System.out.println("Elenco CD:");
		for (CD cd : elencoCD) {
			System.out.println(cd);
			System.out.println("-------------------");
		}
	}
	
	//elenco generi
	public void elencoGeneri(){
		Collections.sort(elencoGeneri);
		System.out.println("-------------------");
		System.out.println("Elenco Generi:");
		for (Genere generi : elencoGeneri) {
			System.out.println(generi);
			System.out.println("-------------------");
		}
	}
	
	
	
	
	
	
	
}
