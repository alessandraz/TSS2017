package esempi.week1;

public class ArrayInteri {

	public static void main(String[] args) {
		
		//int ora[]; corretto, ma stile programmatori java è quello sotto
		//dichiaro un array di interi
		int[] ora;
		
		//allocazione in memoria dello spazio
		ora = new int[7];
		
		ora[0] = 10;
		ora[1] = 9;
		ora[2] = 8;
		ora[3] = 7;
		ora[4] = 6;
		ora[5] = 5;
		ora[6] = 4;
		
		for(int i = 0; i < ora.length; i++){
			System.out.println("il giorno " + i + "della settimana lavoro " + ora[i] + "ore");
		}
		

	}

}
