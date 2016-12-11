package progetti.negozioAlimentari;

public class Prodotto {

	private String codiceProdotto;
	private String descrizioneProdotto;
	private double prezzoProdotto;
	
	//costruttore
	public Prodotto(String codiceProdotto, String descrizioneProdotto, double prezzoProdotto) {
		
		this.codiceProdotto = codiceProdotto;
		this.descrizioneProdotto = descrizioneProdotto;
		this.prezzoProdotto = prezzoProdotto;
	}
	

	//getters & setters
	public String getCodiceProdotto() {
		return codiceProdotto;
	}

	public String getDescrizioneProdotto() {
		return descrizioneProdotto;
	}

	public double getPrezzoProdotto() {
		return prezzoProdotto;
	}

	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}
	
	

	
}
