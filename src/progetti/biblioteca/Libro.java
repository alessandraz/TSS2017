package progetti.biblioteca;

public class Libro {

	private String titolo;
	private Abbonato utente;
	private Data dataScadenzaPrestito;
	
	public Libro(String titolo) {
		this.titolo = titolo;
		this.utente = null;
		this.dataScadenzaPrestito = null;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Abbonato getUtente() {
		return utente;
	}

	public void setUtente(Abbonato utente) {
		this.utente = utente;
	}

	public Data getDataScadenzaPrestito() {
		return dataScadenzaPrestito;
	}

	public void setDataScadenzaPrestito(Data dataScadenzaPrestito) {
		this.dataScadenzaPrestito = dataScadenzaPrestito;
	}
	
	@Override
	public String toString(){
		
		return titolo + " " + utente;
	}
	
	
	
	
	
	
}
