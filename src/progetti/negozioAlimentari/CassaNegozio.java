package progetti.negozioAlimentari;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import esempi.week8.DivisionePerZeroException;


public class CassaNegozio {
	
	
	private static Map<String, Prodotto> prodotti = new HashMap<>();;
	private static List<Prodotto> listaProdotti = new Vector<>();
	
	//aggiungi prodotto
	public void aggiungiProdotto(String codiceProdotto, String descrizioneProdotto, double prezzoProdotto){
		Prodotto prodotto = new Prodotto(codiceProdotto, descrizioneProdotto, prezzoProdotto );
		prodotti.put(prodotto.getCodiceProdotto(), prodotto);
		System.out.println("Ho aggiunto " + prodotto.getDescrizioneProdotto());
	}


	//elenca prodotti
	public void elencaProdotti(){
		for (String string : prodotti.keySet()) {
			
			Prodotto prd = prodotti.get(string);
			System.out.println(
					"\nCodice: " + string + 
					"\nDescrizione: " + prd.getDescrizioneProdotto() + 
					"\nPrezzo: " + prd.getPrezzoProdotto());
			System.out.println("**************************");	
		}
	}
	
	//promozione
	public void applicaSconto(String codice, int percentuale) throws ProdottoInesistente{
	
		Prodotto prd = prodotti.get(codice);
		if (codice == null) {
			throw new ProdottoInesistente("Il prodotto inserito non è disponibile");
		}
		
		double sconto = ((prd.getPrezzoProdotto() * percentuale) / 100);
		
		prd.setPrezzoProdotto(sconto);
		System.out.println("Il prodotto scontato costa: " + sconto);
		System.out.println("**************************");	
		
	}

	//acquista prodotto
	public void acquistaProdotto(String codice){
			
			Prodotto prd = prodotti.get(codice);
			listaProdotti.add(prd);
			prodotti.remove(codice);
	}
	
	
	//scontrino
	public void leggi(){

		if(listaProdotti.isEmpty()){
			System.out.println("Non hai ancora acquistato!");
		}

		for (Prodotto prodotto : listaProdotti) {
			System.out.println(
					"Descrizione prodotto: " + prodotto.getDescrizioneProdotto() + 
					"\nPrezzo prodotto: " +  prodotto.getPrezzoProdotto());
			System.out.println("**************************");
		}
		
		System.out.println("Il totale al netto di iva è: " + totale());
		System.out.println("Il totale è: " + totaleLordo());
	
	}

	
	//totale
	double totale = 0;
	double totaleIva = 0;
	double totaleLordo = 0;
	final double IVA = 22;
	
	//totale--netto
	public double totale(){
		for (Prodotto prodotto : listaProdotti) {
		
			totale += prodotto.getPrezzoProdotto();
		}
		return totale;
	}
	
	//totale--lordo
	public double totaleLordo(){
		totaleIva = (totale * IVA ) / 100;
		totaleLordo = totale + totaleIva;
		return totaleLordo;
	}
	
}
