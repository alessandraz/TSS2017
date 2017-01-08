package progetti.concerto;

public class Cliente {

	private String cognome;
	private String numeroTel;
	
	public Cliente(String cognome, String numeroTel) {
		
		this.cognome = cognome;
		this.numeroTel = numeroTel;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	
	@Override
	public String toString(){
		return cognome + " " + numeroTel;
	}
	
	
	
	
}
