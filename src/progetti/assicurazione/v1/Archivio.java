package progetti.assicurazione.v1;

import java.util.ArrayList;
import java.util.Scanner;

public class Archivio {
	
	
	private ArrayList<Auto> auto;
	
	public void aggiungiAuto(int targa, Cliente cliente){
		
		auto.add(new Auto(targa, cliente));
	}
	
	public void elencoClienti(){
		int i = 0;
		
		for (Auto auto : auto) {
			System.out.println(auto);
		}
	}
	
	
		
		
}
	
	

	
	
	
	
	
	
	
	
	

