package progetti.veicoli;

public class Camion extends Veicolo{

	private int numeroAssi;
	
	public Camion(String proprietario, int numeroAssi) {
		super(proprietario);
		this.numeroAssi = numeroAssi;
		
	}

	public int getNumeroAssi() {
		return numeroAssi;
	}
	
	

}
