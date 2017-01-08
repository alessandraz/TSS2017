package progetti.CompagniaAerea;

import java.util.ArrayList;

public class Volo {

	private ArrayList<Cliente> posti;
	private ArrayList<Cliente> attesa;
	static final int NUM_PASSEGGERI = 4;
	private int postiPrenotati = 0;
	
	public Volo(){
		posti = new ArrayList<Cliente>();
		attesa = new ArrayList<Cliente>();
	}
	
	
	//prenota un posto
	public void prenotaPosto(String nomeCliente){
		
		if (postiPrenotati < NUM_PASSEGGERI) {
			
			posti.add(new Cliente(nomeCliente));
			postiPrenotati++;
			
		} else {
			attesa.add(new Cliente(nomeCliente));
		}
	}
	
	//annulla prenotazione
	public void annullaPrenotazione(String nomeCliente){
		
		for (int i = 0; i < posti.size(); i++) {
			if ((posti.get(i).getNomeCliente()).equals(nomeCliente)) {
				posti.remove(posti.get(i));
				posti.add(attesa.get(0));
				attesa.remove(0);
				
			}

		}
			
	}
	
	//stampa elenco viaggiatori
	public void stampaElencoViaggiatori(){
		System.out.println("----------------");
		System.out.println("Elenco passeggeri:");
		System.out.println("----------------");
		for (int i = 0; i < posti.size(); i++) {
			System.out.println(posti.get(i));
		}
	}
	
	//stampa lista d'attesa
	public void stampaListaAttesa(){
		System.out.println("----------------");
		System.out.println("Lista d'attesa:");
		System.out.println("----------------");
		for (Cliente cliente : attesa) {
			System.out.println(cliente);
		}
	}
	
}
