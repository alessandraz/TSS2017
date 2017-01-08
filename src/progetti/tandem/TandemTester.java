package progetti.tandem;

public class TandemTester {

	public static void main(String[] args) {
		
		Tandem tandem = new Tandem("stringstring");
		Tandem tandem2 = new Tandem("gatto");

		
		System.out.println(tandem.tandem());
		System.out.println("********************");
		System.out.println(tandem2.tandem());

	}

}
