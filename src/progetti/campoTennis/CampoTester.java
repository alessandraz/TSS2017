package progetti.campoTennis;

public class CampoTester {

	public static void main(String[] args) {
		
		Campo campo = new Campo();
		
		campo.addPren("mario", 8, 10);
		campo.addPren("maria", 11, 12);
		campo.addPren("pippo", 11, 13);
		campo.addPren("pippo", 13, 14);
		campo.addPren("pluto", 13, 14);
		campo.elencoPrenotazioni();
		
		System.out.println("******************");
		
		campo.removePren("mario", 8, 10);
		campo.removePren("mario", 9, 12);
		campo.elencoPrenotazioni();

	}

}
