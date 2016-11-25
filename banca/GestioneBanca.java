package progetti.banca;

public class GestioneBanca {

	public static void main(String[] args) {
		
		Utente utente01 = new Utente("Mario", "Mario123456");
		TerminaleSportello terminale01 = new TerminaleSportello(utente01);
		ContoCorrente conto01 = new ContoCorrente();
		
		
		//terminale01.login();
		utente01.checkPassword();
	
		conto01.versaDenaro(1000);
		conto01.dammiSaldo();
		conto01.prelevaDenaro(500);
		conto01.dammiSaldo();
		conto01.setTasso(2.0);
		conto01.getTasso();

	}

}
