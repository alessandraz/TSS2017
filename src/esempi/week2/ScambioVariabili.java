package esempi.week2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ScambioVariabili {

	public static void main(String[] args) {
		
		int a;
		int b;
		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci il primo valore intero");
		a = sc.nextInt();
		System.out.println("inserisci il secondo valore intero");
		b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);

	}

}
