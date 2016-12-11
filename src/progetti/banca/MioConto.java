package progetti.banca;
/*
*Testo:
	 * Es. 3.1 scrivere un programma che costruisca un conto bancario
	 * 		chiamato mioConto, 
	 * 		versi in esso 1000$, 
	 * 		prelevi da esso $500,
	 * 		prelevi altri 400$ e 
	 * 		infine visualizzi il saldo rimanente
	 * 
	 * 		Il programma deve poi creare un altro conto bancario 
	 * 		chiamato contoMamma, 
	 * 		utilizzando il costruttore che inizializza la variabile bilance.
	 * 		Su quest'ultimo deve essere applicato un interesse del 10% 
	 * 		a seguito del quale viene stampato il saldo
	 * 
	 * 
*/
public class MioConto {
	
	double saldo = 0;
	double tasso = 0;
	
	//metodo per versare denaro
	public double versaDenaro(double denaro){
		this.saldo = denaro;
		return saldo;
	}
	
	//metodo per prelevare denaro
	public double prelevaDenaro(double denaroPrelevato){
		if(saldo < denaroPrelevato){
			System.out.println("Saldo insufficiente!");
		} else {
			this.saldo = (saldo-denaroPrelevato);
			
		}
		return saldo;
	}
	
	//applica interessi
	public void setTasso(double setTasso){
		this.tasso = saldo + (saldo * setTasso);
	}
	
	public double getTasso(){
		System.out.println("Il saldo con gli interessi è: " + tasso);
		return tasso;
	}
	
	
	//leggi il saldo
	public void dammiSaldo(){
		System.out.println("Il saldo è di €: " + saldo);
	}
	

	
	
}
