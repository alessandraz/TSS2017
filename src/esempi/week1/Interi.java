package esempi.week1;

//errore di conversione da int a byte (perdita di dati)
public class Interi {
	public static void main(String args[]){
		int a = 1280;
		byte b;
		/*cast per forzare il cambiamento
		 se esco dal range, sballa il risultato
		 */
		b = (byte) a;
			
			System.out.println(b);
	}
}
