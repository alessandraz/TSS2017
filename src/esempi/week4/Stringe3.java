package esempi.week4;

import java.util.Scanner;

public class Stringe3 {

	public static void main(String[] args) {
		
		//nella memoria sono state create 2 stringhe
		String s1 = "ciao";
		s1 = s1 + " mondo";
		
		//nella memoria è stata creata solo 1 stringa che viene estesa
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		s2.append(" mondo");
		
		System.out.println(s1);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("componi dei versi");
				
		String input;
		
		s2.delete(0, s2.length());
		
		for (int i = 0; i < 4; i++) {
			input = scanner.next();
			s2.append(i + ")").append(input).append("\n");

		}
		System.out.println(s2);
	}

}
