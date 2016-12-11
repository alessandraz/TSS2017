package esempi.week2;

public class QuarantaquattroGatti {

	public static void main(String[] args) {
		
		String gatti ="Quarantaquattrogattinfilaperseicolrestodidue";
		
		System.out.println("length = " + gatti.length());
		
		////////
		
		for(int i = 1, a = 0; i <= gatti.length(); i++, a++){
			
			System.out.print(gatti.charAt(a));
			
			if(i % 6 == 0){
				
				
				System.out.println();
				System.out.println("*****");
				System.out.println();
			}
			
		}
		
		////////
		
		
		////////
		/*
			for(int i = 1; i < gatti.length(); i++){
				
				System.out.print(gatti.charAt(i));
				
				if(i % 6 == 0){
					
					
					System.out.println();
					System.out.println("*****");
					System.out.println();
				}
				
			}
			*/
		////////

	}

}
