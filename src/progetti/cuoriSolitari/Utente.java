package progetti.cuoriSolitari;

import java.util.Scanner;

/* Progetto cuori solitari v. 0.1
 Si richiede lo sviluppo di un programma che verifica la possibile
affinità tra due cuori solitari in base ad alcuni dati personali

- uno pseudonimo
- il sesso
- l'età

Il programma, dopo aver presentato un saluto iniziale, richiede i dati di
due soggetti e presenta a video un messaggio del tipo: "xxx (non) 
è potenzialmente affine con YYY" dove xxx e yyy sono gli pesudonimi dei du eosggetti

Nella versione 0.0 due soggetti sono affiti se:
- sono di sesso diverso
- la differenza di età è minore di una certa soglia (stabilita com
costante a discrezione del programmatore)

1) identificazione delle classi necessarie
2) individuare una classe (istanziabile) per rappresentare ciascun "cuore solitario"
3) una classe (tutta static) per il main e per altri metodi di utilità
specifici del problema (p.e il saluto, la creazione di un cuore solitario) 
(scanner)
4) una classe(tutta static) per metodi di utilità generale,
quali letture 

*/


public class Utente {
	
	private String pseudonimo;
	private String sesso;
	private int eta;
	private final int DIFFERENZA_ETA = 8;
	
	//getters & setters
	public String getPseudonimo() {
		return pseudonimo;
	}

	public String getSesso() {
		return sesso;
	}

	public int getEta() {
		return eta;
	}
	// END getters & setters
	
	
	public Utente(String pseudonimo, String sesso, int eta){
		this.pseudonimo = pseudonimo;
		this.sesso = sesso;
		this.eta = eta;
		
	}


	public boolean affinita(Utente utente){
		int differenza = Math.abs(this.eta - utente.eta);
		
		if(this.sesso.equals(utente.sesso)){
			System.out.println("Non siete compatibili");
			return false;
		}
		if(differenza <=  DIFFERENZA_ETA){
			System.out.println("Siete compatibili");
			return true;
		} else {
			System.out.println("Non siete compatibili");
			return false;
			
		}
		
	}
	
	@Override
	public String toString(){
		return ("Utente: " + this.getPseudonimo() + " " + this.getSesso() + " " + this.getEta());
	}
	
	

	
}
