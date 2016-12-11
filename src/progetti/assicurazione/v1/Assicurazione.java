package progetti.assicurazione.v1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Un'assicurazione desidera creare un archivio elettronico in grado di
 * raccogliere informazioni sulle automobili e sui loro proprietari.
 * Si implementi una classe Cliente, avente il nomiativo (stringa) come variabile d'istanza.
 * 
 * una classe Automobile avente come variabili d'istanza
 * il numero di targa della vettura (intero) e
 * un riferimento al proprietario della classe Cliente
 * 
 * Si implementi, infine, la classe Assicurazione
 */

public class Assicurazione {

	public static void main(String[] args) {
		
		Archivio archivio = new Archivio();
		Scanner input = new Scanner(System.in);
		boolean esci = false;
		
		Cliente cliente01 = new Cliente("Mario", "Rossi");
		archivio.aggiungiAuto(1234567, cliente01);
		
		System.out.println(cliente01.getNome());
		archivio.elencoClienti();
		
		/*
		while(!esci){
			System.out.println("Inserisci un comando: \naggiungi \nesci");
			String comando = input.nextLine();
			if(comando.equals("esci")){ 
			esci = true;
			} else if(comando.equals("aggiungi")) {
				System.out.println("Inserisci la targa");
				String targa = input.nextLine();
				
				System.out.println("Inserisci il nome del cliente");
				String nomeCliente  = input.nextLine();
				
				System.out.println("Inserisci il cognome del cliente");
				String cognomeCliente  = input.nextLine();
				
				Cliente cliente = new Cliente(nomeCliente, cognomeCliente);
				
				
				}
			}
			*/
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
