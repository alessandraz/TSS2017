package progetti.negozioAlimentari;
/*
 Realizzare il sistema software per la gestione di un negozio di generi alimentari. 
 Il sistema deve gestire:

1) Gli inventari

La Classe CassaNegozio contiene tutte le funzionalità.

E' possibile definire l'inventario (elencando tutti i tipi di prodotto) 
ed aggiungere nuovi prodotti attraverso il metodo aggiungiProdotto. 
Un prodotto è caratterizzato da un codice univoco, da una descrizione e dal prezzo lordo di vendita. Per esempio:

Codice Descrizione Prezzo

C00001 Pasta Barilla 0.7
C00002 Latte TappoRosso 1.65
C00003 Caffe' Latazza 2.5
C00004 Caffe' Illy 2.0
C00005 Biscotti Cioccolato 2.0
C00006 Vino Rosso 2.0

2) Gli sconti

E' possibile stabilire un prezzo promozionale (sconto) per un particolare prodotto. 
Per semplicità si assuma che è possibile avere un solo prodotto in promozione per volta.

Per attivare la promozione si utilizza il metodo promozione() che riceve come parametri 
il codice del prodotto da promuovere e un intero che indica la percentuale di sconto da applicare 
(e.g., il numero intero 20 indica uno sconto del 20%). 
Per disabilitare la promozione si passa al metodo il codice di un prodotto inesistente.


3) I prodotti venduti

Ogni volta che viene letto il codice di un prodotto, la cassa accede ad un listino di prodotti e 
recupera il prezzo e la descrizione del prodotto. 
Il metodo leggi(), restituisce informazioni sul pezzo acquistato.

E' possibile, in qualsiasi momento, ottenere l'importo totale al lordo delle tasse attraverso il metodo totale(). 
E' inoltre possibile ottenere l'importo totale netto e l'ammontare dell'IVA attraverso i metodi netto() e tasse(). 
Il metodo stampa() permette di stampare a video l'elenco degli articoli venduti; 
la lista è ordinata lessicograficamente. Il metodo chiude() conclude la registrazione dei prodotti venduti.
 */

import java.util.Scanner;

import esempi.week8.DivisionePerZeroException;

public class NegozioAlimentari {

	public static void main(String[] args) throws ProdottoInesistente {
		
		CassaNegozio cassa = new CassaNegozio();
		
		Scanner input = new Scanner(System.in);
		boolean esci = false;
		String codiceProdotto;
		String descrizioneProdotto;
		double prezzoProdotto;
		
		//prodotti di default per test veloci
		cassa.aggiungiProdotto("C00001", "Pasta Barilla", 0.7);
		cassa.aggiungiProdotto("C00002", "Latte TappoRosso", 1.65);
		cassa.aggiungiProdotto("C00003", "Caffe' Lavazza", 4.5);
		cassa.aggiungiProdotto("C00004", "Caffe' Illy", 5);
		cassa.aggiungiProdotto("C00005", "Biscotti Cioccolato", 3.0);
		cassa.aggiungiProdotto("C00006", "Vino Rosso", 9.65);
		
		
		while(esci != true) {
			System.out.println("Inserisci un comando \naggiungi \nsconto \nelenca \nleggi \ncompra \nscontrino \nesci");
			String cmd = input.nextLine();
			
			switch(cmd) {
			
			case "esci":
				esci = true;
				System.out.println("Arrivederci");
				break;
				
			case "aggiungi":
				System.out.println("Inserisci il codice");
				codiceProdotto = input.nextLine();
				
				System.out.println("Inserisci la descrizione");
				descrizioneProdotto = input.nextLine();
				
				System.out.println("Inserisci il prezzo");
				prezzoProdotto = input.nextDouble();
				
				cassa.aggiungiProdotto(codiceProdotto, descrizioneProdotto, prezzoProdotto);
				break;
			
			case "elenca":
				cassa.elencaProdotti();
				break;
			
			case "sconto":
				System.out.println("Inserisci il codice prodotto sul quale vuoi applicare la promozione");
				String codice = input.nextLine();
				
				System.out.println("Inserisci la percentuale dello sconto da applicare");
				int percentuale = input.nextInt();
				
				try {
					cassa.applicaSconto(codice, percentuale);
					}
				catch (ProdottoInesistente e) {
					
					System.out.println("Il prodotto inserito non è disponibile!");
					//e.printStackTrace();
				}
				break;
				
			case "compra":
				
				System.out.println("Inserisci il codice prodotto");
				codiceProdotto = input.nextLine();
				
				cassa.acquistaProdotto(codiceProdotto);
				break;
				
			case "scontrino":
				cassa.leggi();
				break;
				
			default: System.out.println("Comando non valido");
				break;
			
			}
			
		}
		
		
	}

}
