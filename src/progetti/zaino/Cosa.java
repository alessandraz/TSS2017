package progetti.zaino;

public class Cosa {

	private String nome;
	private String descrizione;
	
	public Cosa(String nome, String descrizione) {
	
		this.nome = nome;
		this.descrizione = descrizione;
	}
	
	//getter & setters
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	//END getter & setters

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return "\n Oggetto contentuto: " + this.getNome() +  "\n Descrizione dell'oggetto: " + this.getDescrizione();
	}
	
	
	
	
	
}
