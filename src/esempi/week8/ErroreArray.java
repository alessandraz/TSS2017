package esempi.week8;

public class ErroreArray {
	public static void main(String[] args) {
		
		int[] a = {5,3,6,5,4};
		
		//attenzione al <=...
		try {
			for (int i=0; i<=a.length; i++) {
				
				System.out.println(a[i]);
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("errore array");
		}
		
		
		System.out.println("Ciao"); 
	}
}