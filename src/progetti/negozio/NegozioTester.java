package progetti.negozio;

import java.util.Scanner;

public class NegozioTester {

	public static void main(String[] args) {
		
		Negozio negozio = new Negozio("gelateria", "Alessandra");
		negozio.setIndirizzo("Via Roma, 1");
		negozio.setTelefono("011-1234567");
		negozio.setSito("www.miosito.it");
		
		Scanner input = new Scanner(System.in);
		boolean esci = false;
		
		
		while(!esci){
			System.out.println("Inserisci un comando: \nnegozio \naggiungi \nelenca \nacquista \nincasso \nesci");
			String comando = input.nextLine();
			
			if(comando.equals("esci")){
				esci = true;
			} else if(comando.equals("negozio")) {
				System.out.println(negozio.getNome());
				System.out.println(negozio.getNomeNegoziante());
				System.out.println(negozio.getIndirizzo());
				System.out.println(negozio.getTelefono());
				System.out.println(negozio.getSito());
				
			} else if (comando.equals("aggiungi")){
				
				System.out.println("Inserisci il nome del prodotto");
				String nome = input.nextLine();
				
				System.out.println("Inserisci il prezzo del prodotto");
				Double prezzo = input.nextDouble();
				
				Prodotto prodotto = new Prodotto(nome, prezzo);
				negozio.aggiungiProdotto(prodotto);

			} else if (comando.equals("elenca")){
				negozio.elencaProdotti();
			} else if (comando.equals("acquista")){
				System.out.println("Inserisci il numero del prodotto che vuoi acquistare");
				int posizione = input.nextInt();
				negozio.vendiProdotto(posizione);
				negozio.elencaProdotti();
			} else if(comando.equals("incasso")){
				System.out.println("L'incasso del negozio è: " + negozio.getIncasso());
			}
		}
		
		
		
	}

}
