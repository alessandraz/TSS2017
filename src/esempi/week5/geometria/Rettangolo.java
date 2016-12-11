package esempi.week5.geometria;


public class Rettangolo {

    private Punto angoloSx = null;

    private int base, altezza;

    public Rettangolo(int x, int y, int b, int h){

        angoloSx    = new Punto(x,y);
        base        = b;
        altezza     = h;
        System.out.println(angoloSx);

    }
    public Rettangolo(Punto p, int b, int h){

        angoloSx    = new Punto(p.getX(), p.getY());
        base        = b;
        altezza     = h;

    }
    public int getPerimetro(){
        return (base + altezza) * 2;
    }
    public int getArea(){
        return base * altezza;
    }
    
    @Override
	public String toString() {
		
		return "In find dei conti sono solo un rettangolo";
	}



}