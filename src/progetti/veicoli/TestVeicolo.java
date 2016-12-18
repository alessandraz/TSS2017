package progetti.veicoli;
import esempi.week7.menu.Menu;

public class TestVeicolo {

	public static void main(String[] args) {
		
		Auto auto01 = new Auto("Pippo", "Berlina");
		Moto moto01 = new Moto("Paperino", 2);
		Camion camion01 = new Camion("Pluto", 4);
		
		
		System.out.println("Proprietario: " + auto01.getProprietario() + "\nTipo: " + auto01.getTipo() + "\nMatricola: " + auto01.getMatricola());
		System.out.print("Auto è un'istanza di Veicolo: ");   
		System.out.println(auto01 instanceof Veicolo);
		System.out.println("**********");
		
		System.out.println("Proprietario: " + moto01.getProprietario() + "\nNum Passeggeri: " + moto01.getNumeroPasseggeri() + "\nMatricola: " + moto01.getMatricola());
		System.out.print("Moto è un'istanza di Veicolo: ");  
		System.out.println(moto01 instanceof Veicolo);
		System.out.println("**********");
		
		System.out.println("Proprietario: " + camion01.getProprietario() + "\nNum Assi: " + camion01.getNumeroAssi() + "\nMatricola: " + camion01.getMatricola() );
		System.out.print("Camion è un'istanza di Veicolo: ");  
		System.out.println(camion01 instanceof Veicolo);
		
		
		
		

	}

}
