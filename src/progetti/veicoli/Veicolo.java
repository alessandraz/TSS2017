package progetti.veicoli;

public class Veicolo {

	
	private String proprietario;
	private int matricola  = 0;
	private static int matricolatore = 1;
	
	
	public Veicolo(String proprietario) {
		
		this.proprietario = proprietario;
		this.setMatricola();
	}


	//getters & setters

	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public int getMatricola() {
		return matricola;
	}

	public void setMatricola() {
		this.matricola = matricolatore++;	
	}
	
	//
	
	
	
	
	
	
	
	
	
	
}
