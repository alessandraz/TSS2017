package progetti.CompagniaAerea;

import java.util.ArrayList;

public class CompagniaAereaTester {

	public static void main(String[] args) {
		
		Volo volo01 = new Volo();
		
		volo01.prenotaPosto("Pippo");
		volo01.prenotaPosto("Pluto");
		volo01.prenotaPosto("Paperino");
		volo01.prenotaPosto("Topolino");
		volo01.prenotaPosto("Minnie");
		volo01.prenotaPosto("Paperina");
		
		volo01.stampaElencoViaggiatori();
		volo01.stampaListaAttesa();
		
		System.out.println("***************");
		
		volo01.annullaPrenotazione("Pippo");
		volo01.stampaElencoViaggiatori();
		volo01.stampaListaAttesa();
		
		System.out.println("***************");
		
		volo01.prenotaPosto("Clarabella");
		volo01.stampaElencoViaggiatori();
		volo01.stampaListaAttesa();
		
		
		

	}

}
