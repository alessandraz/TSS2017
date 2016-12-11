package progetti.zaino;

import java.util.Scanner;

//classe che non ritorna niente.. deve solo far partire le cose
//quindi metto tutto nel main

public class ZainoViewer {
	
	public static void main(String[] args) {

		Zaino zaino = new Zaino("New Feel", "Mauro",  5);
		Scanner input = new Scanner(System.in);
		boolean esci = false;
		
		while(!esci){
			System.out.println("Inserisci comando:");
			String comando = input.nextLine();
			
			if(comando.equals("q")){
				esci = true;
			} else if(comando.equals("elenca")){
				zaino.elencaCose();
				
			} else if(comando.equals("metti")){
				System.out.println("Scrivi il nome dell'oggetto da inserire: ");
				String nome = input.nextLine();
				
				System.out.println("Scrivi la descrizione dell'oggetto da inserire: ");
				String desc = input.nextLine();
				Cosa c = new Cosa(nome, desc);
				
				boolean stato = zaino.inserisciCosa(c);
					if(stato)
						System.out.println("elemento inserito correttamente");
					else 
						System.out.println("non ho inserito l'oggetto " + c.getNome() + "perchè lo zaino è già pieno");
				//zaino.inserisciCosa(c);
				
			}	
			else if(comando.equals("prendi")){
				zaino.elencaCose();
				System.out.println("Dammi posizione oggetto da prendere");
				int pos = input.nextInt();
				zaino.prendiCosa(pos);
				
			}	
			
		}

	}

}
