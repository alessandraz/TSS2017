package progetti.campoTennis;

import java.util.ArrayList;

public class Campo {

	private ArrayList<Prenotazione> elencoPrenotazioni;
	
	public Campo(){
		elencoPrenotazioni = new ArrayList<Prenotazione>();
	}
	

	//controllo che il campo sia disponibile
	public boolean controlloCampo(int oraInizio, int oraFine){
		
		boolean controllo = false;
		
		if (elencoPrenotazioni.isEmpty()) {
			controllo = true;
		}
		
		for (Prenotazione prenotazione : elencoPrenotazioni) {
			if ( (prenotazione.getOraInizio() == oraInizio ) && (prenotazione.getOraFine()) == oraFine ){
				controllo = false;
				
			} else if  ( (prenotazione.getOraInizio() != oraInizio ) && (prenotazione.getOraFine()) != oraFine ) {
				controllo = true;
			}
		}
		return controllo;
	}
	
	//aggiungi prenotazione
	public boolean addPren(String unNomeCliente, int oraInizio, int oraFine) {
		
		boolean prenotazione = false;
		
		if (controlloCampo(oraInizio, oraFine)) {
			elencoPrenotazioni.add(new Prenotazione(unNomeCliente, oraInizio, oraFine));
			prenotazione = true;
		}
		
		return prenotazione;
		
	}
	
	
	//controllo che la prenotazione esista 
	public boolean controlloPren(String unNomeCliente, int oraInizio, int oraFine) {
		boolean controlloPrenotazione = false;
		
		for (Prenotazione prenotazione : elencoPrenotazioni) {
			
			if ( (prenotazione.getUnNomeCliente().equals(unNomeCliente)) &&
					(prenotazione.getOraInizio() == oraInizio) &&
					(prenotazione.getOraFine() == oraFine)
				) {
				controlloPrenotazione = true;
			}
		}

		return controlloPrenotazione;
	}
	
	
	//rimuovi prenotazione
	public boolean removePren(String unNomeCliente, int oraInizio, int oraFine) {
		
		boolean annulla = false;
		
		if (controlloPren(unNomeCliente, oraInizio, oraFine)) {
			for (int i = 0; i < elencoPrenotazioni.size(); i++) {
				if ( (elencoPrenotazioni.get(i).getUnNomeCliente().equals(unNomeCliente)) && 
					(elencoPrenotazioni.get(i).getOraInizio() == oraInizio)  &&
					(elencoPrenotazioni.get(i).getOraFine() == oraFine)
						){
					elencoPrenotazioni.remove(i);
					annulla = true;
				}
			}
		}
		
		

		return annulla;
	}
	
	//stampa prenotati
	public void elencoPrenotazioni(){
		for (Prenotazione prenotazione : elencoPrenotazioni) {
			System.out.println("-------------------");
			System.out.println("Elenco prenotazioni:");
			System.out.println(prenotazione);
			System.out.println("-------------------");
		}
	}
}
