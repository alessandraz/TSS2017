package progetti.concerto;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;


public class Spettacolo {

	private Cliente[] prenotazioni; //clienti che hanno il posto
	private int n_prenotazioni;
	private ArrayList<Cliente> attesa; //clienti in lista d'attesa
	
	public Spettacolo(int n){
		prenotazioni = new Cliente [n];
		attesa = new ArrayList<Cliente>();
		n_prenotazioni = 0;
	}
	
	//controlla che ci siano ancora posti disponibili
	public boolean libero(){

		if (n_prenotazioni < prenotazioni.length ) {
			return true;
		} else {
			return false;
		}
	}
	
	//prenota un posto
	public void prenota(String cognome, String tel){
		if (n_prenotazioni < prenotazioni.length ) {
			prenotazioni[n_prenotazioni] = new Cliente(cognome, tel);
			n_prenotazioni++;
			
		} else {
			attesa.add(new Cliente(cognome, tel));
		}
	}
	
	//stampo elenco prenotati
	public void stampaPrenotati(){
		System.out.println("-----------------");
		System.out.println("Elenco prenotati:");
		System.out.println("-----------------");
		for (int i = 0; i < prenotazioni.length; i++) {
			System.out.println(prenotazioni[i]);
		}
	}
	
	//stampo lista d'attesa
	public void stampaListaAttesa(){
		System.out.println("-----------------");
		System.out.println("In attesa:");
		System.out.println("-----------------");
		for (int i = 0; i < attesa.size(); i++) {
			System.out.println(attesa.get(i));
		}
	}
	
	//trova un cliente e verifica se ha il posto o è in attesa
	public int trova(String nome, String tel){
		int check = -1;
		
		for (int i = 0; i < prenotazioni.length; i++) {
			if ((prenotazioni[i].getCognome().equals(nome)) && (prenotazioni[i].getNumeroTel()).equals(tel)) {
				System.out.println("il cliente ha il posto");
				check = 0;
			} else if ((prenotazioni[i].getCognome().equals(nome)) != (prenotazioni[i].getNumeroTel()).equals(tel)){
				System.out.println("cliente non trovato");
			}
		}
		
		for (Cliente cliente : attesa) {
			if( (cliente.getCognome()).equals(nome) && (cliente.getNumeroTel()).equals(tel) ) {
				System.out.println("il cliente è in lista d'attesa");
				check = 1;
			}	else if ( (cliente.getCognome()).equals(nome) != (cliente.getNumeroTel()).equals(tel) ){
				System.out.println("cliente non trovato");
			}
		}
		
		//check = -1;
		System.out.println(check);
		return check;
	}
	
	//se un cliente disdice viene eliminato dall'array
	//il primo cliente in attesa viene spostato nei prenotati
	public void disdici(String nome, String tel){
		
		int clientIndex = 0;
				
		for (int i = 0; i < prenotazioni.length; i++) {
			if (prenotazioni[i].getCognome().equals(nome) && prenotazioni[i].getNumeroTel().equals(tel)){
				
//				String x = prenotazioni[i].toString();
//				int y = Integer.parseInt(x);
//				clientIndex = y;
				
				prenotazioni[i] = null;
				prenotazioni[i] = attesa.get(0);
			}	
		}
		
		for (Cliente cliente : attesa) {
			
			attesa.remove(0);
		}
	}

	//verifica che ci sia almeno un posto prenotato e una persona in attesa (true)
	//in caso contrario (false)
	public boolean incompleto(){
		
		boolean check = false;
		
		for (int i = 0; i < prenotazioni.length; i++) {
			if((prenotazioni.length >= 1) && (attesa.size() >= 1)) {
				check = true;
			} else {
				check = false;
			}
		}
		System.out.println(check);
		return check;
	}
}
