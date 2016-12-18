package progetti.veicoli;

public class Moto extends Veicolo{
	
	private int numeroPasseggeri;

	public Moto(String proprietario, int numeroPasseggeri) {
		super(proprietario);
		this.numeroPasseggeri = numeroPasseggeri;
		
	}

	public int getNumeroPasseggeri() {
		return numeroPasseggeri;
	}
	
	

	
	
	
}
