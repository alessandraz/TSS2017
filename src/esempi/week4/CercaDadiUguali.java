package esempi.week4;

public class CercaDadiUguali {
	
	static int vittorie = 0;
	static int numeroLanci = 0;
	static double successi = 0.0;
	
	
	public static void main(String[] args) {
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		
		
		for(int i = 0; i < 20; i++, numeroLanci++) {
			
			
			d1.lancia();
			d2.lancia();
				if(d1.faccia == d2.faccia) {
					vittorie++;	
					System.out.println("dado 1: " + d1.faccia + "\t"+  "dado 2: " + d2.faccia + "\t *hai vinto");
			
				} else {
					System.out.println("dado 1: " + d1.faccia + "\t"+  "dado 2: " + d2.faccia );
				}
		}
		
		successi = (double) vittorie / (double) numeroLanci;
		System.out.println("la percentuale di successo è: " + successi);
		}
		
		
	}


