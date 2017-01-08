package progetti.CompagniaAerea;

public class Cliente {

	private String nomeCliente;
	
	public Cliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	
	@Override
	public String toString(){
		return nomeCliente;
	}
	
	
}
