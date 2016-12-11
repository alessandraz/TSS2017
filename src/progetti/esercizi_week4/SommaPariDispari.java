package progetti.esercizi_week4;

public class SommaPariDispari {

	public static void main(String[] args) {
		
		
		int risSommaPari = 0;
		int risSommaDispari = 0;
		int [] numInteri = {12, 182, 44, 3, 29, 11, 95, 30, 86};
		
		
		// somma pari
		for(int i= 0; i < numInteri.length; i++){
			
			if(numInteri[i] % 2 == 0){
				risSommaPari += numInteri[i];
				
				
			}
		}
		
		// somma dispari
		for(int i= 0; i < numInteri.length; i++){
			
			if(numInteri[i] % 2 != 0){
				risSommaDispari += numInteri[i];
				
				
			}
		}
		
		System.out.println("la somma dei numeri pari è " + risSommaPari);
		System.out.println("la somma dei numeri pari è " + risSommaDispari);
		
		if (risSommaPari == risSommaDispari){
			System.out.println("la somma dei numeri pari è uguale alla somma dei numeri dispari");
		} else {
			System.out.println("la somma dei numeri pari è diversa dalla somma dei numeri dispari");
		}
		
		
		
		
	}

}
