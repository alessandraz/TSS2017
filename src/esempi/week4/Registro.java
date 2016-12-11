package esempi.week4;


public class Registro {
	
	final int POSTAZIONI = 18;
	
	
	Studente[] elenco = new Studente[POSTAZIONI];
	
	public void inizializzaRegistro(){
		elenco[0] = new Studente ("Alessandra", "Zilioli", 'F');
		elenco[1] = new Studente ("Roberto", "Balzano", 'M');
		elenco[2] = new Studente ("Vittorio", "Bellia", 'M');
		elenco[3] = new Studente ("Simone", "Bombaci", 'M');
		elenco[4] = new Studente ("Monica", "Canal Monteagudo", 'F');
		elenco[5] = new Studente ("Sergio", "Marzullo", 'M');
		elenco[6] = new Studente ("Dario", "Mennillo", 'M');
		elenco[7] = new Studente ("Anna", "Messina", 'F');
		elenco[8] = new Studente ("Amedeo", "Minozzi", 'M');
		elenco[9] = new Studente ("Antonio", "Morabito", 'M');
		elenco[10] = new Studente ("Angelo", "Nicosia", 'M');
		elenco[11] = new Studente ("Emilio", "Passannanti", 'M');
		elenco[12] = new Studente ("Barbara", "Ruggirello", 'F');
		elenco[13] = new Studente ("Gabriele", "Sacchet", 'M');
		elenco[14] = new Studente ("Alessandra", "Sorrentino", 'F');
		elenco[15] = new Studente ("Niccolo", "Triscio", 'M');
		elenco[16] = new Studente ("Ferdinando", "Vassallo", 'M');
	}
	
	
	
	
	
	/*
	//ho creato un oggetto di tipo Studente
			//adesso esiste in memoria (allocazione nel registro)
			//e gli viene assegnato un numero
			Studente s1 = new Studente();
			
			//assegno all'oggetto s1 il nome Alessandra (alla proprietà nome
			//ho dato il leteral Alessandra
			//accesso libero sia in modifica che lettura perchè
			//non ho reso privato gli attributi in Studente
			//mutatore
			s1.setNome = ("Alessandra");
			s1.setCognome = ("Zilioli");
					
			//mando in stampa l'oggetto
			System.out.println(s1);
			s1.presentaStudente();
			/*
			System.out.println(s1);
			System.out.println(s1.getNome());
			System.out.println(s1.getCognome());
			System.out.println(s1.getMatricola());
			System.out.println("------------------------------------");
			*/
			
	/*
			Studente s2 = new Studente("Zilioli");
			s2.setNome("Alessandra");
			System.out.println(s2);
			/*
			System.out.println(s2.getNome());
			System.out.println(s2.getCognome());
			System.out.println(s2.getMatricola());
			*/
			/*
			Studente s3 = new Studente("Mario","Rossi");
			System.out.println(s3);
			s3.presentaStudente();
			System.out.println(s3.toString());
			
			/*
			System.out.println(s3.getNome());
			System.out.println(s3.getCognome());
			System.out.println(s3.getMatricola());
			*/
			/*
			System.out.println("------------------------------------");
			
			
			//*************** s1 s2 s3 ho 3 riferimenti, ma due oggetti
			/*
			if (s1 == s2) {
				System.out.println("sono uguali");
			} else {
				System.out.println("sono diversi");
			}
			
			if (s1 == s3) {
				System.out.println("sono uguali");
			} else {
				System.out.println("sono diversi");
			}
			
			if (s1.nome == s2.nome) {
				System.out.println("sono uguali");
			} else {
				System.out.println("sono diversi");
			}
			
			//sono uguali perchè le stringhe sono uguali
			if (s1.nome == s3.nome) {
				System.out.println("sono uguali");
			} else {
				System.out.println("sono diversi");
			}
			*/
		
}
