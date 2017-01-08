package progetti.campoTennis;

public class Prenotazione {

	private String unNomeCliente;
	private int oraInizio;
	private int oraFine;
	
	public Prenotazione(String unNomeCliente, int oraInizio, int oraFine) {
		this.unNomeCliente = unNomeCliente;
		this.oraInizio = oraInizio;
		this.oraFine = oraFine;
	}

	public String getUnNomeCliente() {
		return unNomeCliente;
	}

	public int getOraInizio() {
		return oraInizio;
	}
	
	public int getOraFine() {
		return oraFine;
	}
	
	@Override
	public String toString(){
		return "Nome cliente: " + unNomeCliente + "\nOra inizio: " + oraInizio + "\nOra fine: " + oraFine;
	}
	
	
	
	
}
