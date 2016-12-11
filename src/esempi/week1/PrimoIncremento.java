package esempi.week1;

public class PrimoIncremento {

	public static void main(String[] args) {
		/*posso dichiarare più variabili sulla stessa riga
		e anche non valorizzarle subito
		*/
		int a = 1,b;
		System.out.println("a vale " + a);
		a++;
		System.out.println("Dopo a++ a vale " + a);
		b = a++;
			System.out.println("Dopo b = a++ a vale " + a + " e b vale " + b);
			b = ++a;
			System.out.println("Dopo b = ++a a vale " + a + " e b vale " + b);

	}

}
