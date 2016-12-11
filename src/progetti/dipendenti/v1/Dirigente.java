package progetti.dipendenti.v1;

public class Dirigente extends Lavoratore {

	double premioRisultato = 0.25;
	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		
	}

	/* (non-Javadoc)
	 * @see progetti.dipendenti.v1.Lavoratore#calcolaStipendio(int)
	 */
	
	
	@Override
	public double calcolaStipendio(int numeroOre) {
		
		return super.calcolaStipendio(numeroOre) + 
				(super.calcolaStipendio(numeroOre)* premioRisultato) ;
		
	}
	
	

}
