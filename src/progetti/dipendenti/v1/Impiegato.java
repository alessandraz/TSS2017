package progetti.dipendenti.v1;

public class Impiegato extends Lavoratore {
	
	//è disponibile solo per Impiegato e non per Lavoratore
	double premioRisultato = 0.10;

	//costruttore basato sul costruttore di Lavoratore
	public Impiegato(String n, String c){
		
		//rischio conflitto tra metodi
		//bisogna essere chiari con compilatore
		super(n,c);
		System.out.println("Ho costruito un oggetto di tipo impiegato, sotto-tipo di Lavoratore");
	}

	/* (non-Javadoc)
	 * @see progetti.dipendenti.v1.Lavoratore#calcolaStipendio(int)
	 */
	@Override
	public double calcolaStipendio(int numeroOre) {
		
		//2200
		double stipendioImpiegato = 
				super.calcolaStipendio(numeroOre) + 
				(super.calcolaStipendio(numeroOre)* premioRisultato);
		
		//2420
		
		//operatore
		stipendioImpiegato = (numeroOre > 90) ? (stipendioImpiegato += premioRisultato) : stipendioImpiegato;
		
		return stipendioImpiegato;
	}
	
	
}
