package progetti.veicoli;

public class Auto extends Veicolo {

	private String tipo;
	
	public Auto(String proprietario, String tipo) {
		super(proprietario);
		this.tipo = tipo;
		
	}

	public String getTipo() {
		return tipo;
	}
	

	
	@Override
	public String toString(){
		return  "Proprietario: " + super.getProprietario() + "\n" +
				"Tipo: " + this.getTipo() + "\n" + 
				"Matricola: " + this.getMatricola();
		
		
				
		
		
	}

	
}
