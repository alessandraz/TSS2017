package progetti.negozioAlimentari;

public class ProdottoInesistente extends Exception {
	
	public ProdottoInesistente(String message) {
		
		super("Il prodotto inserito non è disponibile!"); 
	}
}
