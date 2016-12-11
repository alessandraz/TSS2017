package progetti.dipendenti.v1;

public class Fattorino extends Lavoratore {
	
	double premioRisultato = 0.05;

	//costruttore basato sul costruttore di Lavoratore
	public Fattorino(String n, String c){
		
		super(n,c);
		System.out.println("Ho costruito un oggetto di tipo fattorino, sotto-tipo di Lavoratore");
	}

	/* (non-Javadoc)
	 * @see progetti.dipendenti.v1.Lavoratore#calcolaStipendio(int)
	 */
	@Override
	public double calcolaStipendio(int numeroOre) {
	
		double stipendioFattorino = 
				super.calcolaStipendio(numeroOre) + 
				(super.calcolaStipendio(numeroOre)* premioRisultato) ;
		
		return stipendioFattorino;
	}
	
	
}
