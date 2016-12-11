package esempi.week4;

public class StudenteTester {

	public static void main(String[] args) {
		
		Registro registro = new Registro();
		registro.inizializzaRegistro();
		
		/*
		for(Studente s : registro.elenco){
			System.out.println(s);
		}
		
		*/
		
		
		for(int i = 0; i<registro.elenco.length-1; i++ ){
			System.out.println(registro.elenco[i]);
		}

		
	}

}
