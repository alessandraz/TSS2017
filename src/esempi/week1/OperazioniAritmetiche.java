package esempi.week1;

public class OperazioniAritmetiche {

	public static void main(String[] args) {
		
		int i1 = 5; 
		int i2 = 10; 
		int i3;
		double d1 = 5;
		double d2 = 10;
		double d3;
		
		i3 =- i1; //-5
		System.out.println(" -i1 = " + i3);
		
		i3 = i1 + i2; //15
		System.out.println("i1 + i2 = " + i3);
		
		i3 = i1 - i2; //-5
		System.out.println("i1 - i2 = " + i3);
		
		i3 = i1 * i2;//50
		System.out.println("i1 * i2 = " + i3);
		
		i3 = i1 / i2;//errore --devo trasformare in float almeno uno dei due operandi
		System.out.println("i1 / i2 = " + i3);
		System.out.println("i1 * i2 = " + i3);
		float z = (float) i1 / i2;
		System.out.println("int trasformati in float = " + z);
		
		i3 = i1 % i2;
		System.out.println("i1 % i2 = " + i3);

		float f1 = 5;
		float f2 = 10;
		float f3 = f1/f2;
		System.out.println("float 5 diviso 10 = " + f3);
		
		d3 =- d1;
		System.out.println(" -d1 = " + d3);
		d3 = d1 + d2;
		System.out.println("d1 + d2 = " + d3);
		d3 = d1 - d2;
		System.out.println("d1 - d2 = " + d3);
		d3 = d1 * d2;
		System.out.println("d1 * d2 = " + d3);
		d3 = d1 / d2;
		System.out.println("d1 / d2 = " + d3);
		d3 = d1 % d2;
		System.out.println("d1 % d2 = " + d3);
	}

}
