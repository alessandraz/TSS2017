package progetti.tandem;

public class Tandem {

	private String myString;
	
	public Tandem(String myString){
		this.myString = myString;
	}
	
	public boolean tandem(){
		
		boolean check = false;
		
		if((myString.length() % 2) != 0 ) {
			check = false;
			System.out.println("La parola NON è un tandem");
		}
		
		int lunghezza = myString.length();
		int half = (lunghezza / 2);
		String first = myString.substring(0, half);
		String second = myString.substring(half, myString.length());
		

		if(first.equals(second)){
			check = true;
			System.out.println("Parola inserita: " + myString );
			System.out.println("Prima parte: " + first);
			System.out.println("Seconda parte: " + second);
			System.out.println("La parola è un tandem");
		} 
		
		return check;
	}
	
}
