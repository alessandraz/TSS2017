package progetti.dipendenti.v1;

public class Lavoratore {

	private String nome;
	private String cognome;
	private static final double STIPENDIO_BASE = 22;
	
	
	public Lavoratore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		System.out.println("Ho costruito un oggetto di tipo lavoratore");
	}
	
	
	//getter & setters
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @return the stipendioBase
	 */
	public static double getStipendioBase() {
		return STIPENDIO_BASE;
	}
	
	public double calcolaStipendio(int numeroOre){
		return numeroOre * STIPENDIO_BASE;
	}
	
	
	
}
