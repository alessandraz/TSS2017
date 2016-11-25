package progetti.banca;

public class MioContoTester {

	public static void main(String[] args) {
		
		MioConto conto01 = new MioConto();
		
		conto01.versaDenaro(1000);
		conto01.dammiSaldo();
		
		conto01.prelevaDenaro(500);
		conto01.dammiSaldo();
		
		conto01.prelevaDenaro(400);
		conto01.dammiSaldo();
		
		conto01.setTasso(0.1);
		conto01.getTasso();
		
		
		
	}

}
