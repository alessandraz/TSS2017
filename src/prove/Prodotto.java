package prove;

public class Prodotto {

	private String codiceProdotto;
	private String descrizioneProdotto;
	private double prezzoProdotto;
	
	
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
	//END getters & setters
	
	
	
	
}
