package esempi.week4;

import java.util.Scanner;

import myutil.MioScanner;

public class SoloVocali {

	public static void main(String[] args) {
		
		MioScanner msc = new MioScanner();
		String s = msc.leggiStringa("inserisci una stringa");
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			
			switch(c){
			case 'a': System.out.println(c); break;
			case 'e': System.out.println(c); break;
			case 'i': System.out.println(c); break;
			case 'o': System.out.println(c); break;
			case 'u': System.out.println(c); break;
			case 'A': System.out.println(c); break;
			case 'E': System.out.println(c); break;
			case 'I': System.out.println(c); break;
			case 'O': System.out.println(c); break;
			case 'U': 
				System.out.println(c); break;
				
			
			}
		}
		
	}

}
