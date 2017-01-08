package progetti.mp3;


public class Mp3Tester {

	public static void main(String[] args) {
		
		
		Archivio archivio = new Archivio();
		
		archivio.aggiungiBrano("Sum 41", "War", 1.40);
		archivio.aggiungiBrano("Sum 41", "Sick of everyone", 3.10);
		archivio.aggiungiBrano("Blink-182", "Always", 2.20);
		archivio.aggiungiBrano("Blink-182", "Adam's Song", 2.40);
		archivio.aggiungiBrano("Blink-182", "War", 1.50);
		
		
		archivio.elencoBrani();
		archivio.elencoArtisti();
		
		archivio.cercaArtista("Blink-182");
		archivio.cercaArtista("Sum 41");
		
		archivio.cercaBrano("War");
		
		
		archivio.setCD("Sick of everyone", "Sum 41", "Screaming Bloody Murder");
		archivio.setCD("Adam's Song", "Blink-182", "Enema of the State");
		archivio.setCD("lady oscar", "Cristina D'Avena", "Fivelandia");
		archivio.cercaBrano("Sick of everyone");
		
		System.out.println("RISULTATI PER CD:");
		archivio.cercaCD("Screaming Bloody Murder");
		
		System.out.println("***************************");
		System.out.println("elenco CD:");
		archivio.elencoCD();
		
		System.out.println("Elenco brani dopo aver settato CD");
		archivio.elencoBrani();
		
		System.out.println("***************************");
		System.out.println("Elenco brani dopo aver settato il genere:");
		archivio.setGenere("War", "Sum 41", "punk-rock");
		archivio.elencoBrani();
		
		archivio.elencoCD();
		
		archivio.elencoGeneri();
		
		System.out.println("***************************");
		System.out.println("Cerca per genere:");
		//archivio.cercaPerGenere("punk-rock");
		
		

	}

}
